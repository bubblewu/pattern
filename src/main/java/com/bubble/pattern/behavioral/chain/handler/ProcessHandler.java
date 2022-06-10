package com.bubble.pattern.behavioral.chain.handler;

/**
 * 预处理
 *
 * @author wu gang
 * date: 2022-06-10 17:56
 **/
public class ProcessHandler extends AbstractHandler {
    @Override
    public void handler() {
        System.out.println("【步骤二】执行预处理...");

        // 下一个业务流程存在，则继续执行
        if (this.next != null) {
            this.next.handler();
        }
    }
}
