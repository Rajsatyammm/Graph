// Breadth First Search old

public static void oldBfs(ArrayList<Edge>[] graph) {
        Queue<Integer> q = new ArrayDeque<>();
        boolean vis[] = new boolean[graph.length];
        q.add(0);

        while (!q.isEmpty()) {
            int val = q.remove();
            if (!vis[val]) {
                System.out.print(val + " ");
                vis[val] = true;
                for (int i = 0; i < graph[val].size(); i++) {
                    Edge e = graph[val].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
