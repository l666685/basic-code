package cn.itcast.day07.demo05Practice;

import java.util.ArrayList;
import java.util.Random;

/*
题目：生成六个[1,33]的随机整数，添加到集合并遍历
 */
public class Demo01ArrayListRandom {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Random roll = new Random();

        //生成
        for (int i = 0; i < 6; i++) {
            list.add(roll.nextInt(33)+1);
        }

        //遍历
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
