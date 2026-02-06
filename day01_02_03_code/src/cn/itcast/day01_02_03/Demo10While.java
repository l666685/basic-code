package cn.itcast.day01_02_03;

/*
while循环有一个标准格式，还有一个特殊格式。

标准格式：
while (条件判断) {
    循环体
}

扩展格式：
初始化语句;
while (条件判断) {
    循环体;
    步进语句;
}

*/
public class Demo10While {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("这是for循环中的第" + i + "次");
        }

        System.out.println("");
        System.out.println("=========================");
        System.out.println("");

        int i = 1; // 初始化语句
        while (i <= 10) { // 括号内为判断语句
            System.out.println("这是while循环中的第" + i + "次"); // 循环体
            i++; // 步进语句
        }
    }
}