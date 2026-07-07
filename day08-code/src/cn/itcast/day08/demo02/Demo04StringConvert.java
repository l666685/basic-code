package cn.itcast.day08.demo02;

/*
在String当中与转换相关的常用方法有：

public char[] toArray(); 将当前字符串拆分成字符数组作为返回值。
public byte[] getBytes(); 获得当前字符串底层的字节数组。
public String replace(CharSequence oldString,CharSequence newString);
将所有出现老字符串替换为新字符串，返回替换之后的结果。
备注：CharSequence意思就是说可以接收字符串类型。
 */
public class Demo04StringConvert {

    public static void main(String[] args) {
        // 转换为字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]); // H
        System.out.println(chars[1]); // e
        System.out.println(chars.length); // 5
        System.out.println("========");

        // 转换为字节数组
        byte[] bytes = "abc".getBytes();
        for (byte aByte : bytes) {
            System.out.println(aByte);
        }
        System.out.println("========");

        // 替换字符串当中的内容
        String str1 = "How do you do?";
        String str2 = str1.replace("o", "*");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("========");

        String lang1 = "SB吧你，脑瘫操作";
        String lang2 = lang1.replace("SB", "**");
        String lang3 = lang2.replace("脑瘫", "**");
        System.out.println(lang1);//SB吧你，脑瘫操作
        System.out.println(lang2);//**吧你，脑瘫操作
        System.out.println(lang3);//**吧你，**操作
    }

}
