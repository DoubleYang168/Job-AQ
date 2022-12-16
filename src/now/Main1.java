package now;

public class Main1 {
    public static void main(String[] args) {
        int[] arr = {2, -3, -1, 5, -4};
        System.out.println(largestSumAfterKNegations(arr, 2));

    }

    public static int largestSumAfterKNegations(int[] nums, int k) {
        int minNum = nums[0];
        int minIndex = 0;
        for (int i = 0; i < k; i++) {
            // 每次选最小的元素换成相反数，进行 k 次
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < minNum) {
                    minNum = nums[j];
                    minIndex = j;
                }
            }
            nums[minIndex] = -nums[minIndex];
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public int largestIsland(int[][] grid) {
        int maxArea = 0;
        boolean hasZero = false;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    hasZero = true;
                    grid[i][j] = 1;
                    int res = dfs(grid, i, j);
                    maxArea = Math.max(maxArea, res);
                    grid[i][j] = 0;
                }
            }
        }
        return hasZero ? maxArea : grid.length * grid[0].length;
    }

    public int dfs(int[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] != 1) {
            return 0;
        }

        grid[r][c] = 2;
        int res = 1 + dfs(grid, r - 1, c) + dfs(grid, r + 1, c) + dfs(grid, r, c - 1) + dfs(grid, r, c + 1);

        return res;

    }
}
