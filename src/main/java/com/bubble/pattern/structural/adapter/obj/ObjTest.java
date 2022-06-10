package com.bubble.pattern.structural.adapter.obj;

/**
 * 对象的适配器模式
 *
 * @author wu gang
 * date: 2022-01-05 17:46
 **/
public class ObjTest {

    public static void main(String[] args) {
        Source source = new Source();
        ITarget target = new SourceWrapper(source);
        target.method();
        target.newMethod();
    }

}
