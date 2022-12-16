package examination.tencent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
//        List<Integer> personNums = new ArrayList<>();
//        List<Integer> weightNums = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int w = sc.nextInt();
            int [] personWeight = new int[n];
            for (int j = 0; j < n; j++) {
                personWeight[j] = sc.nextInt();
            }
            System.out.println(personWeight.length);
        }
    }
}
