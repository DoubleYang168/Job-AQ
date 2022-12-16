package examination.bilibili;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> map = new ArrayList<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine().trim();
            if (s.isEmpty()) {
                break;
            }
            List<Integer> row = new ArrayList<>();
            String[] s1 = s.split(",");
            for (String ss : s1) {
                row.add(Integer.parseInt(ss));
            }
            map.add(row);
        }
        // 把map list转换为数组
        int[][] mapArr = new int[map.size()][map.get(0).size()];
        for (int i = 0; i < mapArr.length; i++) {
            for (int j = 0; j < mapArr[0].length; j++) {
                mapArr[i][j] = map.get(i).get(j);
//                System.out.print(mapArr[i][j]);
            }
//            System.out.println();
        }
        int count = 0;
        int m = mapArr.length;
        int n = mapArr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mapArr[i][j] == 1) {
                    count++;
                    dfs(mapArr, i, j); //以 i, j为根去dfs
                }
//                System.out.print(mapArr[i][j]+" ");
            }
//            System.out.println();
        }
        System.out.println(count);

    }
    public static void dfs(int[][] map, int row, int col) {
        if (row < 0 || col < 0 || row >= map.length || row >= map[0].length || map[row][col] != 1) {
            return;
        }
        // 所到之处，片甲不留
        map[row][col] = 2;
        dfs(map, row + 1, col);
        dfs(map, row - 1, col);
        dfs(map, row, col + 1);
        dfs(map, row, col - 1);
    }

}
