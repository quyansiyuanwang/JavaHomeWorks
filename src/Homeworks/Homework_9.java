package Homeworks;

interface Animal {

    void speak();
}

class AnonymousClass {

    public static void main() {
        Animal m1 = new Animal() {
            @Override
            public void speak() {
                System.out.println("miao,miao...");
            }
        };
        m1.speak();

        Animal m2 = new Animal() {
            @Override
            public void speak() {
                System.out.println("Wang,Wang...");
            }
        };
        m2.speak();
    }
}

public class Homework_9 {

    public static void run() {
        AnonymousClass.main();
    }
}
