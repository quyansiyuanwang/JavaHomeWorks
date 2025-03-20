package com.User;

import com.Vehicle.Vehicle;

public class User {

    public static void main() {
        Vehicle car1 = new Vehicle(100, 200);
        Vehicle car2 = new Vehicle(100, 76);
        System.out.println(car1);

        car1.setPower(128);
        System.out.println("car1的功率是:" + car1.getPower());
        System.out.println("car2的功率是:" + car2.getPower());

        car1.speedDown(20);
        System.out.println("car1目前的速度是:" + car1.getSpeed());
        System.out.println("car2目前的速度是:" + car2.getSpeed());

        car1.speedUp(30);
        car1.speedDown(40);
        car2.speedDown(20);
        System.out.println("car1目前的速度是:" + car1.getSpeed());
        System.out.println("car2目前的速度是:" + car2.getSpeed());
    }
}
