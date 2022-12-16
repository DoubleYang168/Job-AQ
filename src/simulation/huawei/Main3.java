package simulation.huawei;

import java.util.Scanner;

public class Main3 {
    public static int magicValue = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim().replace("[","").replace("]","");
        String[] split = s.split(",");
        int n = Integer.parseInt(split[0]);
        split[0] = "0";
        for (int i = 1; i < split.length; i++) {
            int temp = Integer.parseInt(split[i]) ^ Integer.parseInt(split[i - 1]);
            if (temp > magicValue) {
                magicValue = temp;
            }
        }
        System.out.println(magicValue);
    }
}
