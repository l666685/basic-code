package cn.itcast.day06.demo04;
/*
局部变量和类的成员名称重名的时候采用就近原则，即使用方法内的局部变量
如若想在这种情况下访问成员变量，格式为：
this.成员变量名

“通过谁调用的方法，谁就是this”
这句话的具体示例在Demo01Ren.java的8~11行。
 */
public class Ren {

    String name; // 我的名字

    // 参数who是对方的名字
    // 成员变量name是自己的名字
    public void sayHello(String name) {
        System.out.println(name + "你好，我是" + this.name + "。");
        System.out.println(this);
    }

    public Ren() {
        System.out.println("我是构造方法.txt");
    }

}
