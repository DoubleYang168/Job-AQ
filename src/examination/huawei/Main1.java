package examination.huawei;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = Integer.toBinaryString(X);
//        System.out.println(s);
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < X; i++) {
            StringBuilder sb = new StringBuilder();
            int num = sc.nextInt();
            String binaryString = Integer.toBinaryString(num);
            for (int j = 0; j < 32 - binaryString.length(); j++) {
                sb.append('0');
            }
            sb.append(binaryString);
            StringBuilder sb1 = new StringBuilder();
            for (int j = 32 - (n + m); j < 32 - (n + m) + m; j++) {
                sb1.append(sb.charAt(j));
            }
            for (int j = 0; j < 32 - (n + m); j++) {
                sb1.append(sb.charAt(j));
            }
            for (int j = 32 - (n + m) + m; j < sb.length(); j++) {
                sb1.append(sb.charAt(j));
            }
            String sub = sb1.substring(0, 16);
//            System.out.println(sub);
            Integer value = Integer.valueOf(sub, 2);
            System.out.println(value);
//            System.out.println("转换后："+Integer.parseInt(String.valueOf(Integer.parseInt(sbString.toString())), 2));
            map.put(value, map.getOrDefault(value, 0));
        }
    }
}
