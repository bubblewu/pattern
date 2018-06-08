package com.bubble.pattern.bridge.shape;

/**
 * @author wugang
 * date: 2018-06-08 18:50
 **/
public class Circle extends Shape {
    @Override
    public void draw() {
        color.paint("圆形");
    }
}
