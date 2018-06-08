package com.bubble.pattern.bridge.color;

/**
 * @author wugang
 * date: 2018-06-08 18:43
 **/
public class BlackColor implements ColorService {
    @Override
    public void paint(String shape) {
        System.out.println("黑色的" + shape);
    }
}
