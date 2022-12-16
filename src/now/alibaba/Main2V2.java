package now.alibaba;

import java.util.*;

/**
 * @description:
 * @author: znx
 * @create: 2021-09-24 19:18
 **/
class Node {
    int v, c;

    Node(int v, int c) {
        this.v = v;
        this.c = c;
    }
}

public class Main2V2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt();
        int[] w = new int[n + 1];
        int[] p = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            w[i] = in.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            p[i] = in.nextInt();
        }
        Map<Integer, List<Node>> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int u = in.nextInt();
            int v = in.nextInt();
            int c = in.nextInt();
            if (map.containsKey(u)) {
                map.get(u).add(new Node(v, c));
            } else {
                ArrayList<Node> list = new ArrayList<>();
                list.add(new Node(v, c));
                map.put(u, list);
            }
            if (map.containsKey(v)) {
                map.get(v).add(new Node(u, c));
            } else {
                ArrayList<Node> list = new ArrayList<>();
                list.add(new Node(u, c));
                map.put(v, list);
            }
        }
        int s = in.nextInt();
        int t = in.nextInt();
        PriorityQueue<Node> queue = new PriorityQueue<>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.c - o2.c;
            }
        });
        queue.add(new Node(s, 0));
        int[] vit = new int[n + 1];
        int res = 0;
        while (!queue.isEmpty()) {
            Node poll = queue.poll();
            int x = poll.v;
            if (x == t) {
                res = poll.c;
                System.out.println(res);
                return;
            }
            if (vit[x] == 1) continue;
            vit[x] = 1;
            if (map.containsKey(x)) {
                List<Node> list = map.get(x);
                for (Node node : list) {
                    if (vit[node.v] == 1) {
                        continue;
                    }
                    int tmp = poll.c + node.c;
                    if (node.v != t) {
                        if (tmp % w[node.v] == 0) {
                            tmp += p[node.v];
                        } else {
                            int b = tmp % w[node.v];
                            tmp += w[node.v] - b + p[node.v];
                        }
                    }
                    queue.add(new Node(node.v, tmp));
                }
            }
        }
        System.out.println(-1);
    }
}