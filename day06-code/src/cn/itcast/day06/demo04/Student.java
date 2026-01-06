package cn.itcast.day06.demo04;
/*
构造方法是专门用来创建对象的方法。
当我们通过关键字new来创建对象时，其实就是在调用构造方法
格式：
public 类名称(参数类型 参数名称) {
    方法体
}

注意：
1. 构造方法的名称必须和所在的类名称完全一样，包括大小写。
2. 构造方法不写返回值类型，也没有void
3. 构造方法不能return一个具体地返回值
4. 如果没有编写任何构造方法，那么编译器将会默认赠送一个构
造方法，参数，方法体都为空：
public Student() {}
5. 编写至少一个构造方法时，编译器不在赠送
6. 构造方法也可以重载，即参数列表不同。
 */
public class Student {

    // 成员变量
    private String name;
    private int age;

    // 无参构造方法
    public Student() {
        System.out.println("我是无参构造方法.txt");
    }

    // 全参构造方法
    public Student(String name, int age) {
        this.name = name;
        if (age < 0 || age > 100) {
            System.out.println("不接受不合法的数值喵～");
            System.exit(1);
        } else {
            this.age = age;
        }
        System.out.println("我是全参构造方法.txt");
    }

    // Getter/Setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            System.out.println("不接受不合法的数值喵～");
            System.exit(1);
        } else {
            this.age = age;
        }
    }

    public void saySomething(String str){
        System.out.println("我叫" + name + "，今年" + age + "岁了，你输入的参数为"+str+"。");
    }

}
