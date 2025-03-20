package com.Rectangle;

public class Rectangle {

    private double length;  // 长
    private double width;  // 宽

    public Rectangle() {
        this.length = 0.;
        this.width = 0.;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + this.length + ", width=" + this.width + "]";
    }
}
