package Homeworks;

import java.util.Scanner;

import com.People.People;
import com.Computer.Computer;
import com.Television.Television;
import com.WashMachine.WashMachine;
import com.Train.Train;

import Interface.SetAndGetWeight;

public class Homework_8 {

    public static void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("请输入乘客的个数: ");
            int peoplenum = scanner.nextInt();
            System.out.print("请输入电视机的个数: ");
            int tvnum = scanner.nextInt();
            System.out.print("请输入电脑的个数: ");
            int computernum = scanner.nextInt();
            System.out.print("请输入洗衣机的个数: ");
            int washnum = scanner.nextInt();

            int totalnum = peoplenum + tvnum + computernum + washnum;

            SetAndGetWeight things[] = new SetAndGetWeight[totalnum];
            Train train = new Train(things);

            System.out.println("请输入每位乘客的体重: ");
            for (int i = 0, k = 1; i < peoplenum; i++, k++) {
                System.out.print("第" + k + "位乘客: ");
                things[i] = new People();
                things[i].setWeight(scanner.nextDouble());
            }

            System.out.println("请输入每台电视机的重量: ");
            for (int i = peoplenum, k = 1; i < peoplenum + tvnum; i++, k++) {
                System.out.print("第" + k + "台电视机: ");
                things[i] = new Television();
                things[i].setWeight(scanner.nextDouble());
            }
            System.out.println("请输入每台电脑的重量: ");
            for (int i = peoplenum + tvnum, k = 1; i < peoplenum + tvnum + computernum; i++, k++) {
                System.out.print("第" + k + "台电脑: ");
                things[i] = new Computer();
                things[i].setWeight(scanner.nextDouble());
            }
            System.out.println("请输入每台洗衣机的重量: ");
            for (int i = peoplenum + tvnum + computernum, k = 1; i < totalnum; i++, k++) {
                System.out.print("第" + k + "台洗衣机: ");
                things[i] = new WashMachine();
                things[i].setWeight(scanner.nextDouble());
            }

            System.out.println("总重量为: " + train.getTotalWeights());
        }
    }
}
