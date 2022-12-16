package examination.tencent2;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i] || arr[j] > arr[i]) {
                    boolean flag = true;
                    for (int k = i + 1; k <= j - 1; k++) {
                        if (arr[k] < arr[i] || arr[k] < arr[j]) {
                            flag = false;
                        }
                    }
                    if (flag == true) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
