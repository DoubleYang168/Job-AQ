package examination.jd;

import java.util.HashMap;
import java.util.Scanner;

public class Main11 {
    static class Location{
        public int x;
        public int y;
        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        HashMap<Character, Location> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String line = sc.next();
            for (int j = 0; j < m; j++) {
                map.put(line.charAt(j), new Location(i, j));
            }
        }
        String input = sc.next();
        Long output = 0L;
        Location lastLocation = new Location(0, 0);
        for (char c :
                input.toCharArray()) {
            Location location = map.get(c);
            if (lastLocation.x == location.x && lastLocation.y == location.y) {
                output += z;
            } else if (lastLocation.x == location.x && lastLocation.y != location.y) {

            }
        }
    }
}
