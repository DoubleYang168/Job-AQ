package examination.tme;

public class Main3 {



    public static void main(String[] args) {

    }

    public int FillArray (int[] a, int k) {
        // write code here
        int plus = 1;
        // 首先找出各个0的左右区间
        int start = 0, end = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                continue;
            }
            start = i;
            i++;
            while (i < a.length && a[i] == 0) {
                ++i;
            }
            end = i;
            backTrack(start, end, 0, k, 0);
        }
        // 每个区间中调用回溯

        // 各个区间回溯的结果相乘
        return 0;
    }
    public void backTrack(int left, int right, int sum, int size, int kind) {
        if (sum == size) {
            kind++;
            return;
        }
        for (int i = left; i <= right; i++) {
            sum += 1;
            backTrack(left, right, sum, size, kind);
            sum -= 1;
        }
    }
}
