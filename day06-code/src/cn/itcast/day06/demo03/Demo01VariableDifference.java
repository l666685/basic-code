package cn.itcast.day06.demo03;
/*
局部变量和成员变量

1.定义的位置不一样【重点】
局部变量：在方法的内部
成员变量：在方法的外部，直接写在类当中

2.作用范围不一样【重点】
局部变量：只有方法当中才可以使用，出了方法就不能再用
成员变量：整个类全都可以通用。

3.默认值不一样【重点】
局部变量：没有默认值，如果要想使用，必须手动进行赋值
成员变量：如果没有赋值，会有默认值，规则和数组一样

4.内存位置不一样
局部变量：栈内存
成员变量：堆内存

5.生命周期不一样
局部变量：方法进栈诞生，出栈消失【短】
成员变量：对象创建诞生，回收消失（无法手动控制）【概率长】
 */
public class Demo01VariableDifference {

    String name;

    public void methodA() {
        int num = 20;
        System.out.println(num);
        System.out.println(name);
    }

    public void methodB(int param) { // 方法参数就是局部变量
        System.out.println(param); // 参数调用时必须赋值所以不报错
        int age;
//      System.out.println(age); // 没赋值不能用
//      System.out.println(num); // 错误写法
        System.out.println(name);
    }

}
