package cn.itcast.day05.demo03;
/*
遍历数组，说的就是对数组当中的每一个元素进行逐一、挨个处理。
默认的处理方式就是打印输出。
 */
public class Demo04ArrayTest {

    public static void main(String[] args) {
        int[] array = { 10, 25, 35, 47, 50, 60 };

        //以前的方式：
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println("==============");

        //使用循环，循环次数就是数组长度。
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==============");

//        int len = array.length; // 长度
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==============");

        //更简单的遍历写法
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("==============");

    }

}
