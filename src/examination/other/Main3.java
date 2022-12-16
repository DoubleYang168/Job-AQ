package examination.other;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int k = in.nextInt();
        int[] nArray = new int[n]; // 定义n个杯子
        nArray[x - 1] = 71;
        for (int i = 0; i < k; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            swap(nArray, a - 1, b - 1);
        }
        // 遍历杯子看球在哪里
        for (int i = 0; i < n; i++) {
            if (nArray[i] == 71) {
                System.out.println(i + 1);
            }
        }
    }

    public static void swap(int[] nArray, int i, int j) {
        int temp = nArray[i];
        nArray[i] = nArray[j];
        nArray[j] = temp;
    }
}
