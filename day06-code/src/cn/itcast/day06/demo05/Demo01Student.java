package cn.itcast.day06.demo05;

public class Demo01Student {

    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("小明");
        stu.setAge(24);
        System.out.println(stu.getName() + "，是" + stu.getAge() + "岁男大学生");
        System.out.println("=================");

        Student stu1 = new Student("JoJo", 98);
        System.out.println(stu1.getName() + "，是" + stu1.getAge() + "岁男大学生");

        stu1.setAge(999);// 改参数
        System.out.println(stu1.getName() + "，是" + stu1.getAge() + "岁男大学生");
    }
}
