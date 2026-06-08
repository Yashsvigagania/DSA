import java.util.*;
public class bfs {
    public static void BFS(int adj[][],int start,int V){
        boolean[] visited=new boolean[V];
        Queue<Integer> queue=new LinkedList<>();
        visited[start]=true;
        queue.add(start);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                int node=queue.poll();
                System.out.print(node+" ");
                for(int j=0;j<V;j++){ //adjacent vertices
                    if(adj[node][j]==1&&!visited[j]){
                        queue.add(j);
                        visited[j]=true;
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();
        int E=sc.nextInt();
        int[][]adj=new int[V][E];
        for(int i=0;i<E;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            adj[u][v]=1;
            adj[v][u]=1;  //undirected graph
        }
        int start=sc.nextInt();
        BFS(adj,start,V);
    }
}
