package cn.itcast.day05.demo03;

import java.util.Arrays;

/*
题目：乱序数组排序（从小到大）
 */
public class Demo08ArrayTextSort {

    public static void main(String[] args) {

        int[] arrA = {3, 5, 7, 9, 1, 2, 4, -9};
        int temp;

        //排序
        for (int i = 0; i < arrA.length - 1; i++) {
            for (int g = 0; g < arrA.length - i - 1; g++) {
                if (arrA[g] > arrA[g + 1]) {
                    temp = arrA[g + 1];
                    arrA[g + 1] = arrA[g];
                    arrA[g] = temp;
                }
            }
            System.out.println(Arrays.toString(arrA));
            System.out.println("=======");


            int[] arrB = {3, 5, 7, 9, 1, 2, 4, -10};
            //官方包方法，记得第三行导入
            Arrays.sort(arrB);
            System.out.println(Arrays.toString(arrB));

        }

    }

}
