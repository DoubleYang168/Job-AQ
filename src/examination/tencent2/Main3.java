package examination.tencent2;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine().trim();
        int[] dp = new int[s.length()];
        dp[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                dp[i] = dp[i - 1] + 1;
            } else if (s.charAt(i) != s.charAt(i - 1)) {
                if (i != 1 && s.charAt(i) == s.charAt(i - 2)) {
                    dp[i] = dp[i - 2] + 1;
                } else {
                    dp[i] = 1;
                }
            }
        }
        System.out.println(dp[n - 1]);
    }
}
