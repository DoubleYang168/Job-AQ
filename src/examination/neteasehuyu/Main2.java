package examination.neteasehuyu;

import java.util.Scanner;

public class Main2 {
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
        int i = m - 1;
        int count = 0;
        while (i >= 0) {
            if (map[i] > y) {
                break;
            }
            i--;
        }
        while (i - 1 >= 0) {
            if (map[i] - map[i - 1] < 0) {
                count++;
            }
            i = i - 2;
        }
        i = m - 1;
        while (i < map.length) {
            if (map[i] > y) {
                break;
            }
            i++;
        }
        while (i + 1 < map.length) {
            if (map[i] - map[i + 1] > 0) {
                count++;
            }
            i = i + 2;
        }
        System.out.println(count);
    }



    /*
    import java.util.Arrays;
import java.util.Scanner;

public class Main {
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
        int curDiff = 0;
        int preDiff = 0;
        int result = 0;
        for (int i = 0; i < map.length - 1; i++) {
            curDiff = map[i+1] - map[i];
            // 出现峰值
            if (preDiff >= 0 && curDiff < 0) {

                    result++;

                preDiff = curDiff;
            }
        }
        System.out.println(result);
    }
}

     */
}
