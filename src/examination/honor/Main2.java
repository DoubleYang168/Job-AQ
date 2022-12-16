package examination.honor;

import java.util.*;

public class Main2 {
//    static class Meet {
//        private int start;
//        private int end;
//
//        public Meet() {
//        }
//
//        public Meet(int start, int end) {
//            this.start = start;
//            this.end = end;
//        }
//
//        public int getStart() {
//            return start;
//        }
//
//        public void setStart(int start) {
//            this.start = start;
//        }
//
//        public int getEnd() {
//            return end;
//        }
//
//        public void setEnd(int end) {
//            this.end = end;
//        }
//    }

    public static void main(String[] args) {
        int maxTime = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        TreeMap<Integer, Integer> allST = new TreeMap<>();
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                int start = sc.nextInt();
                int end = sc.nextInt();
                allST.put(start, end);
            }
        }
        Set<Integer> keySet = allST.keySet();
        List<Integer> list = new ArrayList<>(keySet);
        int nowIndex = 0;
        while (nowIndex != list.size() - 1) {

        }
    }
    public void search(TreeMap<Integer, Integer> map, int time, int preEnd) {
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        Map.Entry<Integer, Integer> next = iterator.next();
        Integer key = next.getKey();
        Integer value = next.getValue();
        map.remove(key);
        if (key >= preEnd) {
            time += (value - key);
        }
        map.put(key, value);
    }
}
