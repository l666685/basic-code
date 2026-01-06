package cn.itcast.day06.demo03;
/*
对于boolean值，Getter方法要写成isXxx，Setter方法不变。
 */
public class Student {

    private String name;
    private int age;
    private boolean male; // 是不是男的

    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int num) {
        if (num > 0 && num <= 100) {
            age = num;
        } else {
            System.out.println("谁家好人年龄为负啊？");
            System.exit(1);
        }
    }
    public int getAge() {
        return age;
    }

    public void setMale(boolean bool) {
        male = bool;
    }

    public boolean isMale() {
        return male;
    }

    public String getMale() {
        if (male) {
            return "男";
        } else {
            return "女";
        }
    }

}
