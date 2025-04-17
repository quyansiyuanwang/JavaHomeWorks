package com.People;

import Interface.SetAndGetWeight;

public class People implements SetAndGetWeight {

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
