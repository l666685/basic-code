package cn.itcast.day06.demo04;

public class Demo02Student {

    public static void main(String[] args) {
        Student stu = new Student("6",9);//含参构造
        Student stu1 = new Student();//无参构造

        stu.saySomething("456");
        stu1.saySomething("567");
    }

}
