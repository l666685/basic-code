package cn.itcast.day07.demo04Array;

import java.util.ArrayList;

/*
ArrayList常用方法：

1.public boolean add(E e):集合末尾添加元素，类型与泛型一致
另：add(int index,E e)为在指定地点添加，在其后的索引值自动+1

对于其返回值，该集合(ArrayList)必定成功，所以没意义
其他的集合不一定成功，所以用其验证。

2.public E get(int index):读取指定索引值的元素
3.public E remove(int index)：删除指定索引值的元素，会返回被删的元素
4.public int size()：获取集合长度

 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // []

        //添加：
        boolean success = list.add("帅阳");
        System.out.println(list);
        System.out.println("成功添加？：" + success);
        list.add("2324");
        list.add("天泽");
        list.add("永健");
        list.add("+7");
        list.add("艾萨江");
        list.add("棍母");
        System.out.println("206宿舍成员：" + list);
        System.out.println("？？？");

        //获取元素：
        String me = list.get(1);
        System.out.println("一号索引位置：" + me);

        //删除：
        System.out.println("移出了" + list.remove(6));
        System.out.println("206宿舍成员：" + list);

        //获取长度：
        System.out.println("206有"+list.size()+"人");
    }
}
