package examination.tme;

public class Main2 {
    public static void main(String[] args) {
        int i = maxValue("3456452", 4);
        System.out.println(i);
    }

    public static int maxValue(String s, int k) {

        int max = 0;
        for (int i = 0; i < s.length() - k + 1; i++) {
            max = Math.max(max, Integer.valueOf(s.substring(i, i + k)));
        }
        return max;
    }
    /*
    public static int maxValue(String s, int k) {
        // write code here
        if (s.length() < k) {
            return 0;
        }
        Character maxChar = s.charAt(0);
        int index = 0;
        for (int i = 0; i < s.length() - k + 1; i++) {
            if (s.charAt(i) > maxChar) {
                maxChar = s.charAt(i);
                index = i;
            }
        }
        return Integer.parseInt(s.substring(index, index + k));
    }

     */
}
