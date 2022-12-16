package examination.threehundredandsixty;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
        }
        Arrays.sort(score);
        int[] grade = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (i == n - 1) {
                grade[i] = 100;
            } else {
                if (score[i] == score[i + 1]) {
                    grade[i] = grade[i + 1];
                } else if (score[i] < score[i + 1]) {
                    grade[i] = grade[i + 1] - 1;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            float sumScore = (float) (p * grade[i] * 0.01 + q * score[i] * 0.01);
            if (sumScore > 60) {
                max++;
            }
        }
        System.out.println(max);
    }
}
