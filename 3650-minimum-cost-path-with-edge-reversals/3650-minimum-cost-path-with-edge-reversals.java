import java.util.*;

class Solution {

    static class Node {
        int v;
        long cost;
        Node(int v, long cost) {
            this.v = v;
            this.cost = cost;
        }
    }

    public int minCost(int n, int[][] edges) {
        List<int[]>[] graph = new ArrayList[n];
        List<int[]>[] rev = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
            rev[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            graph[e[0]].add(new int[]{e[1], e[2]});
            rev[e[1]].add(new int[]{e[0], e[2]});
        }

        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;

        PriorityQueue<Node> pq =
            new PriorityQueue<>(Comparator.comparingLong(a -> a.cost));
        pq.offer(new Node(0, 0));

        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            int u = cur.v;
            long d = cur.cost;

            if (d > dist[u]) continue;

            // normal edges
            for (int[] e : graph[u]) {
                int v = e[0], w = e[1];
                if (dist[v] > d + w) {
                    dist[v] = d + w;
                    pq.offer(new Node(v, dist[v]));
                }
            }

            // reversed incoming edges (use switch at u)
            for (int[] e : rev[u]) {
                int v = e[0], w = e[1];
                long nd = d + 2L * w;
                if (dist[v] > nd) {
                    dist[v] = nd;
                    pq.offer(new Node(v, nd));
                }
            }
        }

        return dist[n - 1] == Long.MAX_VALUE ? -1 : (int) dist[n - 1];
    }
}
