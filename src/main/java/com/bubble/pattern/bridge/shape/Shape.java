package com.bubble.pattern.bridge.shape;

import com.bubble.pattern.bridge.color.ColorService;

/**
 * 定义一个形状抽象类，提供draw绘制形状的抽象方法
 *
 * 抽象类，是不允许实例化的类，不能直接创建对象，必须要通过子类创建才能使用abstract类的方法
 * @author wugang
 * date: 2018-06-08 18:45
 **/
public abstract class Shape {
    ColorService color;

    public void setColorService(ColorService color) {
        this.color = color;
    }

    /**
     * 抽象方法是只有方法声明，而没有方法的实现内容。
     * 一个类中，只要有一个抽象方法，这个类必须被声明为抽象类，
     * 抽象方法在非抽象子类中必须被重写。
     */
    public abstract void draw();

}
