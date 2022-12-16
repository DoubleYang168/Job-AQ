package examination.neteasehuyu;

import java.util.Scanner;

public class Main2Version2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] map = new int[N];
            for (int j = 0; j < N; j++) {
                map[j] = sc.nextInt();
            }
            maxSee(map, M);
        }
    }

    private static void maxSee(int[] map, int m) {
        int y = map[m - 1];
        int count = 0;
        for (int i = 0; i < map.length; i++) {
            if (i == m - 1) {
                continue;
            }
            if (map[i] > y) {
                count++;
            }
        }
        System.out.println(count);
    }
}
