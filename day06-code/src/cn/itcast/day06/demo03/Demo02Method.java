package cn.itcast.day06.demo03;
/*
面向对象三大特征：封装、继承、多态。

封装性在java当中的体现：
1. 方法就是一种分装
2. 关键字private也是一种封装

封装就是将一些细节隐藏起来，对于外界不可见(相当于黑盒)。
 */
public class Demo02Method {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 22, 55, 88, 99, 43, 6542, 23, -9};

        System.out.println("最大值：" + getMax(arr));
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
