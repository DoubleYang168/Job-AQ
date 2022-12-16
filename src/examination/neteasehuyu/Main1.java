package examination.neteasehuyu;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            easyNum(N);
        }
    }

    private static void easyNum(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            int m = n % 10;
            n = n / 10;

            String s = Integer.toBinaryString(m);
            sb.insert(0, s);

        }
        StringBuilder reverse = sb.reverse();
        while (reverse.charAt(0) == '0') {
            reverse.deleteCharAt(0);
        }
//        System.out.println(reverse.toString());
        StringBuilder C = new StringBuilder();
        C.append(reverse.charAt(0));
        for (int j = 1; j < reverse.length(); j++) {
            if (C.charAt(C.length() - 1) != reverse.charAt(j)) {
                C.append(reverse.charAt(j));
            }
        }
        System.out.println(C.toString());
    }
}
