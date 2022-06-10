package com.bubble.pattern.structural.adapter.clazz;

/**
 * @author wu gang
 * date: 2022-01-05 18:25
 **/
public class ClazzTest {

    public static void main(String[] args) {
        ITargetClazz target = new SourceAdaptor();
        // ITarget接口的实现类，就拥有了Source类的功能；
        target.method();
        target.newMethod();
    }

}
