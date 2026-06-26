package cn.itcast.day07.demo05Practice;

import java.util.ArrayList;

public class PracticeUsedMethod {

    // Demo03ArrayListPrint方法实现
    public void print(ArrayList<String> list) {
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) {
                System.out.print(list.get(i) + "@");
            }
            else {
                System.out.println(list.get(i) + "}");
            }
        }
    }

    // Demo04ArraylistReturn方法实现
    public ArrayList<Integer> get2468(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer num : list) {
            if(num%2 == 0) {
                result.add(num);
            }
        }
        return result;
    }

}
