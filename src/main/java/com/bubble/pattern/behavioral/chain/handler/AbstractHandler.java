package com.bubble.pattern.behavioral.chain.handler;

/**
 * 抽象处理器
 *
 * @author wu gang
 * date: 2022-06-10 17:57
 **/
public abstract class AbstractHandler {

    /**
     * 当前处理流程的下一个处理器
     */
    protected AbstractHandler next;

    public void setNext(AbstractHandler next) {
        this.next = next;
    }

    /**
     * 业务处理
     */
    public abstract void handler();

}
