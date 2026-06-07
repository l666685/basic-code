package cn.itcast.test;

import java.util.*;
/*
写完了，记得有时间补一下注释然后用方法优化一下重复的部分。
 */
import cn.itcast.temp.GetFile;
import cn.itcast.temp.ScannerProcessing;

public class Rules3choose1 {

    static Random roll = new Random();
    static Scanner sc = new Scanner(System.in);
    static ScannerProcessing SP = new ScannerProcessing();
    static ArrayList<String> enableRules = new ArrayList<>();
    static ArrayList<String> disableRules = new ArrayList<>();
    static String[] allRules;
    static int numOfEnableRules;

    public static void main(String[] args) {

        // 以下为寻找规则文件
        GetFile g = new GetFile();
        String path = "D:\\BianChen\\basic-code(new)\\day01_02_03_code\\src\\cn\\itcast\\temp\\Rules.txt";
        Scanner file = g.fileContent(path);

        //以下为功能实现
        numOfEnableRules = 0;
        disableRules = SP.writeScannerToArrayList(file);
        file.close();
        allRules = disableRules.toArray(new String[0]);

        if (allRules.length == 0) {
            System.out.println("文件为空！请重新启动程序并重新选择目录！");
            System.exit(1);
        }

        System.out.println("注意：如若在三选一的时候输入错误参数，则系统将随机选择一条激活。");
        while (true) {
            menu();
            switch (sc.nextLine()) {
                case "1":
                    threeChooseOne(disableRules.size());
                    break;
                case "2":
                    showAllRules();
                    break;
                case "3":
                    showEnableRules();
                    break;
                case "4":
                    showDisableRules();
                    break;
                case "5":
                    System.exit(0);
                case "":
                    System.out.println();
                    System.out.println("请不要空敲");
                    System.out.println();
                    break;
                default:
                    System.out.println();
                    System.out.println("参数输入错误");
                    System.out.println();
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("1:抽取一条规则");
        System.out.println("2:查看所有规则");
        System.out.println("3:查看所有已启用规则");
        System.out.println("4:查看所有未启用规则");
        System.out.println("5:退出");
        System.out.println();
    }

    public static void showAllRules() {
        System.out.println();
        System.out.println("这是所有规则：");
        SP.showArrays(allRules, allRules.length);
        System.out.println();
    }

    public static void showEnableRules() {
        if (enableRules.isEmpty()) {
            System.out.println();
            System.out.println("未启用任何一条规则");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("以下是所有已启用规则：");
            SP.showArrayList(enableRules);
            System.out.println();
        }
    }

    public static void showDisableRules() {
        System.out.println();
        if (disableRules.isEmpty()) {
            System.out.println("全部规则均已启用");
            System.out.println();
        } else {
            System.out.println("以下为未启用规则：");
            SP.showArrayList(disableRules);
            System.out.println();
        }
    }

    public static void threeChooseOne(int total) {

        String roll1;
        String roll2;
        String roll3;

        System.out.println();
        if (total > 2) {
            while (true) {
                int r0 = roll.nextInt(total);
                int r1 = roll.nextInt(total);
                int r2 = roll.nextInt(total);
                if (r1 != r2 && r2 != r0 && r0 != r1) {
                    roll1 = disableRules.get(r0);
                    roll2 = disableRules.get(r1);
                    roll3 = disableRules.get(r2);
                    System.out.println("选项1:" + roll1);
                    System.out.println("选项2:" + roll2);
                    System.out.println("选项3:" + roll3);
                    System.out.println();
                    System.out.println();
                    switch (sc.nextLine()) {
                        case "1":
                            enableRules.add(roll1);
                            disableRules.remove(roll1);
                            System.out.println("已启用选项1：" + roll1);
                            break;
                        case "2":
                            enableRules.add(roll2);
                            disableRules.remove(roll2);
                            System.out.println("已启用选项2：" + roll2);
                            break;
                        case "3":
                            enableRules.add(roll3);
                            disableRules.remove(roll3);
                            System.out.println("已启用选项3：" + roll3);
                            break;
                        default:
                            wrongType(roll1, roll2, roll3);
                    }
                    System.out.println();
                    numOfEnableRules++;
                    break;
                }
            }
        } else if (total == 2) {
            System.out.println("规则库仅剩两项规则");
            System.out.println("选项1:" + disableRules.get(0));
            System.out.println("选项2:" + disableRules.get(1));
            System.out.println();
            switch (sc.nextLine()) {
                case "1":
                    enableRules.add(disableRules.get(0));
                    System.out.println("已启用选项1：" + disableRules.get(0));
                    disableRules.remove(0);
                    System.out.println();
                    break;
                case "2":
                    enableRules.add(disableRules.get(1));
                    System.out.println("已启用选项2：" + disableRules.get(1));
                    System.out.println();
                    disableRules.remove(1);
                    break;
                default:
                    wrongType(disableRules.get(0), disableRules.get(1));
            }
            numOfEnableRules++;
        } else if (total == 1) {
            System.out.println("已生效最后一条规则：");
            System.out.println(disableRules.get(0));
            enableRules.add(disableRules.get(0));
            disableRules.remove(0);
            System.out.println();
            numOfEnableRules++;
        } else if (total == 0) {
            System.out.println("规则库已无未启用规则");
            System.out.println();
        }
    }

    public static void wrongType(String roll1, String roll2, String roll3) {

        String temp = null;

        System.out.println();
        System.out.println("输入参数错误，系统自动启用规则：");
        int num = roll.nextInt(3);
        switch (num) {
            case 0:
                temp = roll1;
                break;
            case 1:
                temp = roll2;
                break;
            case 2:
                temp = roll3;
                break;
        }
        System.out.print("选项" + (num + 1) + "：");
        System.out.println(temp);
        enableRules.add(temp);
        disableRules.remove(temp);
    }

    public static void wrongType(String roll1, String roll2) {

        String temp = null;

        System.out.println();
        System.out.println("输入参数错误，系统自动启用规则：");
        int num = roll.nextInt(2);
        switch (num) {
            case 0:
                temp = roll1;
                break;
            case 1:
                temp = roll2;
                break;
        }
        System.out.print("选项" + (num + 1) + "：");
        System.out.println(temp);
        enableRules.add(temp);
        disableRules.remove(temp);
    }

}