// hasCyclefor directed graph
    public static boolean hasCycle(ArrayList<Edge>[] graph) {
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                hasCycleUtil(graph, vis, stack, i);
            }
        }
        return false;
    }

    public static boolean hasCycleUtil(ArrayList<Edge>[] graph, boolean[] vis, boolean[] stack, int curr) {
        vis[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);

            if (stack[e.dest]) {
                return true;
            }

            if (!vis[e.dest] && hasCycleUtil(graph, vis, stack, e.dest)) {
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }
