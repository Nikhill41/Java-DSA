class Solution {

    public class Pair {
        int node;
        int price;
        int stops;

        Pair(int node, int price, int stops) {
            this.node = node;
            this.price = price;
            this.stops = stops;
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        List<List<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] flight : flights) {
            int u = flight[0];
            int v = flight[1];
            int price = flight[2];

            adj.get(u).add(new Pair(v, price, 0));
        }

        int[] minPrice = new int[n];
        Arrays.fill(minPrice, Integer.MAX_VALUE);

        minPrice[src] = 0;

        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(src, 0, 0));

        while (!q.isEmpty()) {

            Pair front = q.poll();

            int node = front.node;
            int price = front.price;
            int stops = front.stops;

            if (stops > k)
                continue;

            for (Pair p : adj.get(node)) {

                int totalPrice = price + p.price;

                if (totalPrice < minPrice[p.node]) {

                    minPrice[p.node] = totalPrice;

                    q.offer(new Pair(p.node, totalPrice, stops + 1));
                }
            }
        }

        return minPrice[dst] == Integer.MAX_VALUE ? -1 : minPrice[dst];
    }
}