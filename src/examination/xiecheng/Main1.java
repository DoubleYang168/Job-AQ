package examination.xiecheng;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] shell = s.split(" ");
            if (shell.length == 1 && shell[0].equals("pwd")) {
                if (sb.length() == 0) {
                    System.out.println("\\");
                } else {
                    System.out.println(sb.toString());
                }
            } else {
                if (shell[0].equals("cd") && shell[1].equals("..")) {
                    if (sb.length() == 0) {
                    } else {
                        sb.deleteCharAt(sb.length() - 1).deleteCharAt(sb.length() - 1);
                    }
                } else if (shell[0].equals("cd")) {
                    sb.append("\\" + shell[1]);
                }
            }
        }
    }
}
