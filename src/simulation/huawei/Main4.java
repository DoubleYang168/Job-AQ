package simulation.huawei;

import java.util.ArrayDeque;
import java.util.Deque;

class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}

public class Main4 {
    public ListNode reverseKGroup(ListNode head, int k) {
        // write code here
        Deque<ListNode> stack = new ArrayDeque<>();
        //初始化一个新的链表存放结果
        ListNode ret = new ListNode(0);
        //为新链表定义一个指针,防止后续操作改变链表头节点
        ListNode p = ret;
        while (true) {
            // 为每次翻转计数
            int count = 0;
            //定义指针操作原始链表
            ListNode tmp = head;
            while (tmp != null && count < k) {
                stack.push(tmp);
                tmp = tmp.next;
                count++;
            }
            //判断该次反转是否达到要求，此处防止因tem==null跳出循环的条件
            if (count != k) {
                // 表示剩下的节点不够k个，直接将剩余节点插入末尾结束
                p.next = head;
                break;
            }
            // 出栈操作，翻转链表
            while (!stack.isEmpty()) {
                p.next = stack.pop();
                p = p.next;
            }
            // 重置下一次操作的初始节点

            head = tmp;
        }
        return ret.next;

    }
}
