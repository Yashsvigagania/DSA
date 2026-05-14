import java.util.*;
public class dfs {
    public static void DFS(int node,int[][] adj,boolean[] visited,int V){
        visited[node]=true;
        System.out.print(node+" ");
        for(int i=0;i<V;i++) {
            if (adj[node][i] == 1 && !visited[i]){
                DFS(i, adj,visited, V);
            }
        }
    }
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();
        int E=sc.nextInt();
        int[][] adj=new int[V][V];
        for(int i=0;i<E;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            adj[u][v]=1;
            adj[v][u]=1;
        }
        int start=sc.nextInt();
        boolean[] visited=new boolean[V];
        DFS(start,adj,visited,V);
    }
}
