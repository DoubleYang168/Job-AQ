package examination.other;

import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        int[] a = {7, 8, 9, 4, 5, 6, 1, 2, 3};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static void quickSort(int[] a, int low, int high) {
        int temp;
        int i = low, j = high;
        if (i < j){
            temp= a[low];
            while (i < j) {
                while (i < j && a[j] > temp) {
                    j--;
                }
                if (i < j) {
                    a[i] = a[j];
                    i++;
                }
                while (i < j && a[i] < temp) {
                    i++;
                }
                if (i < j) {
                    a[j] = a[i];
                    j--;
                }
            }
            a[i] = temp;
            quickSort(a, low, i - 1);
            quickSort(a, i + 1, high);
        }
    }
}
