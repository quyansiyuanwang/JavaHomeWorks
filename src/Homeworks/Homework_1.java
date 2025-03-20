package Homeworks;

import java.util.Scanner;

public class Homework_1 {

    public static void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            // Hello World
            System.out.println("Hello World");

            // 回文
            System.out.print("请输入一个五位数: ");
            int number = scanner.nextInt();

            String strNumber = String.valueOf(number);
            if (strNumber.contentEquals(new StringBuilder(strNumber).reverse())) {
                System.out.println(strNumber + "是一个回文数");
            } else {
                System.out.println(strNumber + "不是一个回文数");
            }

            // 判断月份
            System.out.print("请输入年份: ");
            int year = scanner.nextInt();
            System.out.print("请输入月份: ");
            boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
            int month = scanner.nextInt();
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 ->
                    System.out.println("31天");
                case 2 ->
                    System.out.println(isLeapYear ? "29天" : "28天");
                case 4, 11, 9, 6 ->
                    System.out.println("30天");
                default ->
                    System.out.println("输入错误");
            }

            // 猜数字
            int target = (int) (Math.random() * 100);
            System.out.print("请输入一个数字: ");
            int guess = scanner.nextInt();
            while (guess != target) {
                System.out.print(guess > target ? "太大了, 请再猜" : "太小了, 请再猜");
                guess = scanner.nextInt();
            }
            System.out.println("恭喜你猜对了");
        }
    }
}
