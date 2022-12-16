package examination.other;

public class Main2 {
    public static void main(String[] args) {
        int money = 100;

    }

    public static void solution(int n, double money) {
        double[] result = new double[n];
        double[] randNums = new double[n];
        //先保证每个人有0.1元
        double sumMoney = money - 0.1 * n;

        // 随机总数
        int randSum = 0;

        // 随机生成随机数
        for (int i = 0; i < n; i++) {
            // 随机生成0-0.9比例的金额
            randNums[i] = Math.random() * 0.9 * sumMoney;
            randSum += randNums[i];
        }



    }
}
