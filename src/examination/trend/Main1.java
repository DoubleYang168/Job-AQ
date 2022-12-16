package examination.trend;
// 本题为考试单行多行输入输出规范示例，无需提交，不计分。
import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim().replace("[","").replace("]","");
        String[] s1 = input.split(" ");
        String s = s1[0];
        String[] tArr = s1[1].split(",");
        System.out.println("Not Match");

    }
    public static boolean isPick(String s, String t) {
        String[] splitS = s.split(".");
        String[] splitT = t.split(".");
        int i = 0, j = 0;
        while (i < splitS.length && j < splitT.length) {
            if (i == 0 && splitS[i].equals("*")) {
                return true;
            }
            if (splitS[i].length() == 1 && splitS[i].equals("*")) {
                j++;
            }
            for (int k = 0; k < splitS[i].length(); k++) {
                if (splitS[i].charAt(k) != splitT[i].charAt(k)) {
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}