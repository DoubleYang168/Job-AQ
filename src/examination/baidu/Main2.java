package examination.baidu;

import java.util.Scanner;

public class Main2 {
    // 一旦第i个位置出现了0 或者 >3 的数，i后面的数都取最大置为3就行
    // 出现0的位置，往前遍历，每次都让前边减1，直到一个不为0为止，比如1110，变成0333，当然0要去掉
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            char[] arr = str.toCharArray();
            int j = 0;
            while (j < arr.length) {
                if (arr[j] > '3') {
                    break;
                } else if (arr[j] == '0') {
                    if (j == 0) {
                        j++;
                        break;
                    }
                    arr[j] = '9';
                    j--;
                    arr[j]--;
                } else {
                    j++;
                }
            }
            for (; j < arr.length; j++) {
                arr[j] = '3';
            }
            System.out.println(Long.parseLong(new String(arr)));
        }
    }
}
