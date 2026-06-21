package cn.itcast.day07.demo01Scanner;

import java.util.Scanner; //1. 导包

/*
Scanner类的功能：可以实现键盘输入数据，到程序中。

引用类型的一般使用步骤：

1. 导包
import 包名称.类名称;
对于和当前类属于同一个包的情况，可以省略导包语句不写。
只有java.lang包下的内容不需要导包，其他的包都需要import语句。
2. 创建
类名称.对象名 = new 类名称();

3. 使用
对象名.成员方法名()

获取键盘输入的一个int数字：int num = sc.nextInt();
获取键盘输入的一个字符串：String str = sc.next();
 */
public class Demo01Scanner {

    public static void main(String[] args) {

        //2. 创建
        //System.in代表从键盘输入
        //其他的写法自己查JDK API去
        Scanner sc = new Scanner(System.in);

        //3. 使用
        //获取键盘输入的int数字
        int num = sc.nextInt();
        System.out.println("你输入的是" + num);

        //获取键盘输入的字符串
        String str = sc.next();
        System.out.println("你输入的是" + str);

    }

}
