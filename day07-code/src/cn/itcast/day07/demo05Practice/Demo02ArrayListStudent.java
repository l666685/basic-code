package cn.itcast.day07.demo05Practice;

import java.util.ArrayList;

/*
题目：自定义4个学生对象(姓名，年龄)，添加到集合，并遍历
 */
public class Demo02ArrayListStudent {

    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("永健",18));
        list.add(new Person("帅阳",19));
        list.add(new Person("2324",20));
        list.add(new Person("+7",20));

        for (Person p : list) {
            System.out.println(p.getName()+"  "+p.getAge());
        }



    }

}
