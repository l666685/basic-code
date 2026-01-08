package cn.itcast.test;

import java.util.Scanner;

public class DemoCalculate {

    public static void main(String[] args) {

        String temp1;
        String temp2;
        double result;
        Scanner sc = new Scanner(System.in);

        System.out.println("请按如下所示的方式严格输入：");
        System.out.println("数字 运算符号 数字 运算符号 .... =");
        System.out.println("(空格可以用回车代替)");
        System.out.print("请输入：");

        result = Double.parseDouble(sc.next());

        do {

            if (sc.hasNext()) {
                temp1 = sc.next();

                if (temp1.equals("=")) {
                    break;
                } else if (sc.hasNext()) {
                    temp2 = sc.next();

                    if (temp1.equals("+")) {
                        result = result + Double.parseDouble(temp2);
                    } else if (temp1.equals("-")) {
                        result = result - Double.parseDouble(temp2);
                    } else if (temp1.equals("*")) {
                        result = result * Double.parseDouble(temp2);
                    } else if (temp1.equals("/")) {
                        if (temp2.equals("0")) {
                            System.out.println("BYD又把0当分母是吧");
                            System.out.println("拜拜");
                            System.exit(-1);
                        } else {
                            result = result / Double.parseDouble(temp2);
                        }
                    } else if (temp2.equals("=")) {
                        break;
                    }

                } else {
                    break;
                }
            } else {
                break;
            }

        } while (true);

        System.out.println("=" + result);

    }

}
