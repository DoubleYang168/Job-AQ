package examination.NetEase;

public class Main4 {
    public static int minCost = Integer.MAX_VALUE;

    public static void main(String[] args) {

    }

    public int minSailCost(int[][] input) {
        // write code here
        return 0;

    }

    public void dfs(int[][] input, int x, int y, int cost) {
        // 在边界内
        if (x >= 0 && x < input.length && y >= 0 && y < input[0].length) {
            if (input[x][y] != 2) {
                cost += input[x][y];
            }
        } else {
            return;
        }

        // 到达终点，更新结果
        if (x == input.length - 1 && y == input[0].length - 1) {
            minCost = Math.min(minCost, cost);
            return;
        }

        dfs(input, x - 1, y, cost);
        dfs(input, x + 1, y, cost);
        dfs(input, x, y + 1, cost);
        dfs(input, x, y - 1, cost);
        cost -= input[x][y];
    }

}
