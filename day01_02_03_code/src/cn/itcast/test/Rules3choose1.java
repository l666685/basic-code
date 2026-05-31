package cn.itcast.test;

import java.util.*;
/*
有问题没写完
 */
import cn.itcast.temp.getFile;

public class Rules3choose1 {
    public static void main(String[] args) {

        // 以下为寻找规则文件
        String path = "D:\\BianChen\\basic-code(new)\\day01_02_03_code\\src\\cn\\itcast\\temp\\Rules.txt";
        Scanner File = new getFile().fileContent(path);

        //以下为功能实现
        Random roll = new Random();
        int num = new getFile().numOfFileContent(new getFile().fileContent(path));
        System.out.println("有" + num + "规则");
        String[] allRules = new String[num];
        String[] enableRules =  new String[num];
        int numOfEnableRules = 0;
        System.out.println("这是所有规则：");
        for (int i = 0; i < num; i++) {
            allRules[i] = File.next();
        }
        ArrayList<String> disableRule = new ArrayList<>(Arrays.asList(allRules));

        System.out.println(Arrays.toString(allRules));
        for (int i = 0; i != -1 ; i++) {
            System.out.println("1:抽取一条规则");
            System.out.println("2:查看所有已启用规则");
            String input = new Scanner(System.in).nextLine();
                for (int j = 0; j != -1; j++) {
                    if (Objects.equals(input, "1")) {
                        if (numOfEnableRules <= num-2) {
                            int r1 = roll.nextInt(num);
                            int r2 = roll.nextInt(num);
                            int r3 = roll.nextInt(num);
                            if (r1 != r2 && r2 != r3 && r3 != r1) {
                                System.out.println("规则1:" + allRules[r1]);
                                System.out.println("规则2:" + allRules[r2]);
                                System.out.println("规则3:" + allRules[r3]);
                                if (new Scanner(System.in).nextLine().equals("1")) {
                                    enableRules[numOfEnableRules] =allRules[r1];
                                    disableRule.remove(allRules[r1]);
                                }else if (new Scanner(System.in).nextLine().equals("2")) {
                                    enableRules[numOfEnableRules] =allRules[r2];
                                    disableRule.remove(allRules[r2]);
                                }else if (new Scanner(System.in).nextLine().equals("3")) {
                                    enableRules[numOfEnableRules] =allRules[r3];
                                    disableRule.remove(allRules[r3]);
                                }
                                numOfEnableRules++;
                                break;
                            } else {
                                break;
                            }
                        }else if (numOfEnableRules <= num-1) {
                            System.out.println();
                        }
                    } else if(Objects.equals(input, "2")) {
                        ArrayList<String> temp = new ArrayList<>(Arrays.asList(enableRules));
                        for (int k = 0; k < num-numOfEnableRules; k++) {
                            temp.remove(null);
                        }
                        System.out.println(Arrays.toString(temp.toArray()));
                        break;
                    }
                }
        }

    }
}