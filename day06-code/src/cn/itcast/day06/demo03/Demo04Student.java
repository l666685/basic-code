package cn.itcast.day06.demo03;

public class Demo04Student {
    public static void main(String[] args) {

        Student s = new Student();
        s.setName("你爹");
        s.setAge(18);
        s.setMale(true);

        System.out.println(s.isMale());
        System.out.println("我是" + s.getName() + "，现在" + s.getAge() + "了，是" + s.getMale() + "的。");

    }
}
