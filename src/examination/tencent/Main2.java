package examination.tencent;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        List<Integer[]> list = new LinkedList<>();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            Integer[] data = new Integer[n];
            for (int j = 0; j < n; j++) {
                data[j] = sc.nextInt();
            }
            list.add(data);
        }
        for (int i = 0; i < list.size(); i++) {
            Integer max = maxBounus(list.get(i));
            System.out.println(max);
        }

    }

    public static Integer maxBounus(Integer[] arr) {
        Arrays.sort(arr);
        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum += arr[i];
            for (int j = 0; j < i; j++) {
                arr[j] += arr[i];
            }
        }
        return sum;
    }
}
