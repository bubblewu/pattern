package com.bubble.pattern.behavioral.chain.handler;

/**
 * 保存
 *
 * @author wu gang
 * date: 2022-06-10 17:56
 **/
public class SaveHandler extends AbstractHandler {
    @Override
    public void handler() {
        System.out.println("【步骤三】保存数据...");

        // 下一个业务流程存在，则继续执行
        if (this.next != null) {
            this.next.handler();
        }
    }
}
