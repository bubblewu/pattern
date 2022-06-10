package com.bubble.pattern.behavioral.chain;


import lombok.Getter;

/**
 * 业务流程定义
 *
 * @author wu gang
 * date: 2022-06-10 17:32
 **/
@Getter
public enum FlowEnum {
    /**
     * 责任链：业务流程 & 处理器 & 处理顺序定义
     */
    INIT(1, "初始化", "com.bubble.pattern.behavioral.chain.handler.InitHandler", null, 2),
    PROCESS(2, "预处理", "com.bubble.pattern.behavioral.chain.handler.ProcessHandler", 1, 3),
    SAVE(3, "保存", "com.bubble.pattern.behavioral.chain.handler.SaveHandler", 2, null);

    /**
     * 业务流程ID
     */
    private final Integer id;
    private final String name;
    /**
     * 业务实现类（全限定名）
     */
    private final String clazz;
    /**
     * 当前流程的前置流程
     */
    private final Integer preHandlerId;
    /**
     * 当前流程的后置流程
     */
    private final Integer nextHandlerId;


    FlowEnum(Integer id, String name, String clazz,
             Integer preHandlerId, Integer nextHandlerId) {
        this.id = id;
        this.name = name;
        this.clazz = clazz;
        this.preHandlerId = preHandlerId;
        this.nextHandlerId = nextHandlerId;
    }

}
