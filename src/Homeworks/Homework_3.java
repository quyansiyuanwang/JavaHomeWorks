package Homeworks;

import com.Complex.Complex;
import com.Rectangle.Rectangle;

public class Homework_3 {

    public static void run() {
        // Test Rectangle class
        Rectangle r = new Rectangle(3, 4);
        System.out.println(r);

        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());

        r.setLength(5);
        r.setWidth(6);
        System.out.println(r);

        System.out.println("Width: " + r.getWidth());
        System.out.println("Length: " + r.getLength());

        // Test Complex class
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, -2);
        System.out.println(c2);
        System.out.println(c1.add(c2));
        System.out.println(c1.sub(5));
    }
}
