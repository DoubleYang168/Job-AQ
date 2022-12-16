package examination.NetEase;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().trim().split(" ");
        // 转成数字数组
        int[] age = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            age[i] = Integer.valueOf(s[i]);
        }
        int[] paper = new int[age.length];
        for (int i = 0; i < paper.length; i++) {
            paper[i]++;
        }
        if (age.length == 1) {
            System.out.println(1);
            return;
        }
        int i = 1;
        while (i != 0) {
            int left = (i - 1 + age.length) % age.length;
            if (age[i] > age[left]) {
                paper[i] = paper[left] + 1;
            }
            i = (i + 1 + age.length) % age.length;
        }
        int count = 0;
        for (int j = 0; j < paper.length; j++) {
            count += paper[j];
        }
        System.out.println(count);
    }
}
