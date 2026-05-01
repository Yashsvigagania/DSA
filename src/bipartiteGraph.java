import java.util.*;
public class bipartiteGraph {
    public static boolean isBipartite(int[][] adj,int source,int n) {
        int[] color = new int[n];
        Arrays.fill(color, 0);
        Queue<Integer> queue = new LinkedList<>();
        color[source] = 1;
        queue.add(source);
        while (!queue.isEmpty()) {
            int node = queue.poll();  //Retrieves and removes the head of this queue, or returns null if this queue is empty.
            for (int i = 0; i < n; i++) {
                if (adj[node][i] == 1) {
                    color[i] = -color[node];
                    queue.add(i);
                } else if (color[i] == color[node]) {
                    return false;

                }
            }
        }
        return true;
    }
}
