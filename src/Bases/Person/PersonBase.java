package Bases.Person;

public abstract class PersonBase {

    public enum Sex {
        MALE, FEMALE
    }

    protected final String name;
    protected final int age;
    protected final Sex sex;
    protected String birthDate;
    protected String ID;
    public static int count = 0;

    public PersonBase(String name, int age, Sex sex, String birthDate, String ID) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.birthDate = birthDate;
        this.ID = ID;
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
