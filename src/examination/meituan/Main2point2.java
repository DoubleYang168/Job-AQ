package examination.meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2point2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String replace = s.replace(" ", "");
        List<Character> list = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < replace.length(); i++) {
            if (!list.contains(replace.charAt(i))) {
                list.add(replace.charAt(i));
                sb.append(replace.charAt(i));
            }
        }
        System.out.print(sb.toString());
    }
}
