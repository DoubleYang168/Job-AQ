package examination.jd;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2Version2 {
    static int live;
    static int[] service;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        service = new int[n + 1];
        live = 0;
        ArrayList[] start = new ArrayList[n + 1];
        ArrayList[] stop = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            start[i] = new ArrayList<Integer>();
            stop[i] = new ArrayList<Integer>();
        }
        for (int i = 1; i <= n; i++) {
            int c = sc.nextInt();
            for (int j = 0; j < c; j++) {
                int b = sc.nextInt();
                start[i].add(b);
                stop[i].add(i);
            }
        }
        for (int i = 0; i < q; i++) {
            if (sc.nextInt() == 1) {
                startDfs(n, start, sc.nextInt());
            } else {
                stopDfs(n, stop, sc.nextInt());
            }
            if (i == q - 1) {
                System.out.print(live);
            } else {
                System.out.println(live);
            }
        }
    }
    private static void startDfs(int n, ArrayList[] start, int cur) {
        if (service[cur] == 1) {
            return;
        }
        if (service[cur] == 0) {
            service[cur] = 1;
            live++;
        }
        for (Object i : start[cur]) {
            startDfs(n, start, (Integer)i);
        }
    }
    private static void stopDfs(int n, ArrayList[] stop, int cur) {
        if (service[cur] == 0) {
            return;
        }
        if (service[cur] == 1) {
            service[cur] = 0;
            live--;
        }
        for (Object i : stop[cur]) {
            stopDfs(n, stop, (Integer)i);
        }
    }
}
