package cn.itcast.day08.demo02;

/*
字符串的截取方法：

public String substring(int index); 截取从参数位置一直到字符串末尾，返回新字符串。
public String substring(int begin,int end); 截取一个范围：[begin,end)。包含左边，不包含右边。
 */
public class Demo03Substring {
    public static void main(String[] args) {
        String str1 = "HelloWorld";
        String str = str1.substring(5); // World
        System.out.println(str);
        System.out.println("========");

        String Str = str1.substring(4,7);// oWo
        System.out.println(Str);
    }
}
