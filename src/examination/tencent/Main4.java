package examination.tencent;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nums = sc.nextLine().split(" ");
        int n = Integer.valueOf(nums[0]);
        int k = Integer.valueOf(nums[1]);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        List<String> list = new LinkedList<>();
        for (int i = 0; i <= s.length() - k; i++) {
            list.add(s.substring(i, k));
        }
        String max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (aMaxToB(list.get(i), max)) {
                max = list.get(i);
            }
        }
        System.out.println(max);

    }
    public static boolean aMaxToB(String a, String b) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) > a.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
