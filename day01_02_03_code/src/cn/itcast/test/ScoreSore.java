package cn.itcast.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScoreSore {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("D:/t.txt"));
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            scores[i] = Integer.parseInt(sc.next());
        }

        int temp1;
        String temp2;
        for (int i = 0; i < scores.length - 1; i++) {
            for (int g = 0; g < scores.length - 1 - i; g++) {
                if (scores[g] < scores[g + 1]) {
                    temp1 = scores[g];
                    scores[g] = scores[g + 1];
                    scores[g + 1] = temp1;
                    temp2 = names[g];
                    names[g] = names[g + 1];
                    names[g + 1] = temp2;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(names[i]+" "+scores[i]);
        }

    }

}
