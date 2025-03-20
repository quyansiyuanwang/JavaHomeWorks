package Bases.Person;

public abstract class PersonBase {

    protected final String name;
    protected final int age;
    public static int count = 0;

    public PersonBase(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getCount() {
        return count;
    }

    public abstract void displayInfo();
}
