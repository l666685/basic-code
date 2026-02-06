package cn.itcast.day01_02_03;

/*
break关键字的用法有常见的两种：

1.可以用在switch语句中，一旦执行，整个switch语句理科结束。
2.还可以用在循环语句当中，一旦执行，整个循环语句立刻结束，也就是打断循环。

关于循环的选择：
凡是次数确定的场景多用for循环；否则多用while循环。
*/
public class Demo14Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i >= 4) {
                break; // 打断循环
            }
            System.out.println("Hello " + i);
        }
    }
}