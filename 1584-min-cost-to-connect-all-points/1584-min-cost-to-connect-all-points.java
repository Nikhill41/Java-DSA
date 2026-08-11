class Solution {

    public class Triplet implements Comparable<Triplet> {

        int node, parent, dis;

        Triplet(int node, int parent, int dis) {
            this.node = node;
            this.parent = parent;
            this.dis = dis;
        }

        public int compareTo(Triplet p) {

            if (this.dis == p.dis) {
                return Integer.compare(this.node, p.node);
            }

            return Integer.compare(this.dis, p.dis);
        }
    }

    public int minCostConnectPoints(int[][] points) {

        boolean[] vis = new boolean[points.length];

        int sum = 0;

        PriorityQueue<Triplet> pq = new PriorityQueue<>();

        pq.add(new Triplet(0, -1, 0));

        while (pq.size() > 0) {

            Triplet front = pq.remove();

            int node = front.node;
            int parent = front.parent;
            int dis = front.dis;

            if (vis[node] == true)
                continue;

            sum += dis;
            vis[node] = true;

            for (int i = 0; i < points.length; i++) {

                if (i == node || i == parent || vis[i] == true)
                    continue;

                int x1 = points[node][0];
                int y1 = points[node][1];

                int x2 = points[i][0];
                int y2 = points[i][1];

                int mDis = Math.abs(x1 - x2) + Math.abs(y1 - y2);

                pq.add(new Triplet(i, node, mDis));
            }
        }

        return sum;
    }
}