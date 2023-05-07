// isBipartite method with Util method
    public static boolean isBipartite(ArrayList<Edge>[] graph) {
        int[] col = new int[graph.length];
        // for (int i = 0; i < col.length; i++) {
        // col[i] = -1;
        // }
        Arrays.fill(col, -1);

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) {
                q.add(i);
                if (isBipartiteUtil(graph, q, col, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    // -1 : no color
    // 0 : yellow , 1 : blue
    @SuppressWarnings("uncheaked")
    public static boolean isBipartiteUtil(ArrayList<Edge>[] graph, Queue<Integer> q, int[] col, int clr) {
        // q.add(curr);
        while (!q.isEmpty()) {
            int curr = q.remove();
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                // q.add(e.dest);
                if (col[e.dest] == -1) {
                    int newClr = (col[curr] == 0) ? 1 : 0;
                    col[e.dest] = newClr;
                    q.add(e.dest);
                } else if (col[e.dest] == col[curr]) {
                    return false;
                }
            }
        }
        return true;
    }
