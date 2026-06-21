package cn.itcast.day07.demo04Array;


/*
题目：
定义一个数组，用来存储3个Person对象

缺点：一旦创建，程序运行期间长度不可以被改变
 */
public class Demo01Array {
    public static void main(String[] args) {
        //首先创建一个长度为三的数组，用来存放Person类型的对象。
        Person[] arr = new Person[3];

        Person one = new Person("帅阳",18);
        arr[0] = one;
        Person two = new Person("+7",19);
        arr[1] = two;
        Person thr = new Person("2324",19);
        arr[2] = thr;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr[0].getName()); //帅阳
    }
}
