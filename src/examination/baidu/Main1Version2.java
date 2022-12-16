package examination.baidu;

import java.util.Scanner;

public class Main1Version2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int n = N * K;
        int[][] num = new int[N][N];
        int[][] res = new int[n][n];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                num[i][j] = in.nextInt();
                if (num[i][j] == 1) {
                    for (int z = i * K; z < i * K + K; z++) {
                        for (int y = j * K; y < j * K + K; y++) {
                            res[z][y] = 1;
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }

    }
}
