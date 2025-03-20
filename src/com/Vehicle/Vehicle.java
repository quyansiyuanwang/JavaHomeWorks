package com.Vehicle;

public class Vehicle {

    private double speed;
    private int power;

    public Vehicle(double speed, int power) {
        this.speed = speed;
        this.power = power;
    }

    public void speedUp(int s) {
        if (s < 0) {
            System.err.println("Speed must be positive");
            return;
        }
        int newSpeed = (int) speed + s;
        if (newSpeed > 200) {
            System.err.println("Speed can't be more than 200");
            return;
        }
        speed = newSpeed;
    }

    public void speedDown(int s) {
        if (s < 0) {
            System.err.println("Speed must be positive");
            return;
        }
        int newSpeed = (int) speed - s;
        if (newSpeed < 0) {
            System.err.println("Speed can't be negative");
            return;
        }
        speed = newSpeed;
    }

    public void setPower(int p) {
        power = p;
    }

    public int getPower() {
        return power;
    }

    public double getSpeed() {
        return speed;
    }

    public void brake() {
        speed = 0;
    }

    @Override
    public String toString() {
        return "Vehicle[" + "speed=" + speed + ", power=" + power + ']';
    }

}
