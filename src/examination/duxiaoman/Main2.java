package examination.duxiaoman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String OX = sc.nextLine().trim();
        int m = Integer.valueOf(sc.nextLine());
        List<String> action = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            action.add(sc.nextLine().trim());
        }
        for (int i = 0; i < action.size(); i++) {
            String s = action.get(i);
            String flag = "YES";
            for (int j = 0; j < s.length(); j++) {
                if (OX.charAt(j) == 'X' && s.charAt(j) == '1') {
                    flag = "NO";
                    break;
                }
                if (j == s.length() - 1 && OX.charAt(j) == 'X' && s.charAt(j) == '0') {
                    flag = "YES";
                }
            }
            System.out.println(flag);
        }
    }

    public static boolean isOk(Character c, int m) {
        if (c == 'O') {
            if (m == 0 || m == 1) {
                return true;
            }
        }
        if (c == 'X') {
            if (m == 0) {
                return true;
            } else if (m == 1) {
                return false;
            }
        }
        return false;
    }
}
