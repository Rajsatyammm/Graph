public static void topSort(ArrayList<Edge>[] graph) { // Using DFS
        Stack<Integer> s = new Stack<>();
        boolean[] vis = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                topSortUtil(graph, vis, s, i);
            }
        }

        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    public static void topSortUtil(ArrayList<Edge>[] graph, boolean[] vis, Stack<Integer> s, int curr) { // Using DFS
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topSortUtil(graph, vis, s, e.dest);
            }
        }
        s.push(curr);
    }
