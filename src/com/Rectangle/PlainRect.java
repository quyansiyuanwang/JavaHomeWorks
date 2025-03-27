package com.Rectangle;

public class PlainRect extends Rect {

    private double startX;
    private double startY;

    public PlainRect(double startX, double startY, double length, double width) {
        super(length, width);
        this.startX = startX;
        this.startY = startY;
    }

    public PlainRect() {
        super(0, 0);
        this.startX = 0;
        this.startY = 0;
    }

    public boolean isInside(double x, double y) {
        return x >= startX && x <= (startX + getLength())
                && y >= startY && y <= (startY + getWidth());
    }

    public double getStartX() {
        return startX;
    }

    public void setStartX(double startX) {
        this.startX = startX;
    }

    public double getStartY() {
        return startY;
    }

    public void setStartY(double startY) {
        this.startY = startY;
    }

    @Override
    public String toString() {
        return "PlainRect{" +
                "startX=" + startX +
                ", startY=" + startY +
                ", length=" + getLength() +
                ", width=" + getWidth() +
                '}';
    }
}
