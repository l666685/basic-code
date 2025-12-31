/*
do-while循环的标准格式：

do {
    循环体;
} while (条件判断);

扩展格式：

初始化语句;
do {
    循环体;
    步进语句;
} while (条件判断);
*/
public class Demo11DoWhlie {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("第" + i + "次循环");
            i++;
        } while (i <= 10);
    }
}