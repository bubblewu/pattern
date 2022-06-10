package com.bubble.pattern.structural.adapter.interfaces;

/**
 * 接口的适配器模式
 *
 * @author wu gang
 * date: 2022-01-05 18:05
 **/
public class InterfaceTest {

    public static void main(String[] args) {
        ISource sourceA = new SourceSubA();
        sourceA.method();
        sourceA.newMethod();

        System.out.println("------");

        ISource sourceB = new SourceSubB();
        sourceB.method();
        sourceB.newMethod();

    }

}
