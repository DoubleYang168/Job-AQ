package now.alibaba;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine().trim());
        String color = sc.nextLine().trim();
        int red = 0, blue = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < color.length(); i++) {
            if (i == 0) {
                sb.append(color.charAt(i));
            } else {
                if (sb.charAt(sb.length() - 1) != color.charAt(i)) {
                    sb.append(color.charAt(i));
                }
            }
        }
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'B') {
                blue++;
            } else {
                red++;
            }
        }
        if (red == 0 || blue == 0) {
            System.out.println(1);
        } else {
            int min = Math.min(red, blue);
            System.out.println(min + 1);
        }
    }
}
