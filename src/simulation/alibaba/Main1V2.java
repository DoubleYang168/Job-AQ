package simulation.alibaba;

import java.util.Arrays;
import java.util.Scanner;

class Good implements Comparable {
    public int x;
    public int y;

    public Good(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Object o) {
        Good good = (Good) o;
        if (this.x > good.x) {
            return 1;
        } else if (this.x < good.x) {
            return -1;
        } else { // x相同，y大的放前边
            if (this.y > good.y) {
                return -1;
            } else if (this.y < good.y) {
                return 1;
            }
        }
        return 0;
    }
}

public class Main1V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] xArr = new int[n];
            int[] yArr = new int[n];
            for (int j = 0; j < n; j++) {
                xArr[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                yArr[j] = sc.nextInt();
            }
            Good[] goods = new Good[n];
            for (int j = 0; j < goods.length; j++) {
                goods[j] = new Good(xArr[j], yArr[j]);
            }
            Arrays.sort(goods);
            binarySearch(goods);
        }
    }

    private static void binarySearch(Good[] goods) {
        int[] value = new int[goods.length + 1];

        int maxLength = 1;
        value[1] = goods[0].y;
        for (int i = 1; i < goods.length; i++) {
            if (goods[i].y > value[maxLength]) {
                value[++maxLength] = goods[i].y;
            } else {
                int t = find(value, maxLength, goods[i].y);
                value[t] = goods[i].y;
            }
        }
        System.out.println(maxLength);
    }

    private static int find(int[] value, int maxLength, int i) {
        int l = 1, r = maxLength;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (i > value[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    private static void dp(Good[] arr) {
        int maxLength = 0;

        // 数组元素value[i]表示以arr[i]为子序列最后一位时，递增子序列的最大长度
        int[] value = new int[arr.length];

        // 每次循环获取 以arr[i]为子序列最后一位时，递增子序列最大长度
        for (int i = 0; i < arr.length; i++) {
            // 默认都是长度1
            value[i] = 1;

            // 循环第0位到第 i - 1 位value[]，找出最大递增序列长度maxvalue，则value[i] = maxvalue + 1;
            for (int j = 0; j < i; j++) {
                if (arr[i].y > arr[j].y) {
                    value[i] = Math.max(value[j] + 1, value[i]);
                }
            }

            // 找出最大的那个
            maxLength = Math.max(maxLength, value[i]);
        }

        System.out.println(maxLength);
    }

}
