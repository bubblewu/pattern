package com.bubble.pattern.structural.adapter.interfaces;

/**
 * 继承抽象类InterfaceWrapper，间接实现ISource接口中的某个方法
 *
 * @author wu gang
 * date: 2022-01-05 18:08
 **/
public class SourceSubB extends InterfaceWrapper {

    @Override
    public void newMethod() {
        System.out.println("SourceSubB执行接口的newMethod方法");
    }
}
