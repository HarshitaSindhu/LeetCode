import java.util.*;

class Solution {
    public int[][] updateMatrix(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        int[][] level = new int[n][m];
        Queue<ArrayList<Integer>> q = new LinkedList<>();

        // push all 0s in the queue
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    level[i][j] = 0;
                    ArrayList<Integer> cur = new ArrayList<>();
                    cur.add(i);
                    cur.add(j);
                    q.add(cur);
                } else {
                    level[i][j] = -1; // mark not visited
                }
            }
        }

        // BFS
        while (!q.isEmpty()) {
            ArrayList<Integer> d = q.remove();
            int r = d.get(0);
            int c = d.get(1);

            // Down
            if (r + 1 < n && level[r + 1][c] == -1) {
                level[r + 1][c] = level[r][c] + 1;
                ArrayList<Integer> cur = new ArrayList<>();
                cur.add(r + 1);
                cur.add(c);
                q.add(cur);
            }

            // Up
            if (r - 1 >= 0 && level[r - 1][c] == -1) {
                level[r - 1][c] = level[r][c] + 1;
                ArrayList<Integer> cur = new ArrayList<>();
                cur.add(r - 1);
                cur.add(c);
                q.add(cur);
            }

            // Right
            if (c + 1 < m && level[r][c + 1] == -1) {
                level[r][c + 1] = level[r][c] + 1;
                ArrayList<Integer> cur = new ArrayList<>();
                cur.add(r);
                cur.add(c + 1);
                q.add(cur);
            }

            // Left
            if (c - 1 >= 0 && level[r][c - 1] == -1) {
                level[r][c - 1] = level[r][c] + 1;
                ArrayList<Integer> cur = new ArrayList<>();
                cur.add(r);
                cur.add(c - 1);
                q.add(cur);
            }
        }

        return level;
    }
}
