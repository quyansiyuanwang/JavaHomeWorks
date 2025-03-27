package Homeworks;

import com.Rectangle.PlainRect;

public class Homework_5 {

    public static void run() {
        PlainRect rect = new PlainRect(10, 10, 20, 10);

        double area = rect.calculateArea();
        double perimeter = rect.calculatePerimeter();
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        System.out.println("(25.5, 13) in the rectangle: " + rect.isInside(25.5, 13));
    }
}
