package com.Persons;

import Bases.Person.PersonBase;

public class Person extends PersonBase {

    public Person(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayInfo() {
        System.out.println("我叫" + name + ", 今年" + age + "岁");
    }
}
