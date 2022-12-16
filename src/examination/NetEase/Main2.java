package examination.NetEase;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main2 {
    public static Map<Character, Character> map = new HashMap<>();

    public static void main(String[] args) {
        for (int i = 'a', j = 'z'; i <= 'z' && j >= 'a'; i++, j--) {
            map.put((char) (i), (char) (j));
        }
        Set<Character> characters = map.keySet();
        for (Character key : characters) {
            System.out.println(key + " " + map.get(key));
        }
        System.out.println();
        Main2 main2 = new Main2();
        char kthBit = main2.findKthBit(4, 11);
        System.out.println(kthBit);
    }

    public char findKthBit(int n, int k) {
        // write code here
        String s1 = "a";
        String s2 = null;
        for (int i = 2; i <= n; i++) {
            s2 = s1 + (char)('a' + i - 1) + invertThenReverse(s1);
            s1 = s2;

        }
        System.out.println(s2);
        return s2.charAt(k-1);
    }

    public String invertThenReverse(String arr) {
        char[] nArr = new char[arr.length()];
        for (int i = 0; i < arr.length(); i++) {
            nArr[i] = map.get(arr.charAt(i));
        }
        int i = 0, j = nArr.length - 1;
        // reverse
        while (i < j) {
            char temp = nArr[i];
            nArr[i] = nArr[j];
            nArr[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(nArr);
    }
}
