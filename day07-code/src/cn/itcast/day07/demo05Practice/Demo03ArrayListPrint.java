package cn.itcast.day07.demo05Practice;

import java.util.ArrayList;

/*
题目：
定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起集合，@分隔元素
格式参照：{元素@元素@元素}
 */
public class Demo03ArrayListPrint {

    //效果展示
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //方法在这
        PracticeUsedMethod Method = new PracticeUsedMethod();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        Method.print(list);
    }

}
