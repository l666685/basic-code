package cn.itcast.day06.demo02;

public class Phone {

    String brand; // 品牌
    double price; // 价格
    String colour; // 颜色

    public void call(String who) {
        System.out.println("给" + who + "打电话");
    } // 打电话

    public void sendMessage() {
        System.out.println("群发短信");
    } // 群发短信

}
