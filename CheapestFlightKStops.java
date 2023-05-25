
// package Graphs;
import java.util.*;

public static CheapestFlightKStops{

    static class Info {
        int src;
        int dest;
        int wt;
    
        Info(int s, int d, int wt) {
            this.src = s;
            this.dest = d;
            this.wt = wt;
        }
    }
     
    public static cheapestFlightKStops(int flights[][], int src, int k) {
        int[] dist = new int[flights.length];
        for(int i = 0;i<dist.length;i++) {
            if (dist[i] != src) dist[i] = Integer.MAX_VALUE;
        }

        Queue<Info> pq = new LinkedList<>();
        pq.add(new Info(0,0,0));
    }

    public static void main(String[] args) {
        int n = 4;
        int flights[][] = { { 0, 1, 100 }, { 1, 2, 100 }, { 2, 0, 100 }, { 1, 3, 600 }, { 2, 3, 200 } };
        int src = 0, dest = 3, k = 1;
        
    }
}
