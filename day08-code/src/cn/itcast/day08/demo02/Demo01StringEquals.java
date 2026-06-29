package cn.itcast.day08.demo02;

/*
==是进行对象的地址值比较，如果确实需要字符串的内容比较，可以使用两个方法：

public boolean equals(Object obj);
参数可以是任何对象，只有参数是一个字符串并且内容
完全相同时才会返回true，否则是false
×：任何对象都能用object接收。
×：如果比较一个常量和一个变量，把常量放在前面，否则特定情况会报错

public boolean equalsIgnoreCase(String str);忽略大小写进行内容比较
 */
public class Demo01StringEquals {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] chars1 = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(chars1);

        System.out.println(str1.equals(str2)); //true
        System.out.println(str2.equals(str3)); //true
        System.out.println(str3.equals("Hello")); //true
        System.out.println("Hello".equals(str1)); //true

        String str4 = "hello";
        System.out.println(str1.equals(str4)); //false

        System.out.println(str1.equalsIgnoreCase(str4)); // true

        String str5 = null;
        System.out.println("abc".equals(str5)); // 正确,false
        System.out.println(str5.equals("abc")); // 会报错，空指针
    }

}