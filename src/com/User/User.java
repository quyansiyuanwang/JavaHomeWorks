package com.User;

import com.Persons.Student;
import com.Vehicle.Vehicle;

public class User {

    public static void main() {
        // Test Vehicle
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
        car2.speedDown(200);

        // Test Student
        Student s = new Student(
                "20210001",
                "李四",
                19,
                Student.Sex.FEMALE,
                "2001-01-01",
                "0987654321"
        );
        s.displayInfo();
        System.out.println("总人数：" + Student.count);
    }

}
