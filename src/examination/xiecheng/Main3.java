package examination.xiecheng;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int[][] score = new int[m][2];
        for (int i = 0; i < m; i++) {
            score[i][0] = sc.nextInt();
            score[i][1] = sc.nextInt();
            System.out.println(score[i][0] + " " + score[i][1]);
        }
        List<Integer> times = new ArrayList<>();
        int t = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                t++;
            }
            if (s.charAt(i) == '0') {
                if (t != 0) {
                    times.add(t);
                    t = 0;
                }
            }
        }
        for (int i = 0; i < times.size(); i++) {
            System.out.println(times.get(i));
        }
    }
}
