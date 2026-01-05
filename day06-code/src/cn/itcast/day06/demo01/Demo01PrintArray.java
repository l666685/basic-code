package cn.itcast.day06.demo01;

import java.util.Arrays;
import cn.itcast.day05.demo04.Demo01ArrayParam;

/*
面向过程：当需要实现一个功能的时候，每一个步骤都要亲力亲为，详细处理每一个细节。
面向对象：当需要实现一个功能的时候，不关心具体步骤，而是找一个已经具有该功能的
         帮忙。
 */
public class Demo01PrintArray {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6};

        //要求打印格式为：[1, 2, 3, 4, 5, 6]
        //面向过程写法：
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("]");
        System.out.println("==========");

        //使用面向对象
        System.out.println(Arrays.toString(array));
        Demo01ArrayParam.printArray(array);

    }

}
