package examination.jd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        List<List<Integer>> depend = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            List<Integer> cList = new ArrayList<>();
            if (c == 0) {
                cList.add(0);
            } else {
                for (int j = 0; j < c; j++) {
                    cList.add(sc.nextInt());
                }
            }
            depend.add(cList);
        }
        int[] state = new int[n];
        for (int i = 0; i < q; i++) {
            int act = sc.nextInt();
            int index = sc.nextInt();
            if (act == 1) {
                for (int j = 0; j < depend.get(index - 1).size(); j++) {
                    state[depend.get(index - 1).get(j)] = 1;

                }
            } else if (act == 0) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < depend.get(j).size(); k++) {
                        if (depend.get(j).get(k) == index) {
                            state[j] = 0;
                        }
                    }
                }
            }
            print(state);
        }
    }
    public static void print(int[] state) {
        int count = 0;
        for (int i = 0; i < state.length; i++) {
            if (state[i] == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
