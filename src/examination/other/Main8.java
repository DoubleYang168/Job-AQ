package examination.other;

public class Main8 {
    public static void main(String[] args) {
        String[] words = {"abcw","baz","foo","bar","fxyz","abcdef"};
        int i = maxProduct(words);
        System.out.println(i);
    }
    public static int maxProduct(String[] words) {
        int length = words.length;
        int max = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (!isIncludeSameCharacter(words[i], words[j])) {
                    int plus = words[i].length() * words[j].length();
                    if (plus > max) {
                        max = plus;
                    }
                }
            }
        }
        return max;
    }

    public static boolean isIncludeSameCharacter(String a, String b) {
        boolean flag = true;
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
