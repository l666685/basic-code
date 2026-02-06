package cn.itcast.day01_02_03;

/*
与（并且）   &&   比较布尔值，全true才输出true，否则输出false
或（或者）   ||   至少一个是true就输出true，全F才输出false
非（取反）   !    输出相反  (叹号要写在前方)

与“&&”，或“||”，具有短路效果：如果根据左边已经可以判断得到最终结果，
那么右边的代码将不在执行，从而节省一定性能。

注意事项：
1. 逻辑运算符只能用于boolean值。
2. 与、或需要左右各有一个boolean值，取反仅叹号右边有一个。
3. 与、或两种运算符，如果有多个条件，可以连写：
两个条件：条件A && 条件B
多个条件：条件A && 条件B && 条件C && .......

tips：
对于x：(1,3)的情况，应该拆成两个部分，然后使用运算符连接起来：
int x = 2;
1 < x && x < 3
*/
public class Demo09Logic {
    public static void main(String[] args) {
        System.out.println(true && false); // false
        // true && true --> true
        System.out.println(3 < 4 && 10 > 5); // true
        System.out.println("======================");

        System.out.println(true || false); // true
        System.out.println(true || true); // true
        System.out.println(false || false); // false
        System.out.println("======================");

        System.out.println(true); // true
        System.out.println(!true); // false
        System.out.println("======================");

        int a = 10;
        // false && ...
        System.out.println(3 > 4 && ++a < 100); // false
        System.out.println(a); // 10
        System.out.println("======================");

        int b = 20;
        // true || ...
        System.out.println(3 < 4 || ++b < 100); // true
        System.out.println(b); // 20
    }
}