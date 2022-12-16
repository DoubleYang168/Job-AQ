package examination.redbooklet;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.valueOf(sc.nextLine());
        char[][] map = new char[N][N];
        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            char[] chars = s.toCharArray();
            for (int j = 0; j < N; j++) {
                map[i][j] = chars[j];
            }
        }


    }
    public void dfs(char[][] map, int i, int j) {

    }
}
