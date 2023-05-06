// old dfs
    public static void oldDfs(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];
        dfsHelper(graph, vis, 0);
    }

    public static void dfsHelper(ArrayList<Edge>[] graph, boolean[] vis, int curr) {
        System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                dfsHelper(graph, vis, e.dest);
            }
        }
    }
