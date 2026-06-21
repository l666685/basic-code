package cn.itcast.depends;


import java.util.ArrayList;
import java.util.Scanner;

public class ScannerProcessing {

    public ArrayList<String> writeScannerToArrayList(Scanner sc) {
        ArrayList<String> list = new ArrayList<>();
        while (sc.hasNextLine()) {
            list.add(sc.nextLine());
        }
        return list;
    }

    public void showArrayList(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ":" + list.get(i));
        }
    }

    public void showArrays(String[] list, int num) {
        for (int i = 0; i < num; i++) {
            System.out.println((i + 1) + ":" + list[i]);
        }
    }

}
