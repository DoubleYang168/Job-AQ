package examination.tencent;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}


public class Main1 {
    public static void main(String[] args) {

    }
    public ListNode[] solve (int m, ListNode a) {
        // write code here
        ListNode[] res = new ListNode[m];
        ListNode p = a;
        ListNode q = null;
        while (p != null) {
            q = p;
            p = p.next;
            q.next = null;
            int color = q.val % m;
            ListNode h = res[color];
            if (res[color] == null) {
                res[color] = q;
            } else {
                while (h.next != null) {
                    h = h.next;
                }
                h.next = q;
            }
        }
        return res;
    }
}
