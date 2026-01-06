package cn.itcast.day06.demo03;

public class Demo03Person {

    public static void main(String[] args) {

        Person p = new Person();

        p.name = "郭帅杰";
//        p.age = 18; // 不能直接访问捏
        p.setAge(8);

        System.out.println(p.getAge());
        p.show();

    }

}
