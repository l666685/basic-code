package cn.itcast.temp;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDemo {
    public static void main(String[] args) {
        // 1. 将原生数组转为ArrayList
        Integer[] arr = {1, 2, 3, 4, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));

        // 2. 删除元素：可按索引/按值删除
        list.remove(2);          // 删除索引为2的元素（值3）
        // list.remove(Integer.valueOf(3)); // 删除值为3的元素

        // 3. 转回数组（如果需要数组格式）
        Integer[] newArr = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(newArr)); // 输出 [1, 2, 4, 5]
    }
}