package cn.itcast.day05.demo03;
/*
题目要求：求出数组最大值
 */
public class Demo05ArrayMax {

    public static void main(String[] args) {
        int[] array = { 10, 25, 35, 67, 50, 60, -5 };
        int max = array[0];
        for (int i = 1;i < array.length;i++) {
            max = max > array[i] ? max : array[i];
        }
        System.out.println(max);
    }

}
