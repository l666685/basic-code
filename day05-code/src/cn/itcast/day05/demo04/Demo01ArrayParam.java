package cn.itcast.day05.demo04;

public class Demo01ArrayParam {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        printArray(array);

    }

    //如下，数组也可作为参数，传递的参数其实是数组的地址值
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
