package cn.itcast.depends;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class GetFile {
    private String filePath;

    public String getFilePath() {
        return filePath;
    }

    public Scanner fileContent(String path) {
        try {
            System.out.println("文件导入成功");
            return new Scanner(new File(path));
        } catch (FileNotFoundException e) {
            System.out.println("未读取到默认规则文件");
            return fileContent();
        }
    }

    public Scanner fileContent() {
        Scanner Rules;
        Scanner readPathName = new Scanner(System.in);

        System.out.println("请输入规则文件路径，或是输入exit退出");
        while (true) {
            filePath = readPathName.nextLine();
            if (!Objects.equals(filePath, "exit")) {
                if (filePath.isEmpty()) {
                    System.out.println("路径不能为空，请重新输入：");
                }
                try {
                    Rules = new Scanner(new File(filePath));
                    System.out.println("文件导入成功");
                    return Rules;
                } catch (FileNotFoundException ex) {
                    System.out.println("文件仍未找到");
                }
            } else {
                System.exit(0);
            }
        }
    }
}
