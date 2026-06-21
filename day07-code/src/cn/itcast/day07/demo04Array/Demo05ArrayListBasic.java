package cn.itcast.day07.demo04Array;

import java.util.ArrayList;

/*
想向ArrayList添加基本类型的元素，必须使用基本类型对应的包装类

    基本类     包装类(引用类型，包装类都位于java.lang包下)
    byte      Byte
    short     Short
    int       Integer
    long      Long
    float     Float
    double    Double
    char      Character
    boolean   Boolean

从JDK1.5+开始，支持自动拆箱，自动装箱
自动装箱：基本类型 --> 包装类型
自动拆箱：包装类型 --> 基本类型
 */
public class Demo05ArrayListBasic {

    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>();

        //ArrayList<int> listB = new ArrayList<>();
        //请将以上的写法改成下面的
        ArrayList<Integer> listB = new ArrayList<>();

        listB.add(100);
        listB.add(200);
        System.out.println(listB);

        System.out.println(listB.get(1));

    }

}
