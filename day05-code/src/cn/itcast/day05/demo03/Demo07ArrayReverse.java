package cn.itcast.day05.demo03;

import java.util.Arrays;

import static cn.itcast.day05.demo04.Demo01ArrayParam.printArray;
import cn.itcast.day05.demo04.Demo01ArrayParam;

/*
数组元素的反转：
本来的样子：{ 1, 2, 3, 4 }
反转之后的：{ 4, 3, 2, 1 }

要求：不能使用新数组
 */
public class Demo07ArrayReverse {

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7 };
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
        }
        System.out.println(Arrays.toString(array));
        printArray(array);
        Demo01ArrayParam p = new Demo01ArrayParam();
        p.printArray2(array);

    }

}
