package cn.itcast.day01_02_03;

public class Demo05Ifelsepractice {
    public static void main(String[] args) {
        int score = 100;
        System.out.println("你的成绩是：" + score);
        if (score < 0 || score > 100) {
            System.out.println("你的成绩是错误的。");
        } else if (score >= 90) {
            System.out.println("你的成绩属于优");
        } else if (score >= 80) {
            System.out.println("你的成绩属于良");
        } else if (score >= 60) {
            System.out.println("你的成绩属于差");
        } else {
            System.out.println("孩子你不及格啊，快回去复习吧");
        }
    }
}