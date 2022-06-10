package com.bubble.pattern.structural.bridge.color;

/**
 * @author wugang
 * date: 2018-06-08 18:41
 **/
public class RedColor implements ColorService {
    @Override
    public void paint(String shape) {
        System.out.println("红色的" + shape);
    }
}
