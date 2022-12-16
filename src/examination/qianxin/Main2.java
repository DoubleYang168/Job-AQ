package examination.qianxin;

public class Main2 {
    public static void main(String[] args) {

    }

    public int getMaximumResource(int[][] grid) {
        // write code here
        return 0;
    }

    public int search(int i, int j, int[][] grid) {
        int sum = 0;
        if (j > 0 && grid[i][j - 1] > 0) {
            int temp = grid[i][j];
            int oneSum = grid[i][j] + search(i, j - 1, grid);
            if (oneSum > sum) {
                grid[i][j] = 0;
                sum = oneSum;
            }
        }
        if (i + 1 < grid.length && grid[i + 1][j] > 0) {
            return grid[i][j] + search(i + 1, j, grid);
        }
        if (i + 1 < grid.length && j + 1 < grid[0].length && grid[i + 1][j + 1] > 0) {
            return grid[i][j] + search(i + 1, j + 1, grid);
        }
        if (i > 0 && j > 0 && grid[i - 1][j - 1] > 0) {
            int oneSum = grid[i][j] + search(i - 1, j - 1, grid);
        }
        return sum;
    }
}
