package cn.itcast.day07.demo04Array;

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("帅阳");
        list.add("2324");
        list.add("天泽");
        list.add("永健");
        list.add("+7");
        list.add("艾萨江");

        //遍历：
        //for (int i = 0; i < list.size(); i++) {
        //    System.out.println(list.get(i));
        //}

            //简写：
            for (String s : list) {
                System.out.println(s);
             }
    }
}
