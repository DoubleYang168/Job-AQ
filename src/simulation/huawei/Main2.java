package simulation.huawei;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = null;
        List<List<Integer>> allNumsList = new LinkedList<>();
        while (!(line = sc.nextLine()).equals("")) {
            int n = Integer.parseInt(line);
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                if (!list.contains(num)) {
                    list.add(num);
                }
            }
            allNumsList.add(list);
        }
        for (List<Integer> list : allNumsList) {
            excludeAndSort(list);
        }
        sc.close();
    }

    public static void excludeAndSort(List<Integer> list) {
        Collections.sort(list);
        for (Integer num : list) {
            System.out.println(num);
        }
    }
}
