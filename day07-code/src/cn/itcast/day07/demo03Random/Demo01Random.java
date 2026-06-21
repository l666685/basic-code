package cn.itcast.day07.demo03Random;

import java.util.Random;

/*
Random类用来生成随机数字，使用起来也是三个步骤：

1.导包
import java.util.Random;

2.创建
Random r = new Random();// 括号留空即可
Random r = new Random(long seed);// 若是这样使用就相当于固定种子

3.使用
获取一个随机的int数字（范围为int的范围，即正负二十一亿）：r.nextint();
获取一个随机的int数字（范围为 [0,n) ，n即参数）：r.nextint(n);

 */
public class Demo01Random {
    public static void main(String[] args) {

        Random r = new Random();

        int num  = r.nextInt();
        System.out.println("数字为" + num);

    }
}
