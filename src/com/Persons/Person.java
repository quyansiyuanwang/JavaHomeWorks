package com.Persons;

import Bases.Person.PersonBase;

public class Person extends PersonBase {

    public Person(String name, int age, Sex sex, String birthDate, String ID) {
        super(name, age, sex, birthDate, ID);
    }

    @Override
    public void displayInfo() {
        System.err.println("Not implemented");
    }
}
