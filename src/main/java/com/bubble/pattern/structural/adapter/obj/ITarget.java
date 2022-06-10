package com.bubble.pattern.structural.adapter.obj;

/**
 * 目标接口
 *
 * @author wu gang
 * date: 2022-01-05 17:39
 **/
public interface ITarget {

    /**
     * 与原类中的方法相同，如 Source 类中的方法名称
     */
    void method();

    /**
     * 新类的方法
     */
    void newMethod();

}
