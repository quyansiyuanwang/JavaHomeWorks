package com.Areas;

import java.util.Scanner;

public class ImpleArea {

    public static void main() {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();

            double rectangleArea = length * width;
            System.out.println("The area of the rectangle is: " + rectangleArea);

            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();

            double circleArea = Math.PI * radius * radius;
            System.out.println("The area of the circle is: " + circleArea);
        }
    }
}
