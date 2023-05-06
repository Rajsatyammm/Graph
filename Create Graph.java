import java.util.*;

public class Classroom {
    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        // ArrayList<Edge>[] graph = new ArrayList[V];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // // 0 ->
        // graph[0].add(new Edge(0, 1, 1));
        // graph[0].add(new Edge(0, 2, 1));

        // // 1 ->
        // graph[1].add(new Edge(1, 0, 1));
        // // graph[1].add(new Edge(1, 3, 1));

        // // 2 ->
        // graph[2].add(new Edge(2, 0, 1));
        // graph[2].add(new Edge(2, 4, 1));

        // // 3 ->
        // graph[3].add(new Edge(3, 1, 1));
        // // graph[3].add(new Edge(3, 4, 1));
        // // graph[3].add(new Edge(3, 5, 1));

        // // 4 ->
        // graph[4].add(new Edge(4, 2, 1));
        // // graph[4].add(new Edge(4, 3, 1));
        // graph[4].add(new Edge(4, 5, 1));

        // // 5 ->
        // // graph[4].add(new Edge(5, 3, 1));
        // graph[4].add(new Edge(5, 4, 1));
        // graph[4].add(new Edge(5, 6, 1));

        // // 6 ->
        // graph[6].add(new Edge(6, 5, 1));

        // graph[0].add(new Edge(0, 1, 1));
        // // graph[0].add(new Edge(0, 2, 1));
        // graph[0].add(new Edge(0, 3, 1));

        // graph[1].add(new Edge(1, 0, 1));
        // graph[1].add(new Edge(1, 2, 1));

        // // graph[2].add(new Edge(2, 0, 1));
        // graph[2].add(new Edge(2, 1, 1));

        // graph[3].add(new Edge(3, 0, 1));
        // graph[3].add(new Edge(3, 4, 1));

        // graph[4].add(new Edge(4, 3, 1));

        // graph[0].add(new Edge(0, 1, 0));
        // graph[0].add(new Edge(0, 2, 0));

        // graph[1].add(new Edge(1, 0, 0));
        // graph[1].add(new Edge(1, 3, 0));

        // graph[2].add(new Edge(2, 0, 0));
        // graph[2].add(new Edge(2, 4, 0));

        // graph[3].add(new Edge(3, 1, 0));
        // graph[3].add(new Edge(3, 4, 0));

        // graph[4].add(new Edge(4, 2, 0));
        // graph[4].add(new Edge(4, 3, 0));

        // graph[0].add(new Edge(0, 1, 0));
        graph[0].add(new Edge(0, 2, 0));

        graph[1].add(new Edge(1, 0, 0));

        graph[2].add(new Edge(2, 3, 0));

        graph[3].add(new Edge(3, 0, 0));

    }
  public static void main(String[] args) {
        int V = 4;
        @SuppressWarnings("uncheaked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        // System.out.println("neighbour of 2 are : ");
        // for(int i=0; i< graph[2].size(); i++) {
        // Edge e = graph[2].get(i);
        // System.out.print(e.dest + " ");
        // }

        // bfs(graph);
        // dfs(graph, 0, new boolean[graph.length]);
        // System.out.println(hasPath(graph, 0, 5, new boolean[V]));
        // bfs(graph);
        // System.out.println(detectCycle(graph));
        // System.out.println(isBipartite(graph));
        System.out.println(hasCycle(graph));
    }
}
