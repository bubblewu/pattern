package com.bubble.pattern.singleton.eager;

/**
 * 饿汉模式：线程安全
 * 创建类的唯一实例,在类加载的时候就会创建这个类的实例，
 * 就像饿了的人，迫不及待的想先吃到东西。
 * @author wugang
 * date: 2018-06-25 21:47
 **/
public class EagerSingleton {
    // 1. 将构造方法私有化，不允许外部直接创建对象
    private EagerSingleton(){}

    // 2.创建类的唯一实例,在类加载的时候就会创建这个类的实例
    private static EagerSingleton instance = new EagerSingleton();

    // 3. 提供一个用于获取实例的方法
    public static EagerSingleton getInstance() {
        return instance;
    }
}
