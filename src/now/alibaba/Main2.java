package now.alibaba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Router {
    public int ui;
    public int vi;
    public int ci;

    public Router(int ui, int vi, int ci) {
        this.ui = ui;
        this.vi = vi;
        this.ci = ci;
    }
}

public class Main2 {
    public int minCost = Integer.MAX_VALUE;
    public boolean arrive = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 城市个数
        int m = sc.nextInt(); // 道路个数
        int[] w = new int[n];
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        List<Router> map = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            map.add(new Router(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        int s = sc.nextInt(); // 牛牛起点
        int t = sc.nextInt(); // 牛牛终点

    }
    public void backTrack(List<Router> map, int[] w, int[] p, int cost, int n, int spend, int nowCity) {
        if (spend >= n) {
            return;
        }
        if (arrive && spend == n - 1) {
            minCost = Math.min(minCost, cost);
        }
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).ui != nowCity) {
                continue;
            }
            cost += map.get(i).ci;

            cost -= map.get(i).ci;
        }
    }
}
