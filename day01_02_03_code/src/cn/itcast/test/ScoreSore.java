package cn.itcast.test;
/*
7-4 成绩排序
分数 10
单位 枣庄学院
给出班里某门课程的成绩单，请你按成绩从高到低对成绩单排序输出，如果有
相同分数则名字字典序小的在前。

输入格式:
第一行为n (0 < n < 20)，表示班里的学生数目；

接下来的n行，每行为每个学生的名字和他的成绩, 中间用单个空格隔开。

名字只包含字母且长度不超过20，成绩为一个不大于100的非负整数。

输出格式:
把成绩单按分数从高到低的顺序进行排序并输出，每行包含名字和分数两项，之间有一个空格。

输入样例:
在这里给出一组输入。例如：

4
Kitty 80
Alzheimer 90
Joey 92
Tim 28
输出样例:
在这里给出相应的输出。例如：

Joey 92
Alzheimer 90
Kitty 80
Tim 28
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ScoreSore {

    public static void main(String[] args) {

        // 读取文件，设置初始变量
        Scanner sc = null;
        Scanner readFilePath;
        String filePath;

        // 我靠，我发现File类如果不手动设置参数的话是忽略大小写的
        // 我真牛逼QWQ
        try {
            sc = new Scanner(new File("D:\\BianChen\\basic-code\\day01_02_03_code\\src\\cn\\itcast\\temp\\t.txt"));
        } catch (FileNotFoundException e) {
            try {
                System.out.println("文件未找到！请自行输入文件完整路径，或是输入exit退出：");
                readFilePath = new Scanner(System.in);
                filePath = readFilePath.nextLine();
                if (!Objects.equals(filePath, "exit")) {
                    /*
                    括号内我原本想用(filePath != "exit")的，结果不符合预期，
                    但编译器提供了一种写法(如上)，雀食好用。
                     */
                    sc = new Scanner(new File(filePath));
                } else {
                    System.exit(0);
                }
            } catch (FileNotFoundException ex) {
                System.out.println("文件仍未找到！");
                System.exit(404);
            }
        }

        int n;
        n = sc.nextInt();
        String[] names = new String[n];
        int[] scores = new int[n];
        String[] namesScores = new String[n];
        String[] temp0 = new String[2];
        int temp1;
        String temp2;

        // 将名字和成绩分别录入两个数组
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            scores[i] = Integer.parseInt(sc.next());
        }

        // 对成绩排序的同时排序名字
        for (int i = 0; i < scores.length - 1; i++) {
            for (int g = 0; g < scores.length - 1 - i; g++) {
                if (scores[g] < scores[g + 1]) {
                    // 成绩
                    temp1 = scores[g];
                    scores[g] = scores[g + 1];
                    scores[g + 1] = temp1;
                    // 名字
                    temp2 = names[g];
                    names[g] = names[g + 1];
                    names[g + 1] = temp2;
                }
            }
        }

        // 组合名字和成绩
        for (int i = 0; i < n; i++) {
            namesScores[i] = (names[i] + " " + scores[i]);
        }

        // 对成绩相同的人按名字排序
        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < n - 1; i++) {
                if (scores[i] == scores[i + 1]) {
                    temp0[0] = namesScores[i];
                    temp0[1] = namesScores[i + 1];
                    Arrays.sort(temp0, String.CASE_INSENSITIVE_ORDER);
                    namesScores[i] = temp0[0];
                    namesScores[i + 1] = temp0[1];
                }
            }
        }

        // 打印输出
        for (int i = 0; i < n; i++) {
            System.out.println(namesScores[i]);
        }

        System.exit(0);

    }

}
