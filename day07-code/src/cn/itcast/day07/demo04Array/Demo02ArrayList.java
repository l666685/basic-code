package cn.itcast.day07.demo04Array;

import java.util.ArrayList;

/*
数组长度无法改变
但集合（这个）的长度可以随意改变

对于ArrayList来说，有一个<E>代表泛型（说明其中的所有元素统一是什么类型）
<E>只能是引用类型，不能是基本类型。

扩展：与Array不同的是，直接打印不会获得地址值，而是直接输出其内容
内容为空则会输出[]
 */
public class Demo02ArrayList {

    public static void main(String[] args) {
        //创建了一个ArrayList集合，名称是list，元素类型全是String。
        //从JDK1.7开始，右侧的尖括号内部可以留空，但是还是要有<>本身。
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);// []

        //添加元素：add
        list.add("我是1号");
        System.out.println(list);//[我是1号]
        list.add(0,"我是2号");
        System.out.println(list);//[我是2号，我是1号]
        list.add(0,"我是3号");
        System.out.println(list);//[我是3号，我是2号，我是1号]
    }

}
