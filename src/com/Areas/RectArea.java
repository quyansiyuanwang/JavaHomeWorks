package com.Areas;

import Bases.Area.Area;

public class RectArea extends Area {

    private final double length;
    private final double width;

    public RectArea(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

}
