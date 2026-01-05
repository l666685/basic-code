package cn.itcast.day06.demo01;


/*
通常情况下，一个类并不能直接使用，需要根据类创建一个对象才能使用。

1.导包：指出使用的类在哪
import  包名称.类名称;
import cn.itcast.day06.demo01.Student;
对于和当前类属于同一个包的情况，可以省略导包语句不写。

2.创建：
类名称 对象名 = new 类名称();
Student stu = new Student();

3.使用：
使用成员变量：对象名.成员变量名
使用成员方法：对象名.成员方法名(参数)
(想用谁就用对象名.谁)
 */
public class Demo02Student {

    public static void main(String[] args) {
        //导包
        //同一路径下省略

        //创建
        //类名称 对象名 = new 类名称();
        //根据Student类，创建了一个名为stu的对象
        Student stu = new Student();

        //使用
        //使用其中的成员变量，格式：
        //对象名.成员变量名
        System.out.println(stu.name); // null
        System.out.println(stu.age); // 0

        //如何赋值：
        stu.name = "郭帅杰";
        stu.age = 18;

        System.out.println(stu.name);
        System.out.println(stu.age);

        //使用其中的成员方法
        //对象名.成员方法名(参数);
        stu.eat();
        stu.sleep();
        stu.study();

        stu.pure();//null
        //由此看出，当跨文件重新使用成员变量时，会重新赋值
    }

}
