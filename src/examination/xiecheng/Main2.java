package examination.xiecheng;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

    }
    public void backTack(int[] arr, int startIndex, int segment, int k) {
        if (segment == k) {
            return;
        }
        for (int i = startIndex; i < arr.length; i++) {
        }

    }
}
