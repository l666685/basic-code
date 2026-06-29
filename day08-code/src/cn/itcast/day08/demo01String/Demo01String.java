package cn.itcast.day08.demo01String;

/*
java.lang.String类代表字符串。
API文档中说：Java 程序中的所有字符串字面值（如 "abc" ）都作为此类的实例实现。
翻译成人话：程序当中的所有的双引号字符串，都是String类的对象。(就算没有new，也照样是。)

特点：
1.字符串的内容永不可变。
2.由于1,所以字符串是可以共享使用的。
3.字符串效果上等同于char[]字符数组，但是底层原理是byte[]字节数组。

创建字符串的常见3+1种方式：
三种构造方法：
public String();  创建一个空白字符串，不含有任何内容。
public String(char[] array);  根据字符数组的内容来创建对应的字符串。
public String(byte[] array);  根据字节数组的内容来创建对应的字符串。
一种直接创建：
String str = "Hello";  即日常使用的方法

注意：直接写上双引号，就是字符串对象。
 */
public class Demo01String {

    public static void main(String[] args) {
        // 使用空参构造
        String str1 = new String(); // 留空，字符串什么都没有
        System.out.println("第一个字符串的内容： " + str1);

        // 根据char[]创建字符串
        char[] chars = {'你', '好', '呀'};
        String str2 = new String(chars);
        System.out.println("第二个字符串的内容： " + str2);

        // 根据byte[]创建字符串
        byte[] bytes = {97, 98, 99};
        String str3 = new String(bytes);
        System.out.println("第三个字符串的内容： " + str3);

        // 直接创建
        String str4 = "def";
        System.out.println("第四个字符串的内容： " + str4);
    }

}
