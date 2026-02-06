package cn.itcast.day01_02_03;

public class Demo06Max {
    public static void main(String[] args) {
        int a = 30;
        int b = 30;

        int max1 = a > b ? a : b;
        System.out.println("MAX1:" + max1);

        int max2;
        if (a > b) {
            max2 = a;
        } else {
            max2 = b;
        }
        System.out.println("MAX2:" + max2);
    }
}