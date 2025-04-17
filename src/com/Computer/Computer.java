package com.Computer;

import Interface.SetAndGetWeight;

public class Computer implements SetAndGetWeight {

    private double weight;

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}
