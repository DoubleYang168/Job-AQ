package examination.threehundredandsixty;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // 采用贪心法来补短板
        for (int i = 0; i < m; i++) {
            int minIndex = 0;
            int minValue = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                if (arr[j] < minValue) {
                    minValue = arr[j];
                    minIndex = j;
                }
            }

        }
        // 再找到最短的短板
        int value = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < value) {
                value = arr[i];
            }
        }
        System.out.println(value);
    }
}
