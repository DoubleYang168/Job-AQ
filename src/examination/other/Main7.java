package examination.other;

import java.util.TreeSet;

public class Main7 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        int[] a = {5, 4, 8, 7, 9, 6, 2, 1, 3, 10};
        System.out.println(findKth(a, a.length, 5));

    }

    public static int findKth(int[] a, int n, int K) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i : a) {
            treeSet.add(i);
            if (treeSet.size() > K)
                treeSet.pollFirst();
        }
        if (treeSet.size() < 3) {
            return treeSet.pollLast();
        } else {
            return treeSet.pollFirst();
        }
    }
}
