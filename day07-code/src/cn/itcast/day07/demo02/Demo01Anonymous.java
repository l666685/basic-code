package cn.itcast.day07.demo02;
/*
创建对象的标准格式：
类名称 对象名 = new 类名称();

匿名对象就是只有右边的对象，没有左边的名字和赋值运算符。
格式：
new 类名称();
注意事项：匿名对象只得使用一次，下次创建时为全新的
使用建议：只调用一次时使用
 */
public class Demo01Anonymous {

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("不知道");
        p.showName();
        System.out.println("========");

        //以下为匿名对象使用示例：
        new Person().setName("布吉岛");
        new Person().showName(); // null

    }

}
