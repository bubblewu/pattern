package com.bubble.pattern.bridge;

import com.bubble.pattern.bridge.color.BlackColor;
import com.bubble.pattern.bridge.color.ColorService;
import com.bubble.pattern.bridge.shape.Circle;
import com.bubble.pattern.bridge.shape.Shape;
import com.bubble.pattern.bridge.shape.Square;

/**
 * 桥接模式Demo
 * @author wugang
 * date: 2018-06-08 18:53
 **/
public class BridgePatternMain {

    public static void main(String[] args) {
        ColorService color = new BlackColor();
        Shape square = new Square();
        square.setColorService(color);
        square.draw();

        Shape circle = new Circle();
        circle.setColorService(color);
        circle.draw();
    }

}
