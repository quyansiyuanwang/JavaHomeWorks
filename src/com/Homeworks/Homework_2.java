package com.Homeworks;

import com.Persons.Person;
import com.Persons.Student;

public class Homework_2 {

    public static void run() {
        Person p = new Person("张三", 18);
        p.displayInfo();

        System.out.println();

        Student s = new Student("李四", 20, "ndky");
        s.displayInfo();

        System.out.println();

        System.out.println("总人数：" + Person.count);
    }
}
