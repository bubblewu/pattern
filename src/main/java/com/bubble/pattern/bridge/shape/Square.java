package com.bubble.pattern.bridge.shape;

/**
 * @author wugang
 * date: 2018-06-08 18:52
 **/
public class Square extends Shape {
    @Override
    public void draw() {
        color.paint("正方形");
    }
}
