package com.bubble.pattern.behavioral.chain.handler;

/**
 * 初始化
 *
 * @author wu gang
 * date: 2022-06-10 17:56
 **/
public class InitHandler extends AbstractHandler {

    @Override
    public void handler() {
        System.out.println("【步骤一】执行初始化操作...");

        // 下一个业务流程存在，则继续执行
        if (this.next != null) {
            this.next.handler();
        }
    }

}
