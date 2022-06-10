package com.bubble.pattern.creational.singleton.lazy;

/**
 * 懒汉模式：非线程安全
 * 先判断实例化对象是否为null，如果不为null就实例化
 *
 * @author wugang
 * date: 2018-06-25 21:50
 **/
public class LazySingleton {
    private LazySingleton() {
    }

    private static LazySingleton instance;

    /**
     * synchronized对静态工厂方法进行了同步处理,为了防止多线程环境中产生多个实例
     * 同步处理的恰当与否也是至关重要的。不然可能会达不到得到单个对象的效果，还可能引发死锁等错误
     *
     * @return
     */
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
