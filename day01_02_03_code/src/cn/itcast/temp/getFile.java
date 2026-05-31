package cn.itcast.temp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class getFile {

    public Scanner fileContent(String path){
        Scanner Rules;
        Scanner readPathName;
        String filePath;

        try {
            Rules = new Scanner(new File(path));
            return Rules;
        } catch (FileNotFoundException e) {
            System.out.println("未读取到默认规则文件！");
            System.out.println("请输入规则文件路径，或是输入exit退出");
            readPathName = new Scanner(System.in);
            filePath = readPathName.nextLine();
            if (!Objects.equals(filePath, "exit")) {
                try {
                    Rules = new Scanner(new File(filePath));
                    return Rules;
                } catch (FileNotFoundException ex) {
                    System.out.println("文件仍未找到！");
                    System.exit(1);
                }
            } else {
                System.exit(0);
            }
        }
        return null;
    }

    public Scanner fileContent(){
        Scanner Rules;
        Scanner readPathName;
        String filePath;

        System.out.println("请输入规则文件路径，或是输入exit退出");
        readPathName = new Scanner(System.in);
        filePath = readPathName.nextLine();
        if (!Objects.equals(filePath, "exit")) {
            try {
                Rules = new Scanner(new File(filePath));
                return Rules;
            } catch (FileNotFoundException ex) {
                System.out.println("文件仍未找到！");
                System.exit(1);
            }
        } else {
            System.exit(0);
           }

        return null;
    }

    public int numOfFileContent(Scanner Doc){
        int num = 0;
        for (int i = 0; i != -1; i++) {
            if(Doc.hasNextLine()){
                num++;
                Doc.nextLine();
            } else {
                break;
            }
        }
        return num;
    }

}
