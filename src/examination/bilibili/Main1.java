package examination.bilibili;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new TreeMap<>();
        int nums = 0;
        while (sc.hasNextLine()) {
            String s = sc.nextLine().trim();
            if (s.isEmpty()) {
                break;
            }
            nums++;
            String[] s1 = s.split(",");
            for (String ss : s1) {
                map.put(Integer.valueOf(ss), map.getOrDefault(Integer.valueOf(ss), 0) + 1);
            }
        }
        Set<Integer> keySet = map.keySet();
        boolean flag = false;
        for (Integer key : keySet) {
            if (map.get(key) == nums) {
                flag = true;
                System.out.println(key);
                break;
            }
        }
        if (flag == false) {
            System.out.println(-1);
        }
    }
}
