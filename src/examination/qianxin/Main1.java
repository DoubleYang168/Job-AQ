package examination.qianxin;

public class Main1 {

    public static void main(String[] args) {

    }

    public int TeamNums(int[] height) {
        // write code here
        int length = height.length;
        if (length < 3)
            return 0;
        int result = 0;
        for (int j = 0; j < length; j++) {
            for (int k = j; k < length; k++) {
                for (int l = k; l < length; l++) {
                    if (height[j] > height[k] && height[k] > height[l] || height[j] < height[k] && height[k] < height[l]) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
