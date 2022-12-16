package examination.redbooklet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> wList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();
        int[][] cost = new int[wList.size()][2];
        int N = sc.nextInt();
        int white = 0, black = 0;
        for (int i = 0; i < N; i++) {
            int pos = sc.nextInt();
            if (pos == 1) {
                white++;
            } else if (pos == 2) {
                black++;
            } else if (pos == 0) {
                wList.add(sc.nextInt());
                bList.add(sc.nextInt());
            }
        }
        for (int i = 0; i < wList.size(); i++) {
            cost[i][0] = wList.get(i);
            cost[i][1] = bList.get(i);

        }
        // 算他们差几个
        if (white < black) {

        }
        int sub = white - black;

        if ((sub + wList.size()) % 2 != 0) {
            System.out.println(-1);
            return;
        } else {
            // 说明还是可以过河的
            int subCost = Integer.MAX_VALUE;
            System.out.println(8);
        }

    }
    public void choose(int[][] cost, int white, int black) {
        for (int i = 0; i < cost.length; i++) {

        }
    }

}
