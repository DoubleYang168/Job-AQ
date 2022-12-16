package examination.duxiaoman;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] times = new int[n];
        for (int i = 0; i < n; i++) {
            times[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (times[i] - times[i - 1] <= k) {
                count++;
            }
        }
        int gcd = gcd(count, n);
        System.out.println(count / gcd + "/" + n / gcd);
    }

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }
}
