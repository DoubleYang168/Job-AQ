package examination.meituan;

import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[] score = new int[n];
        int m = -1;
        for (int i = 0; i < n; i++) {
            score[i] = scanner.nextInt();
        }
        Arrays.sort(score);
        for (int i = 0; i < n; i++) {
            if (isInArea(n, i, x, y) == true) {
                m = score[i];
                break;
            }
        }
        System.out.println(m);
    }

    public static boolean isInArea(int n, int index, int x, int y) {
        if (index + 1 >= x && index + 1 <= y && n - index >= x && n - index <= y) {
            return true;
        }
        return false;
    }
}
