package examination.huawei;

import java.util.*;

public class Main3 {
    public static List<List<Integer>> res = new ArrayList<>();
    public static List<Integer> path = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int targetValue = sc.nextInt();
        int counts = sc.nextInt();
        int[] arr = new int[counts];
        for (int i = 0; i < counts; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        backTrack(targetValue, M, 0, 0, arr);
        for (List<Integer> list : res) {
            Collections.sort(list);
        }
        HashSet<List<Integer>> set = new HashSet<>(res);
        System.out.println(set.size());
    }


    public static void backTrack(int targetValue, int M, int startIndex, int sum, int[] arr) {
        if (sum > targetValue) {
            return;
        }
        if (path.size() == M) {
            if (sum == targetValue) res.add(new ArrayList<>(path));
            return;
        }
        for (int i = startIndex; i < arr.length; i++) {
            if (i > startIndex && arr[i] == arr[i - 1]) {
                continue;
            }
            path.add(arr[i]);
            sum += arr[i];
            backTrack(targetValue, M, startIndex + 1, sum, arr);
            // 回溯
            path.remove(path.size() - 1);
            sum -= arr[i];
        }
    }

}
