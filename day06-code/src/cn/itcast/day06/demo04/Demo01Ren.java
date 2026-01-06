package cn.itcast.day06.demo04;

public class Demo01Ren {

    public static void main(String[] args) {
        Ren r = new Ren();
        r.name = "你爹";
        r.sayHello("郭帅杰");
        // 这里是r调用的Ren，所以this就指代的是Ren.java中的成员变量。
        System.out.println(r);
        // 地址值一样，所以。。。
    }

}
