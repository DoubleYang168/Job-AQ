package examination.meituan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        List<int[]> allKNums = new ArrayList<>();
        List<Integer> kList = new ArrayList<>();
        List<Integer> nList = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            int n = scanner.nextInt();
            nList.add(n);
            int k = scanner.nextInt();
            kList.add(k);
            int[] k_nums = new int[n];
            for (int j = 0; j < n; j++) {
                k_nums[j] = scanner.nextInt();
            }
            allKNums.add(k_nums);
        }
        for (int i = 0; i < T; i++) {
            isMeet(nList.get(i), kList.get(i), allKNums.get(i));
        }
    }

    public static void isMeet(int n, int k, int[] k_nums) {
        Arrays.sort(k_nums);
        int x = k_nums[k - 1] + 1;
        if (x <= n && x > k_nums[k - 1]) {
            System.out.println("YES");
            System.out.println(x);
        } else {
            System.out.println("NO");
        }
    }
}
