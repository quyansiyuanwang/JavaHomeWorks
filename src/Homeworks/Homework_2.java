package Homeworks;

import com.Persons.Person;
import com.Persons.Student;

public class Homework_2 {

    public static void run() {
        Person p = new Person(
                "张三",
                20,
                Person.Sex.MALE,
                "2000-01-01",
                "1234567890"
        );
        p.displayInfo();

        System.out.println();

        Student s = new Student(
                "20210001",
                "李四",
                19,
                Person.Sex.FEMALE,
                "2001-01-01",
                "0987654321"
        );
        s.displayInfo();

        System.out.println();
        System.out.println("总人数：" + Person.count);
    }
}
