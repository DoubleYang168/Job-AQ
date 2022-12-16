package examination.tencent2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        nums.add(n);
        List<Integer> temp = null;
        while (true) {
            temp = new ArrayList<>();
            boolean flag = false;
            for (int i = 0; i < nums.size(); i++) {
                if (nums.get(i) > 1) {
                    flag = true;
                    temp.add(nums.get(i) / 2);
                    temp.add(nums.get(i) % 2);
                    temp.add(nums.get(i) / 2);
                } else {
                    temp.add(nums.get(i));
                }
            }
            nums = temp;
            if (flag == false) {
                break;
            }
        }
        int result = 0;
        for (int i = l - 1; i <= r-1; i++) {
            if (temp.get(i) == 1) {
                result++;
            }
        }
        System.out.println(result);
    }
}
