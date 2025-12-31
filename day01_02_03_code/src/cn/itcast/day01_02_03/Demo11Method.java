/*
定义一个方法的格式：
pulic static void 方法名称() {
    方法体
}

方法名称的命名规则和变量一样，使用小驼峰。
方法体：也就是大括号当中可以包含任意条语句。

注意事项：
1.方法定义的先后顺序无所谓。
2.方法的定义不能产生嵌套包含关系。
3.方法定义好了之后，不会执行。如果要想执行，一定要进行方法的[调用]。

如何调用方法，格式：
方法名称();
*/
public class Demo11Method {
    public static void main(String[] args) {
        lowercase_letter(); // 调用小写字母的方法
        number(); // 调用数字的方法
        capital_letter(); // 调用大写字母的方法
        special_character(); // 调用特殊符号的方法
    }

    // 数字
    public static void number() {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
    }

    // 小写字母
    public static void lowercase_letter() {
        System.out.println("q");
        System.out.println("w");
        System.out.println("e");
        System.out.println("r");
        System.out.println("t");
        System.out.println("y");
    }

    // 大写字母
    public static void capital_letter() {
        System.out.println("Q");
        System.out.println("W");
        System.out.println("E");
        System.out.println("R");
        System.out.println("T");
        System.out.println("Y");
    }

    // 特殊符号
    public static void special_character() {
        System.out.println("@");
    }
}