class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {

        int n = grid.length;

        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1)
            return -1;

        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1, 0, 1, -1, 1, -1, 0, 1};

        Queue<int[]> q = new LinkedList<>();
        boolean[][] vis = new boolean[n][n];

        q.offer(new int[]{0, 0, 1});
        vis[0][0] = true;

        while (!q.isEmpty()) {

            int[] front = q.poll();

            int row = front[0];
            int col = front[1];
            int dis = front[2];

            if (row == n - 1 && col == n - 1)
                return dis;

            for (int k = 0; k < 8; k++) {

                int nr = row + dr[k];
                int nc = col + dc[k];

                if (nr >= 0 && nr < n &&
                    nc >= 0 && nc < n &&
                    !vis[nr][nc] &&
                    grid[nr][nc] == 0) {

                    vis[nr][nc] = true;
                    q.offer(new int[]{nr, nc, dis + 1});
                }
            }
        }

        return -1;
    }
}