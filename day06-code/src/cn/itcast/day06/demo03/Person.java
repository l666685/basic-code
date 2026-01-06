package cn.itcast.day06.demo03;
/*
问题描述：定义Person的年龄时，无法阻止不合理的数值被设置。
解决方案：用private关键字将需要保护的成员变量进行修饰。

一旦使用private进行修饰，那么本类当中仍可正常访问，
但超出本类范围之外就不能再直接访问了。

间接访问private成员变量，就是定义一对Getter/Setter方法
必须叫getXxx或setXxx，不能是别的。
对于Getter来说，返回值、参数类型必须和对应成员变量对应
对于Setter来说，没有返回值，参数类型必须和对应成员变量对应
 */
public class Person {

    String name; // 姓名
    private int age; // 年龄

    public void show() {
        System.out.println("我叫" + name + "，今年" + age + "岁了。");
    }

    // 这个成员方法，专门用于向age设置数值
    public void setAge(int num) {
        if (num > 0 && num <= 100) {
            age = num;
        } else {
            System.out.println("谁家好人年龄为负啊？");
            System.exit(1);
        }
    }

    // 这个成员方法，专门用于获取age的数据
    public int getAge() {
        return age;
    }

}
