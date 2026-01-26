package cn.itcast.test;

import java.util.*;

public class Demo59 {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.print("输入你的姓名：");
			String name = s.nextLine();
			System.out.print("输入你的年龄：");
			//final int age = s.nextInt(); //其实这里如果有人故意输入字母会报错，所以可以用字符串类型
			String age = s.nextLine();
			System.out.println("姓名：" + name + "  年龄：" + age);
        }
	}
}