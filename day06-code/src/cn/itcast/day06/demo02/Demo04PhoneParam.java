package cn.itcast.day06.demo02;

public class Demo04PhoneParam {

    public static void main(String[] args) {

        Phone p = new Phone();
        p.brand = "培根";
        p.price = 8848.44;
        p.colour = "彩虹色";

        method(p); // 传递的其实是地址值

    }

    public static void method(Phone param) {
        System.out.println(param.brand); // 培根
        System.out.println(param.price); // 8848.44
        System.out.println(param.colour); // 彩虹色
    }

}
