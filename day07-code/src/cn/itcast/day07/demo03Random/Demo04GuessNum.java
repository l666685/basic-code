package cn.itcast.day07.demo03Random;

import java.util.Random;
import java.util.Scanner;

/*
猜数字（数字自己生成）
 */
public class Demo04GuessNum {

    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);
        Random roll = new Random();
        int num= roll.nextInt(100)+1;
        boolean onOff = true;
        int runTimes = 0;
        while (onOff) {
            runTimes++;
            System.out.println("多少？");
            int input = put.nextInt();
            if (input - num > 0) {
                System.out.println("大了");
            } else if (input - num < 0) {
                System.out.println("小了");
            } else if (input - num == 0) {
                System.out.println("恭喜你，被我恭喜了");
                for (int i = 0; i < 5; i++) {
                    System.out.println();
                }
                onOff = false;
            }
        }
        System.out.println("其实是答对了");
        System.out.println("另外，你是在第"+runTimes+"次猜中的");
    }

}
