public static void pathSrcToDest(ArrayList<Edge>[] graph, int src, int dest, String path) {
        if (src == dest) {
            System.out.println(path + dest);
            return;
        }

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            pathSrcToDest(graph, e.dest, dest, path + src);
        }
    }
