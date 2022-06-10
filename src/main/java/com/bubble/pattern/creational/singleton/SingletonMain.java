package com.bubble.pattern.creational.singleton;

import com.bubble.pattern.creational.singleton.eager.EagerSingleton;
import com.bubble.pattern.creational.singleton.lazy.LazySingleton;
import com.bubble.pattern.creational.singleton.lazy.LazySingleton2Safe;

/**
 * 单例模式Singleton：
 * 应用场合：有些对象只需要一个就可以了，如国家主席
 * 作用：保证整个应用程序中某个实例有且只有一个
 * 类型：饿汉模式和懒汉模式
 * 区别：饿汉模式加载类时比较慢，但运行时获取对象的速度比较快，是线程安全的。
 * 懒汉模式类加载比较快，但运行时获取对象的速度比较慢，不是线程安全的。
 *
 * @author wugang
 * date: 2018-06-25 21:58
 **/
public class SingletonMain {

    public static void main(String[] args) {
        //饿汉模式
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        if (eagerSingleton1 == eagerSingleton2) {
            System.out.println("EagerSingleton实例一样");
        } else {
            System.out.println("EagerSingleton实例不一样");
        }

        //非线程安全的懒汉模式
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        if (lazySingleton1 == lazySingleton2) {
            System.out.println("LazySingleton实例一样");
        } else {
            System.out.println("LazySingleton实例不一样");
        }

        // 线程安全的懒汉模式
        LazySingleton2Safe lazy1 = LazySingleton2Safe.getInstance();
        LazySingleton2Safe lazy2 = LazySingleton2Safe.getInstance();
        if (lazy1 == lazy2) {
            System.out.println("LazySingleton2Safe实例一样");
        } else {
            System.out.println("LazySingleton2Safe实例不一样");
        }

    }

}
