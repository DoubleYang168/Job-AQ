package examination.youzan;

public class Main1 {
    public static void main(String[] args) {

    }
    public int totalHammingDistance (int[] nums) {
        // write code here
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int distance = hammingDistance(nums[i], nums[j]);
                sum += distance;
            }
        }
        return sum;
    }
    public int hammingDistance(int a, int b) {
        return Integer.bitCount(a ^ b);
    }
}
