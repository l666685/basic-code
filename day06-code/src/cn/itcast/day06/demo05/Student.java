package cn.itcast.day06.demo05;
/*
一个标准的类通常要用有下面四个组成部分：

1. 所有的成员变量都要使用private关键字私有化修饰
2. 为每一个成员变量编写一对Setter/Getter方法
3. 一个无参构造方法
4. 一个全参构造方法

这样标准的类也叫做Java Bean
 */
public class Student {

    private String name; // 姓名
    private int age; // 年龄

    public Student() {}
    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
