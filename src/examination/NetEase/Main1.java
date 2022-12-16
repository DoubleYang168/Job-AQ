package examination.NetEase;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = sc.nextLine();
        String[] s1 = s.trim().split(" ");
        int[] array = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            array[i] = Integer.valueOf(s1[i]);
        }
        int M = Integer.valueOf(s2);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] <= M) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}
