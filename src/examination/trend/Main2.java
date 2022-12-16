package examination.trend;// 本题为考试多行输入输出规范示例，无需提交，不计分。
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(", ");
        int[] arr = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.valueOf(split[i]);
        }
        Arrays.sort(arr);
        if (arr.length > 2){
            System.out.println(arr[arr.length-1] + arr[arr.length-1]);
        }else {
            System.out.println();
        }
    }
}