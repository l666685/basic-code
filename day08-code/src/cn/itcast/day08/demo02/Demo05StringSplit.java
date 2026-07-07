package cn.itcast.day08.demo02;

/*
分割字符串的方法：
public String[] split(String regex); 按照参数的规则将字符串切分成为若干部分。

注意：
split方法的参数其实是一个“正则表达式”，之后会学
现在要知道，如果要按照英文句点“.”进行切分应使用“\\.”（如29行）
 */
public class Demo05StringSplit {

    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc,ddd";
        String[] array1 = str1.split(",");
        for (String str :array1){
            System.out.println(str);
        }
        System.out.println("===========");

        String str2 = "aaa bbb ccc ddd";
        String[] array2 = str2.split(" ");
        for (String str :array2){
            System.out.println(str);
        }
        System.out.println("===========");

        String str3 = "aaa.bbb.ccc.ddd";
        String[] array3 = str3.split("\\.");// 错误写法：(".")
        System.out.println(array3.length); //0
        for (String str :array3){
            System.out.println(str);
        }
    }

}
