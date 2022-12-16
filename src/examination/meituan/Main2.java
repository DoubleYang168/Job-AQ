package examination.meituan;

import java.util.HashSet;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Character> hashSet = new HashSet<>();
        String s = scanner.nextLine();
        String replace = s.replace(" ", "");
        for (int i = 0; i < replace.length(); i++) {
            if (!hashSet.contains(replace.charAt(i))) {
                hashSet.add(replace.charAt(i));
            }
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (hashSet.contains(c)) {
                sb.append(c);
                hashSet.remove(c);
            }
        }
        System.out.println(sb.toString());
    }
}
