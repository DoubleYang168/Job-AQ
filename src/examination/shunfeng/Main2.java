package examination.shunfeng;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        // 起始地      目的地     不舒适度
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int origin = sc.nextInt();
            int dest = sc.nextInt();
            int un = sc.nextInt();
            Map<Integer, Integer> tmap;
            if (map.containsKey(origin)) {
                tmap = map.get(origin);
                tmap.put(dest, un);
            } else {
                tmap = new TreeMap<>();
                tmap.put(dest, un);
            }
            map.put(origin, tmap);
        }
        for (int i = 0; i < q; i++) {
            int max = 0;
            int qOrigin = sc.nextInt();
            int qUn = sc.nextInt();
            while (map.get(qOrigin) != null) {
                Map<Integer, Integer> map1 = map.get(qOrigin);
                Iterator<Map.Entry<Integer, Integer>> iterator = map1.entrySet().iterator();
                if (iterator.hasNext()) {
                    Integer key = iterator.next().getKey();
                    Integer value = iterator.next().getValue();
                    qOrigin = key;
                    max = Math.max(max, value);
                }
            }
            System.out.println(max);
        }

    }
}
