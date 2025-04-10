package com.Areas;

import Bases.Area.Area;

public class RoundArea extends Area {

    private final double radius;

    public RoundArea(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

}
