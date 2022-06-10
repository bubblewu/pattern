package com.bubble.pattern.structural.adapter.clazz;

/**
 * 目标接口
 *
 * @author wu gang
 * date: 2022-01-05 17:39
 **/
public interface ITargetClazz {

    /**
     * 与原类中的方法相同，如SourceMethod类中的方法名称
     */
    void method();

    /**
     * 新类的方法
     */
    void newMethod();

}
