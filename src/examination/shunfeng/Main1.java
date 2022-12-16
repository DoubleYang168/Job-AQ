package examination.shunfeng;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> res = null;
        int maxScore = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int as = sc.nextInt();
            int bs = sc.nextInt();
            int cs = sc.nextInt();
            int ds = sc.nextInt();
            int es = sc.nextInt();
            sum = as * a + bs * b + cs * c + ds * d + es * e;
            if (sum > maxScore) {
                res = new LinkedList<>();
                res.add(i + 1);
                maxScore = sum;
                count = 1;
            } else if (sum == maxScore) {
                res.add(i + 1);
                count++;
            }
        }
        System.out.println(maxScore);
        System.out.println(count);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
}
