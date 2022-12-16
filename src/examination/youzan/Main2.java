package examination.youzan;

public class Main2 {
    public static void main(String[] args) {

    }

    public int countTeam(int[] ratings) {
        // write code here
        int count = 0;
        for (int i = 0; i < ratings.length; i++) {
            for (int j = i + 1; j < ratings.length; j++) {
                for (int k = j + 1; k < ratings.length; k++) {
                    if (isNeed(ratings[i], ratings[j], ratings[k])) {
                        count++;
                    }
                }
            }
        }


        return count;
    }

    public boolean isNeed(int a, int b, int c) {
        return a < b && b < c || a > b && b > c;
    }
}
