package examination.meituan;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            nums[i] = scanner.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            list.add(nums[i]);
            Collections.sort(list);
            sum = sum + prev(nums[i], list) * i;
        }
        System.out.println(sum);
    }

    public static int prev(int n, List<Integer> sortedNums) {
        int prev = 0;
        for (int i = 0; i < sortedNums.size(); i++) {
            if (i >= 1 && n == sortedNums.get(i)) {
                return sortedNums.get(i - 1);
            }
        }
        return 0;
    }
}
