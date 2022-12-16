package examination.other;// 本题为考试单行多行输入输出规范示例，无需提交，不计分。

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] positionArray = new int[n];
        for (int i = 0; i < n; i++) {
            int position = in.nextInt();
            positionArray[i] = position;
        }
        int max = Integer.MIN_VALUE;
        int index = 0;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            int noise = positionArray[i] - positionArray[i - 1];
            if (noise > max) {
                max = noise;
                index = i;
            }
            if (noise > 1) {
                sum += noise;
            }
        }
        if (k <= 0 || k > sum || max == 1) {
            System.out.println(max);
        } else {
            int min = (sum / (k + 1));
            System.out.println(min);
        }
    }
}