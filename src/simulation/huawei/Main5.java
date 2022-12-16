package simulation.huawei;

public class Main5 {
    public static void main(String[] args) {
        int i = maxlenEqualK(new int[]{1, -2, 1, 1, 1}, 0);
        System.out.println(i);
    }

    public static int maxlenEqualK(int[] arr, int k) {
        // write code here
        int maxLen = Integer.MIN_VALUE;
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            int sum = arr[i];
            for (int j = i + 1; j < len; j++) {
                sum += arr[j];
                if (sum == k && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                }
            }
        }
        return maxLen;
    }
}
