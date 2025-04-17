package com.Train;

import Interface.SetAndGetWeight;

public class Train {

    SetAndGetWeight[] things;
    double totalWeight = 0;

    public Train(SetAndGetWeight[] things) {
        this.things = things;
    }

    public double getTotalWeights() {
        totalWeight = 0;
        for (SetAndGetWeight thing : things) {
            totalWeight += thing.getWeight();
        }
        return totalWeight;
    }
}
