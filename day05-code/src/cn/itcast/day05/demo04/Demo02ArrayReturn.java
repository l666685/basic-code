package cn.itcast.day05.demo04;

import static cn.itcast.day05.demo04.Demo01ArrayParam.printArray;

/*
一个方法可以有0～正无穷个参数，但只能有一个或者没有返回值
如果希望其返回多个数据，使用一个数组返回即可（返回的真实数据仅为数组的地址值）
另外，本文件引用了Demo01ArrayParam中的printArray方法，引用方法在第三行。
 */

public class Demo02ArrayReturn {

    public static void main(String[] args) {

        int[] result = calculate(4,5,6);
        printArray(result);

    }

    public static int[] calculate(int a, int b, int c) {
        int sum = a + b + c; //和
        int avg = sum / 3; // 平均数
        return new int[] {sum, avg};
    }

}
