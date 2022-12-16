package examination.tencent2;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = getFactors(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            b[i] = getFactors(sc.nextInt());
        }
        int result = 0;
        Arrays.sort(a);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[j] > b[i]) {
                    result++;
                    a[j] = 0;
                    break;
                }
            }
        }
        System.out.println(result);
    }



    public static int getFactors(int n) {
        int count = 0;
        if (n == 0) return count;
        else {
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count += 1;
                }
            }
        }
        return count;
    }
}
