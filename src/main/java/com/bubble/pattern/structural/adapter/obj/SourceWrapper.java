package com.bubble.pattern.structural.adapter.obj;

/**
 * 对Source进行适配：不继承Source类，但持有Source类的实例
 *
 * @author wu gang
 * date: 2022-01-05 17:41
 **/
public class SourceWrapper implements ITarget {
    private final Source source;

    public SourceWrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method() {
        source.method();
    }

    @Override
    public void newMethod() {
        System.out.println("这是一个新增的目标的方法");
    }
}
