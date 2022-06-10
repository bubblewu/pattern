package com.bubble.pattern.creational.singleton.lazy;

import java.io.Serializable;

/**
 * 线程安全的懒汉模式
 * 先判断实例化对象是否为null，如果不为null就实例化
 * 双重锁模式，提高效率
 *
 * @author wugang
 * date: 2018-06-25 21:54
 **/
public class LazySingleton2Safe implements Serializable {
    private static final long serialVersionUID = -8299465295413278150L;

    private LazySingleton2Safe() {
    }

    private static LazySingleton2Safe instance;

    /**
     * 对静态工厂方法进行了同步处理,为了防止多线程环境中产生多个实例
     *
     * @return
     */
    public static LazySingleton2Safe getInstance() {
        if (instance == null) {
            synchronized(LazySingleton2Safe.class) {
                if (instance == null) {
                    instance = new LazySingleton2Safe();
                }
            }
        }
        return instance;
    }

    /**
     * 这样当JVM从内存中反序列化地"组装"一个新对象时,
     * 就会自动调用这个readResolve方法来返回我们指定好的对象了, 单例规则也就得到了保证.
     * readResolve()方法的返回值将会代替原来反序列化的对象.
     */
    private Object readResolve() {
        return instance;
    }

}
