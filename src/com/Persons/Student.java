package com.Persons;

public class Student extends Person {

    private final String student_id;

    public Student(String student_id, String name, int age, Sex sex, String birthDate, String ID) {
        super(name, age, sex, birthDate, ID);
        this.student_id = student_id;
    }

    @Override
    public void displayInfo() {
        System.out.println("学生学号:" + student_id);
        System.out.println("学生姓名:" + name);
        System.out.println("学生年龄:" + age);
        System.out.println("学生性别:" + this.sex.toString());
        System.out.println("学生生日:" + birthDate);
        System.out.println("学生身份证号:" + ID);
    }

    public void printInfo() {
        this.displayInfo();
    }
}
