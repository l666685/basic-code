package cn.itcast.day07.demo05Practice;

import java.util.ArrayList;
import java.util.Random;

/*
题目：
用一个大集合存入20个随机数字，筛选其中的偶数并放到小集合中。
用方法实现筛选
 */
public class Demo04ArraylistReturn {

    // 效果展示
    public static void main(String[] args) {
        Random roll = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        PracticeUsedMethod method = new PracticeUsedMethod();

        for (int i = 0; i < 20; i++) {
            list.add(roll.nextInt(40));
        }

        System.out.println(list);

        ArrayList<Integer> OuShu = method.get2468(list);

        System.out.println(OuShu);
    }

}
