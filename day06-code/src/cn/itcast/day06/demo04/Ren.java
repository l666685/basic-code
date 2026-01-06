package cn.itcast.day06.demo04;
/*
局部变量和类的成员名称重名的时候采用就近原则，即使用方法内的局部变量
 */
public class Ren {

    String name; // 我的名字

    // 参数who是对方的名字
    // 成员变量name是自己的名字
    public void sayHello(String name) {
        System.out.println(name + "你好，我是" + this.name + "。");
    }

}
