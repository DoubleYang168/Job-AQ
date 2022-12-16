package examination.honor;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String replace = s.replace("A", "12 34").replace("B", "AB CD");
        String[] s1 = replace.split(" ");
        s1[0] = decimalToHex(s1.length);
        for (String se : s1) {
            System.out.print(se + " ");
        }
    }
    public static String decimalToHex(int decimal) {
        String hex = "";
        while(decimal != 0) {
            int hexValue = decimal % 16;
            hex = toHexChar(hexValue) + hex;
            decimal = decimal / 16;
        }
        return hex;
    }

    private static char toHexChar(int hexValue) {

        if (hexValue <= 9 && hexValue >= 0) {
            return (char)(hexValue + '0');
        } else {
            return (char)(hexValue - 10 + 'A');
        }
    }
}
