package com.bubble.pattern.behavioral.chain;

import com.bubble.pattern.behavioral.chain.handler.AbstractHandler;

/**
 * @author wu gang
 * date: 2022-06-10 18:24
 **/
public class ChainTest {

    public static void main(String[] args) {
        // 责任链装配：构造当前处理器，及其next
        // init -> process -> save
        AbstractHandler handler = FlowHandlerFactory.getStartHandler();
        assert handler != null;
        // 按约定顺序，启动责任链上的处理器
        handler.handler();
    }

}
