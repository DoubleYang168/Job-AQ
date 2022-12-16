package examination.vivo;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public List<List<Integer>> res = new ArrayList<>();
    public List<Integer> path = new ArrayList<>();

    public static void main(String[] args) {
        Main2 main2 = new Main2();
        int i = main2.workSchedule(5);
        System.out.println(i);
    }

    public int workSchedule (int n) {
        // write code here
        int[] task = {1, 2, 4};
        backTrack(n, task, 0);
//        System.out.println(res.size());
        return res.size();
    }
    public void backTrack(int n, int[] task, int sum) {
        // 找到了数字和为n的组合
        if (sum == n) {
            res.add(path);
            return;
        }
        for (int i = 0; i < task.length; i++) {
            if (sum + task[i] > n) break;
            path.add(task[i]);
            backTrack(n, task, sum + task[i]);
            path.remove(path.size() - 1);
        }
    }
}
