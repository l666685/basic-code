package cn.itcast.day05.demo03;
/*
题目要求：求出数组最小值
 */
public class Demo06ArrayMin {

    public static void main(String[] args) {
        int[] array = { 10, 25, 35, 67, 50, 60, -5 };
        int min = array[0];
        for (int i = 1;i < array.length;i++) {
            min = min < array[i] ? min : array[i];
        }
        System.out.println(min);
    }

}
