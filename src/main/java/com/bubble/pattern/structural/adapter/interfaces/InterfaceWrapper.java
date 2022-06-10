package com.bubble.pattern.structural.adapter.interfaces;

/**
 * 中间包装类，实现目标接口，其他类继承该类。
 * 这样，其他类就可以实现目标接口的一个或者多个方法，而不是实现全部方法，避免代码浪费冗余
 *
 * @author wu gang
 * date: 2022-01-05 18:09
 **/
public abstract class InterfaceWrapper implements ISource {
    @Override
    public void method() {

    }

    @Override
    public void newMethod() {

    }
}
