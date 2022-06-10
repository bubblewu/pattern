package com.bubble.pattern.structural.adapter.clazz;

/**
 * 适配器
 *
 * @author wu gang
 * date: 2022-01-05 18:23
 **/
public class SourceAdaptor extends SourceMethod implements ITargetClazz {
    /**
     * 需注释掉，否则会覆盖父类SourceMethod中的method方法
     */
//    @Override
//    public void method() {
//    }

    @Override
    public void newMethod() {
        System.out.println("执行适配后的newMethod方法");
    }
}
