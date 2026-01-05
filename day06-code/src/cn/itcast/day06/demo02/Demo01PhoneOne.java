package cn.itcast.day06.demo02;

public class Demo01PhoneOne {

    public static void main(String[] args) {
        Phone p = new Phone();
        System.out.println(p.brand); // null
        System.out.println(p.price); // 0.0
        System.out.println(p.colour);// null
        System.out.println("=========");

        p.brand = "8848炸死你手机";
        p.price = 8848.44;
        p.colour= "世界上没有的颜色";

        System.out.println(p.brand); // 8848炸死你手机
        System.out.println(p.price); // 8848.44
        System.out.println(p.colour);// 世界上没有的颜色
        System.out.println("=========");

        p.call("郭帅杰");
        p.sendMessage();
    }

}
