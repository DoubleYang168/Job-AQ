package simulation.nowcoder;

import java.util.Arrays;

public class NC91 {
    public static void main(String[] args) {
        NC91 nc91 = new NC91();
        int[] arr = {2, 3, 1, 2, 3};
        int[] lis = nc91.LIS(arr);
//        int[] test = {1,2,5,8};
//        int i = nc91.binarySearch(test, 4, test.length);
//        System.out.println(test[i]);
        System.out.println(Arrays.toString(lis));
    }

    public int[] LIS(int[] arr) {
        // write code here
        if (arr.length == 0) return new int[0];
        // dp[i]是长度i+1的递增子序列的末尾元素的值
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        // maxLen[i]表示以arr[i]为结尾的递增子序列的最大长度
        int[] maxLen = new int[arr.length];
        maxLen[0] = 1;
        // len是最长递增子序列长度
        int len = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > dp[len - 1]) {
                dp[len] = arr[i];
                len++;
                maxLen[i] = len;
            } else {
                // 找到dp中第一个比arr[i]大的元素，替换成arr[i]
                int t = binarySearch(dp, arr[i], len);
                dp[t] = arr[i];
                maxLen[i] = t + 1;
            }
        }
        int[] res = new int[len];
        int curLen = len;
        // 这里是倒序遍历，找到满足长度的就记录
        for (int i = arr.length - 1; i >= 0; i--) {
            if (maxLen[i] == curLen) {
                res[--curLen] = arr[i];
            }
        }
        return res;
    }

    public int binarySearch(int[] value, int target, int length) {
        int left = 0, right = length - 1;
        // 左闭右闭
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target > value[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
