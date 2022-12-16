package examination.aiqiyi;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char c = input.charAt(input.length() - 1);
        int k = Integer.parseInt(String.valueOf(c));
        char[] chars = input.substring(0, input.length() - 2).toCharArray();
        int[] array = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            array[i] = Integer.parseInt(String.valueOf(chars[i]));
        }
        int pre = 0;
        for (int i = 0; i < k; i++) {
            pre += array[i];
        }
        pre = pre / k;
        int percent = 0;
        int newpercent = 0;
        for (int i = 1; i < array.length - k; i++) {
            int average =0;
            for (int j = i; j <= k ; j++) {
                average += array[j];
            }
            average = average / k;
            newpercent = percent;
            percent = average / pre;
            pre = average;
        }
    }

}
