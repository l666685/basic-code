package cn.itcast.test;

import java.util.*;
/*
写完了，记得有时间补一下注释然后用方法优化一下重复的部分。
 */
import cn.itcast.temp.getFile;

public class Rules3choose1 {
    public static void main(String[] args) {

        // 以下为寻找规则文件
        getFile g = new  getFile();
        String path = "D:\\BianChen\\basic-code(new)\\day01_02_03_code\\src\\cn\\itcast\\temp\\Rules.txt";
        Scanner File = g.fileContent(path);
        path =g.getFilePath();
        int num = g.numOfFileContent(g.fileContent(path));
        if (num == 0){
            System.out.println("文件为空！请重新启动程序并重新选择目录！");
            System.exit(1);
        }

        //以下为功能实现
        Random roll = new Random();
        String[] allRules = new String[num];
        String[] enableRules = new String[num];
        int numOfEnableRules = 0;
        for (int i = 0; i < num; i++) {
            allRules[i] = File.next();
        }
        ArrayList<String> disableRule = new ArrayList<>(Arrays.asList(allRules));

        String temp;
        String temp0;
        String temp1;
        String temp2;
        String temp3 = "";
        int Temp;

        System.out.println("注意：如若在三选一的时候输入错误参数，则系统将随机选择一条激活。");
        for (int i = 0; i != -1; i++) {
            System.out.println("1:抽取一条规则");
            System.out.println("2:查看所有规则");
            System.out.println("3:查看所有已启用规则");
            System.out.println("4:查看所有未启用规则");
            System.out.println("5:退出");
            System.out.println();
            String input = new Scanner(System.in).nextLine();
            for (int j = 0; j != -1; j++) {
                if (Objects.equals(input, "1")) {
                    System.out.println();
                    if (num - numOfEnableRules > 2) {
                        for (int k = 0; k != -1; k++) {
                            int r0 = roll.nextInt(num - numOfEnableRules);
                            int r1 = roll.nextInt(num - numOfEnableRules);
                            int r2 = roll.nextInt(num - numOfEnableRules);
                            if (r1 != r2 && r2 != r0 && r0 != r1) {
                                temp0 = disableRule.get(r0);
                                temp1 = disableRule.get(r1);
                                temp2 = disableRule.get(r2);
                                System.out.println("选项1:" + temp0);
                                System.out.println("选项2:" + temp1);
                                System.out.println("选项3:" + temp2);
                                System.out.println();
                                temp = new Scanner(System.in).nextLine();
                                if (Objects.equals(temp, "1") || Objects.equals(temp, "2") || Objects.equals(temp, "3")) {
                                    System.out.println();
                                    switch (temp) {
                                        case "1":
                                            enableRules[numOfEnableRules] = temp0;
                                            disableRule.remove(temp0);
                                            System.out.println("已启用选项" + temp + "：" + temp0);
                                            break;
                                        case "2":
                                            enableRules[numOfEnableRules] = temp1;
                                            disableRule.remove(temp1);
                                            System.out.println("已启用选项" + temp + "：" + temp1);
                                            break;
                                        case "3":
                                            enableRules[numOfEnableRules] = temp2;
                                            disableRule.remove(temp2);
                                            System.out.println("已启用选项" + temp + "：" + temp2);
                                            break;
                                    }
                                } else {
                                    System.out.println();
                                    System.out.println("输入参数错误，系统自动启用规则：");
                                    Temp = roll.nextInt(3);
                                    switch (Temp) {
                                        case 0:
                                            temp3 = temp0;
                                            break;
                                        case 1:
                                            temp3 = temp1;
                                            break;
                                        case 2:
                                            temp3 = temp2;
                                            break;
                                    }
                                    System.out.print("选项" + (Temp + 1) + "：");
                                    System.out.println(temp3);
                                    enableRules[numOfEnableRules] = temp3;
                                    disableRule.remove(temp3);
                                }
                                System.out.println();
                                numOfEnableRules++;
                                break;
                            }
                        }
                        break;
                    } else if (num - numOfEnableRules == 2) {
                        System.out.println("规则库仅剩两项规则");
                        System.out.println("规则1:" + disableRule.get(0));
                        System.out.println("规则2:" + disableRule.get(1));
                        System.out.println();
                        switch (new Scanner(System.in).nextLine()) {
                            case "1":
                                enableRules[numOfEnableRules] = disableRule.get(0);
                                System.out.println("已启用选项1：" + disableRule.get(0));
                                disableRule.remove(0);
                                System.out.println();
                                numOfEnableRules++;
                                break;
                            case "2":
                                enableRules[numOfEnableRules] = disableRule.get(1);
                                System.out.println("已启用选项2：" + disableRule.get(1));
                                System.out.println();
                                disableRule.remove(1);
                                numOfEnableRules++;
                                break;
                        }
                        break;
                    } else if (num - numOfEnableRules == 1) {
                        System.out.println("已生效最后一条规则：");
                        System.out.println(disableRule.get(0));
                        enableRules[numOfEnableRules] = disableRule.get(0);
                        disableRule.remove(0);
                        System.out.println();
                        numOfEnableRules++;
                        break;
                    } else if (numOfEnableRules == num) {
                        System.out.println("规则库已无未启用规则");
                        System.out.println();
                        break;
                    }
                } else if (Objects.equals(input, "2")) {
                    System.out.println();
                    System.out.println("这是所有规则：");
                    for (int t = 0; t < num; t++) {
                        System.out.println((t + 1) + "：" + allRules[t]);
                    }
                    System.out.println();
                    break;
                } else if (Objects.equals(input, "3")) {
                    ArrayList<String> temp_a = new ArrayList<>(Arrays.asList(enableRules));
                    for (int k = 0; k < num - numOfEnableRules; k++) {
                        temp_a.remove(null);
                    }
                    if (temp_a.isEmpty()) {
                        System.out.println();
                        System.out.println("未启用任何一条规则");
                        System.out.println();
                        break;
                    }
                    System.out.println();
                    System.out.println("以下是所有已启用规则：");
                    for (int o = 0; o != numOfEnableRules; o++) {
                        System.out.println((o + 1) + "：" + temp_a.get(o));
                    }
                    System.out.println();
                    break;
                } else if (Objects.equals(input, "4")) {
                    System.out.println();
                    if (disableRule.isEmpty()) {
                        System.out.println("全部规则均已启用");
                        System.out.println();
                        break;
                    }
                    System.out.println("以下为未启用规则：");
                    for (int k = 0; k < num - numOfEnableRules; k++) {
                        System.out.println((k + 1) + "：" + disableRule.get(k));
                    }
                    System.out.println();
                    break;
                } else if (Objects.equals(input, "5")) {
                    System.exit(0);
                } else if (Objects.equals(input, "")) {
                    System.out.println();
                    System.out.println("请不要空敲");
                    System.out.println();
                    break;
                } else {
                    System.out.println();
                    System.out.println("参数输入错误");
                    System.out.println();
                    break;
                }
            }
        }
    }
}