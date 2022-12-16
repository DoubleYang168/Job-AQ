package examination.mi;

import java.util.Scanner;

public class Main2 {
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String[] s1 = s.split(" ");
        int[] arr = new int[s1.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s1[i]);
        }
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String[] s1 = s.split(" ");
        int red = 0, white = 0, blue = 0;
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].equals("0")) {
                red++;
            } else if (s1[i].equals("1")) {
                white++;
            } else {
                blue++;
            }
        }
        int[] res = new int[s1.length];
        for (int i = 0; i < red; i++) {
            res[i] = 0;
        }
        for (int i = red; i < red + white; i++) {
            res[i] = 1;
        }
        for (int i = red + white; i < red + white + blue; i++) {
            res[i] = 2;
        }
        for (int i = 0; i < s1.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
    public static void sort(int[] nums) {
        int left = -1;
        int right = nums.length;
        int i = 0;
        while (i < right) {
            if (nums[i] == 0) {
                swap(nums, i, left + 1);
                left++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, right - 1);
                right--;
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
