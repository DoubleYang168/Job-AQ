package simulation.huawei;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
/*
有这样一道智力题：“某商店规定：三个空汽水瓶可以换一瓶汽水。小张手上有十个空汽水瓶，她最多可以换多少瓶汽水喝？”答案是5瓶，方法如下：先用9个空瓶子换3瓶汽水，喝掉3瓶满的，喝完以后4个空瓶子，用3个再换一瓶，喝掉这瓶满的，这时候剩2个空瓶子。然后你让老板先借给你一瓶汽水，喝掉这瓶满的，喝完以后用3个空瓶子换一瓶满的还给老板。如果小张手上有n个空汽水瓶，最多可以换多少瓶汽水喝？
输入文件最多包含10组测试数据，每个数据占一行，仅包含一个正整数n（1<=n<=100），表示小张手上的空汽水瓶数。n=0表示输入结束，你的程序不应当处理这一行。
输入：
3
10
81
0
输出：
1
5
40
 */

// 通过全部测试用例
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nList = new LinkedList<>();
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n == 0)
                break;
            nList.add(n);

        }
        // 循环调用
        for (Integer num : nList) {
            maxNums(num);
        }
    }

    private static void maxNums(int num) {
        int[] dp = new int[101];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;
        for (int i = 1; i <= num; i++) {
            // 如果初始瓶子数为基数
            if (i % 2 != 0) {
                dp[i] = dp[i - 1] + dp[1];
            } else {
                dp[i] = dp[i - 2] + dp[2];
            }
        }
        System.out.println(dp[num]);
    }
}
