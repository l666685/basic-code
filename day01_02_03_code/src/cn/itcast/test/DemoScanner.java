package cn.itcast.test;

import java.util.Scanner;

/*
引入类
 */
public class DemoScanner {
    public static void main(String[] args) {
        do {
            String I = "+";
            String II = "-";
            String III = "*";
            String IV = "/";
            String OO = "0";
            String Y = "Y";
            System.out.println("运算符号？");
            System.out.println("(+-*/)");
            System.out.println("输入0：退出程序");
            System.out.println("你的输入：");

            /*
             * double zero = Double.parseDouble(OO);// String转double
             * int one = Integer.parseInt(I); // 这个可以用，String转int
             */

            Scanner jisuanfangshi = new Scanner(System.in);// 输入计算方式
            String jisuanfangshi1 = jisuanfangshi.next();

            if (jisuanfangshi1.equals(OO)) {
                System.out.println("已退出.....(打开我的意义是什么？)");
                System.exit(0);
            } else if (jisuanfangshi1.equals(I)) {
                System.out.println("简单的计算(a+b)");
                Scanner input1 = new Scanner(System.in);// 创建输入a的变量
                System.out.println("a:");
                double a = input1.nextDouble();// 存储a的值
                System.out.println("输入的a为:" + a);// 输出a
                Scanner input2 = new Scanner(System.in);// 创建输入b的变量
                System.out.println("b:");
                double b = input2.nextDouble();// 存储b的值
                System.out.println("输入的b为:" + b);// 输出b
                double c = a + b;// a+b
                System.out.println("a+b=" + c);// 计算的结果
            }
            // 加法
            else if (jisuanfangshi1.equals(II)) {
                System.out.println("简单的计算(a-b)");
                Scanner input1 = new Scanner(System.in);// 创建输入a的变量
                System.out.println("a:");
                double a = input1.nextDouble();// 存储a的值
                System.out.println("输入的a为:" + a);// 输出a
                Scanner input2 = new Scanner(System.in);// 创建输入b的变量
                System.out.println("b:");
                double b = input2.nextDouble();// 存储b的值
                System.out.println("输入的b为:" + b);// 输出b
                double c = a - b;// a-b
                System.out.println("a-b=" + c);// 计算的结果
                // 另一个计算,减法
            } else if (jisuanfangshi1.equals(III)) {
                System.out.println("简单的计算(a*b)");
                Scanner input1 = new Scanner(System.in);// 创建输入a的变量
                System.out.println("a:");
                double a = input1.nextDouble();// 存储a的值
                System.out.println("输入的a为:" + a);// 输出a
                Scanner input2 = new Scanner(System.in);// 创建输入b的变量
                System.out.println("b:");
                double b = input2.nextDouble();// 存储b的值
                System.out.println("输入的b为:" + b);// 输出b
                double c = a * b;// a*b
                System.out.println("a*b=" + c);// 计算的结果
                // 另一个计算，乘法
            } else if (jisuanfangshi1.equals(IV)) {
                System.out.println("简单的计算(a/b)");
                Scanner input1 = new Scanner(System.in);// 创建输入a的变量
                System.out.println("a:");
                double a = input1.nextDouble();// 存储a的值
                System.out.println("输入的a为:" + a);// 输出a
                Scanner input2 = new Scanner(System.in);// 创建输入b的变量
                System.out.println("b:");
                double b = input2.nextDouble();// 存储b的值
                if (b == 0) {
                    System.out.println("错误");
                } else {
                    System.out.println("输入的b为:" + b);// 输出b
                    double c = a / b;// a/b
                    System.out.println("a/b=" + c);// 计算的结果
                    // 另一个计算，除法
                }
            } else {
                System.out.println("???,之前的说明你没看吗？没长眼睛吗？看来要好好锻炼一下你的视力了(呃呃，这个以后再搞)");
            }
            System.out.println("还要继续运行吗？");
            System.out.println("(运行：Y)");
            System.out.println("(退出：任意键)");
            System.out.println("你的输入：");
            Scanner chongfu = new Scanner(System.in);
            String chongfu1 = chongfu.next();
            if (chongfu1.equals(Y)) {
                System.out.println("OK，继续");
            } else {
                System.out.println("OK,退出啦");
                System.exit(1);
            }
        } while (true);
    }
}