package examination.baidu;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int NK = N * K;
        int[][] res = new int[NK][NK];
        for (int i = 0; i < NK; i++) {
            for (int j = 0; j < NK; j++) {
                res[i][j] = arr[i / N][j / N];
            }
        }
        for (int i = 0; i < NK; i++) {
            for (int j = 0; j < NK; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
