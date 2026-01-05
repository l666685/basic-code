package cn.itcast.day06.demo02;

public class Demo05PhoneReturn {

    public static void main(String[] args) {
        Phone pp = getPhone();
        System.out.println(pp);

        System.out.println(pp.brand); // 培根
        System.out.println(pp.price); // 8848.44
        System.out.println(pp.colour); // 彩虹色
    }

    public static Phone getPhone() {
        Phone p = new Phone();
        p.brand = "培根";
        p.price = 8848.44;
        p.colour = "彩虹色";
        System.out.println(p);

        return p;
    }

}
