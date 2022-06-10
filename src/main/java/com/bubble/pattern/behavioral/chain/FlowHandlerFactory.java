package com.bubble.pattern.behavioral.chain;

import com.bubble.pattern.behavioral.chain.handler.AbstractHandler;

/**
 * 业务处理中心
 *
 * @author wu gang
 * date: 2022-06-10 17:54
 **/
public class FlowHandlerFactory {

    private static IFlow flow = new FlowImpl();

    /**
     * 获取开始的第一个处理器，并装配整个责任链的处理器
     *
     * @return AbstractHandler
     */
    public static AbstractHandler getStartHandler() {
        FlowEnum firstFlow = flow.getFirst();
        AbstractHandler startHandler = getHandler(firstFlow);
        if (startHandler == null) {
            return null;
        }

        FlowEnum tempFlow = firstFlow;
        AbstractHandler tempHandler = startHandler;
        Integer nextHandlerId = null;
        // 迭代遍历所有的handler，将其链接起来
        while ((nextHandlerId = tempFlow.getNextHandlerId()) != null) {
            FlowEnum nextFlow = flow.getFlow(nextHandlerId);
            AbstractHandler nextHandler = getHandler(nextFlow);

            assert tempHandler != null;
            tempHandler.setNext(nextHandler);
            tempHandler = nextHandler;
            tempFlow = nextFlow;
        }

        return startHandler;
    }

    /**
     * 基于反射获取约定的处理器
     *
     * @param flowEnum 约定枚举
     * @return AbstractHandler
     */
    private static AbstractHandler getHandler(FlowEnum flowEnum) {
        String className = flowEnum.getClazz();
        try {
            Class<?> clazz = Class.forName(className);
            return (AbstractHandler) clazz.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

}
