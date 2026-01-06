package cn.itcast.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ScoreSore {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("D:/t.txt"));
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] scores = new int[n];
        String[] namesScores = new String[n];
        String[] temp0 = new String[2];

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
            namesScores[i] = (names[i] + " " + scores[i]);
        }

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

        for (int i = 0; i < n; i++) {
            System.out.println(namesScores[i]);
        }

    }

}
