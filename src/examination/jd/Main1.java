package examination.jd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        char[][] matrix = new char[n][m];
        Map<Character, int[]> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                matrix[i][j] = s.charAt(j);
                map.put(s.charAt(j), new int[]{i, j});
            }
        }

        String scan = sc.next();
        int[] pos = new int[]{0, 0};
        long ans = 0;

        for (int i = 0; i < scan.length(); i++) {
            int curX = pos[0];
            int curY = pos[1];

            char c = scan.charAt(i);
            int[] end = map.get(c);
            int endX = end[0];
            int endY = end[1];

            if (curX == endX && curY == endY) {
                ans += z;
            } else if (curX == endX) {
                ans += Math.abs(curY - endY) * x + z;
                pos = end;
            } else if (curY == endY) {
                ans += Math.abs(curX - endX) * x + Math.abs(curY - endY) * x + y + z;
                pos = end;
            }
        }
        System.out.println(ans + 7);
    }
}
