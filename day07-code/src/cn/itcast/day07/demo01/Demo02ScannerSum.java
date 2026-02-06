package cn.itcast.day07.demo01;

import java.util.Scanner;

/*
题目：键盘输入两个int数字，并求出和值。

Scanner用法：导包，创建，使用
 */
public class Demo02ScannerSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("第一个数：");
        int a = sc.nextInt();
        System.out.println("第二个数");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("结果为：" + sum);

    }

}
