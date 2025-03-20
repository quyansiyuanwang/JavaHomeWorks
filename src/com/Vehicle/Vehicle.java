package com.Vehicle;

public class Vehicle {

    private double speed;
    private int power;

    public Vehicle(double speed, int power) {
        this.speed = speed;
        this.power = power;
    }

    public void speedUp(int s) {
        speed += s;
    }

    public void speedDown(int d) {
        speed -= d;
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

    @Override
    public String toString() {
        return "Vehicle[" + "speed=" + speed + ", power=" + power + ']';
    }
}
