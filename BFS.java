// Modified bfs
    public static void bfs(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i])
                bfsUtil(graph, vis);
        }
    }

    public static void bfsUtil(ArrayList<Edge>[] graph, boolean[] vis) { // T(n) = O(V+E)
        Queue<Integer> q = new ArrayDeque<>();

        q.add(0);
        while (!q.isEmpty()) {

            int curr = q.remove();
            if (!vis[curr]) {
                System.out.print(curr + " "); // visit
                vis[curr] = true; // mark visited
                // print neighbour
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
