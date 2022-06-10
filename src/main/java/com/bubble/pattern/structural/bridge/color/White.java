package com.bubble.pattern.structural.bridge.color;

/**
 * @author wugang
 * date: 2018-06-08 18:44
 **/
public class White implements ColorService {
    @Override
    public void paint(String shape) {
        System.out.println("白色的" + shape);
    }
}
