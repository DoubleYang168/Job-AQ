package examination.other;

import java.util.Scanner;
public class Main {

    /*
    static class Node {
        int val;
        Node left;
        Node right;
        Node (int x) {
            val = x;
        }
    }

    public static Node addNode(int[] nums, int left, int right) {
        if (left < right) {
            return null;
        }
        int mid = left + ((right - left) >> 1);
        Node node = new Node(nums[mid]);
        node.left = addNode(nums, left, mid - 1);
        node.right = addNode(nums, mid + 1, right);
        return node;
    }

    public static void pre(Node node) {
        if (node != null) {
            System.out.print(node.val + " ");
            pre(node.left);
            pre(node.right);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] nArray = new int[n];
        for (int i = 0; i < n; i++) {
            nArray[i] = in.nextInt();
        }
        Node node = addNode(nArray, 0, nArray.length - 1);
        pre(node);
    }

     */



    // 第一题
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] nArray = new int[n];
        int[] mArray = new int[m];
        // 读取n数组
        for (int i = 0; i < n; i++) {
            nArray[i] = in.nextInt();
        }
        // 读取m数组
        for (int i = 0; i < m; i++) {
            mArray[i] = in.nextInt();
        }
        // 求数组a中的最大值
        int nMax = nArray[0];
        for (int i: nArray) {
            if (i > nMax) {
                nMax = i;
            }
        }
        int times = 0;
        // 求b中的各个元素比nMax小的差距总和
        for (int i = 0; i < m; i++) {
            if (mArray[i] < nMax) {
                times = times + nMax - mArray[i];
            }
        }
        System.out.print(times);

    }

}