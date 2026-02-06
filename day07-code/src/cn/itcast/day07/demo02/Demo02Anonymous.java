package cn.itcast.day07.demo02;

import java.util.Scanner;

public class Demo02Anonymous {

    public static void main(String[] args) {
        //普通使用方式：
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println(num);
//        System.out.println("===");

        //匿名对象使用：
//        int num1 = new Scanner(System.in).nextInt();
//        System.out.println(num1);

        methodParam(methodReturn());

    }

    public static void methodParam(Scanner sc) {
        System.out.println(sc.nextLine());
        String s = sc.nextLine();
        System.out.println(s);
    }

    public static Scanner methodReturn() {
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }

}
