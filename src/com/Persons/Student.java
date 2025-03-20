package com.Persons;

public class Student extends Person {

    private final String school;

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    @Override
    public void displayInfo() {
        System.out.println("我叫" + name + ", 今年" + age + "岁, 在" + school + "上学");
    }
}
