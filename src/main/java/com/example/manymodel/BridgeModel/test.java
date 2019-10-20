package com.example.manymodel.BridgeModel;

public class test {

    public static void main(String[] args) {
        Shape greenCircle = new Circle(10, new RedPen());
        Shape redRectangle = new Rectangle(4, 8, new RedPen());
        greenCircle.draw();
        redRectangle.draw();
    }
}
