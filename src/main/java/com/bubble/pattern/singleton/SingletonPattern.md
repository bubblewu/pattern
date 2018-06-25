# 设计模式 Design Pattern
设计模式是一套反复被人使用、多数人知晓的、经过分类编排的、对代码设计经验的总结。
使用设计模式可以使代码可重用，让代码更加容易被他人理解，保证代码可靠性。
基本的设计模式有23种：
如：单例模式、抽象工厂模式、建造者模式、工厂模式、原型模式、适配器模式、代理模式等等。
# 单例模式 Singleton
## 什么是单例模式
单例模式是创建型模式类型中的一种，它确保一个类只有一个实例，而且自行实例化后，并向整个系统提供这个实例。主要包括**线程安全的饿汉模式**和**非线程安全的懒汉模式。**
由定义可知，单例模式就是保证对象有且只有一个，防止出现一些不必要的问题，形象化的类比为一个公司只能有一个CEO，不然就会乱套了。
如果在开发中如配置文件、工具类、线程池、缓存和日志系统等，如果创造出多个实例，就会导致许多问题，如占用过多的资源，出现不一致的结果等。

## 为什么要使用单例模式
单例模式的优点：
- 使用单例模式，在内存中只有一个对象，可以节省内存空间
- 避免频繁的创建销毁对象，提高程序的性能
- 避免对共享资源的多重占用
- 可以实现工程内的全局访问

基于上面的优点，在开发过程中如果遇到实例化频率高、耗时过多、有状态的工具类对象，就可以合理的去使用单例模式去设计代码。
但是也要注意：
- 多线程环境下，注意线程安全问题
- 只能使用单例类提供的方法得到单例对象，不要使用反射，否则将会实例化一个新对象。
- 不要做断开单例类对象与类中静态引用的危险操作。

## 三个要素
- 私有的构造方法
- 指向自己实例的私有静态引用
- 以自己实例为返回值的静态的公有的方法

## 两种模式
单例模式根据实例化对象时机的不同分为两种：一种是饿汉式单例，一种是懒汉式单例。
```java
package study.design.singleton;

/**
 * 单例模式Singleton：
 * 应用场合：有些对象只需要一个就可以了，如国家主席
 * 作用：保证整个应用程序中某个实例有且只有一个
 * 类型：饿汉模式和懒汉模式
 * 区别：饿汉模式加载类时比较慢，但运行时获取对象的速度比较快，是线程安全的。
 *      懒汉模式类加载比较快，但运行时获取对象的速度比较慢，不是线程安全的。
 */
public class Singleton {

    public static void main(String[] args) {
        //饿汉模式
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        if (eagerSingleton1 == eagerSingleton2) {
            System.out.println("EagerSingleton实例一样");
        } else {
            System.out.println("EagerSingleton实例不一样");
        }

        //懒汉模式
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        if (lazySingleton1 == lazySingleton2) {
            System.out.println("LazySingleton实例一样");
        } else {
            System.out.println("LazySingleton实例不一样");
        }

    }

}
```

### 线程安全的饿汉模式
饿汉模式是在单例的类被加载的时候，就直接实例化一个对象给自己的引用。
```java
package study.design.singleton;

/**
 * 饿汉模式：创建类的唯一实例,在类加载的时候就会创建这个类的实例，
 * 就像饿了的人，迫不及待的想先吃到东西。
 */
public class EagerSingleton {
    // 1. 将构造方法私有化，不允许外部直接创建对象
    private EagerSingleton () {
    }
    // 2.创建类的唯一实例,在类加载的时候就会创建这个类的实例
    private static EagerSingleton instance = new EagerSingleton();
    // 3. 提供一个用于获取实例的方法
    public static EagerSingleton getInstance() {
        return instance;
    }
}
```

### 非线程安全的懒汉模式
懒汉模式是在取得实例方法的时候，先判断实例化对象是否为null，如果不为null就实例化。
```java
package com.study.pattern;

/**
 * 懒汉模式：先判断实例化对象是否为null，如果不为null就实例化
 */
public class LazySingleton {

    private static LazySingleton instance;
    private LazySingleton() {
    }

    //synchronized对静态工厂方法进行了同步处理,为了防止多线程环境中产生多个实例
		//同步处理的恰当与否也是至关重要的。不然可能
会达不到得到单个对象的效果，还可能引发死锁等错误
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
```

##  单例模式的陷阱
### 有关线程安全
- 饿汉模式：
饿汉模式下，因为对象类一加载就实例化，提前占用系统资源，在getInstance()方法中只是直接返回对象引用，是线程安全的。
缺点：如果在一个大环境下使用了过多的饿汉单例，则会生产出过多的实例对象，无论你是否要使用他们，Jvm垃圾回收器有可能不会收集这些单例对象。
> Jvm卸载类的条件：
> - 该类所有的实例都已经被回收，也就是java堆中不存在该类的任何实例。
> - 加载该类的ClassLoader已经被回收。
> - 该类对应的java.lang.Class对象没有任何地方被引用，无法在任何地方通过反射访问该类的方法。

> 只有三个条件都满足，jvm才会在垃圾收集的时候卸载类。显然，单例的类不满足条件一，因此单例类也不会被卸载。

- 懒汉模式：
因为懒汉模式是在需要的时候先进行判断对象引用是否为NULL，如果多个线程同时进入判断，就会生成多个实例对象。所以不是线程安全的，需要双重锁定来解决可能的线程安全问题。

线程安全的懒汉模式：
```java
package com.study.pattern;

/**
 * 懒汉模式：先判断实例化对象是否为null，如果不为null就实例化
 * 双重锁模式，提高效率
 */
public class LazySingleton {

    private static LazySingleton instance;
    private LazySingleton() {
    }

    //对静态工厂方法进行了同步处理,为了防止多线程环境中产生多个实例
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

}
```

### 有关分布式系统
当系统中的单例类被拷贝运行在多个虚拟机下的时候，在每一个虚拟机下都可以创建一个实例对象。
所以在使用分布技术的系统中，应该避免使用单例模式，因为一个有状态的单例类，在不同虚拟机上，各个单例对象保存的状态很可能是不一样的，问题也就随之产生。

### 单例模式的序列化
正常的对象类，实现了 Serializable接口, 我们就可以把它往内存地写再从内存里读出而"组装"成一个跟原来一模一样的对象。
不过当序列化遇到单例时,这里边就有了个问题: 从内存读出而组装的对象破坏了单例的规则。单例是要求一个Jvm中只有一个类对象的, 而现在通过反序列化，一个新的对象克隆了出来。
所以要使单例对象类可以进行序列化操作，可以加入`readResolve`方法。
```java
package com.study.pattern;

import java.io.Serializable;

/**
 * 懒汉模式：先判断实例化对象是否为null，如果不为null就实例化
 * 双重锁模式，提高效率
 */
public class LazySingleton implements Serializable {
    private static final long serialVersionUID = -9062334136430456131L;

    private static LazySingleton instance;
    private LazySingleton() {
    }

    //对静态工厂方法进行了同步处理,为了防止多线程环境中产生多个实例
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    /**
     * 这样当JVM从内存中反序列化地"组装"一个新对象时,
     * 就会自动调用这个readResolve方法来返回我们指定好的对象了, 单例规则也就得到了保证.
     * readResolve()方法的返回值将会代替原来反序列化的对象.
     * */
    private Object readResolve() {
        return instance;
    }

}
```





