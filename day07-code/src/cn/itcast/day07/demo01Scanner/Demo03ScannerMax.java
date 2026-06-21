package cn.itcast.day07.demo01Scanner;

import java.util.Scanner;

/*
题目：输入三个数字，求最大值
 */
public class Demo03ScannerMax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("第一个数：");
        int a = sc.nextInt();
        System.out.println("第二个数：");
        int b = sc.nextInt();
        System.out.println("第三个数：");
        int c = sc.nextInt();
        sc.close();
//        int max = a > b ? a : b;
//        max = max > c ? max : c;
        //另一种好用的写法：
        int max = Math.max(a, b);
        max = Math.max(max, c);

        System.out.println("三个数里最大的是" + max);

    }

}
