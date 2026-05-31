package cn.itcast.day07.demo03;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {

        Random roll = new Random();

        for (int i = 0; i < 100; i++) {
            System.out.println(i + " " + roll.nextInt(10));
        }

    }
}
