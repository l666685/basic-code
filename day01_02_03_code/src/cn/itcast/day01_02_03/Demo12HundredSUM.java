package cn.itcast.day01_02_03;

public class Demo12HundredSUM { // 题目：求出1-100的偶数和。
    public static void main(String[] args) {
        int sum = 0;
        int scanner;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                scanner = sum + i;
                System.out.println(sum + "+" + i + "=" + scanner);
                sum = sum + i;
            }
        }
        System.out.println("for 1-100的偶数和为" + sum);
        System.out.println();

        sum = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println("while 1-100的偶数和为" + sum);
        System.out.println();

        sum = 0;
        i = 1;
        do {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        } while (i - 1 <= 100);
        System.out.println("do while 1-100的偶数和为" + sum);
    }
}