package simulation.alibaba;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] xArr = new int[n];
            int[] yArr = new int[n];
            for (int j = 0; j < n; j++) {
                xArr[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                yArr[j] = sc.nextInt();
            }
            chooseTwo(xArr, yArr);
        }

    }

    private static void chooseTwo(int[] xArr, int[] yArr) {
        int count = 0;
        for (int i = 0; i < xArr.length; i++) {
            boolean[] flag = new boolean[xArr.length];
            for (int j = 0; j < xArr.length; j++) {
                if (xArr[i] > xArr[j] && yArr[i] > yArr[j] && !flag[i]) {
                    flag[i] = true;
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
