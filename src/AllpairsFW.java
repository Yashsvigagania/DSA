import java.util.*;
public class AllpairsFW {
    static int INF=(int)1e9;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] graph=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                graph[i][j]=sc.nextInt();
            }
        }
        int[][] dist=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(graph[i][j]==-1){
                    dist[i][j]=INF;
                }
                else{
                    dist[i][j]=graph[i][j];
                }
            }
        }
        for(int k=0;k<n;k++){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(dist[i][k]< INF && dist[k][j]<INF){
                        dist[i][j]=Math.min(dist[i][j],dist[i][k]+dist[k][j]);
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(dist[i][j]==INF){
                    System.out.print("INF"+" ");
                }
                else{
                    System.out.print(dist[i][j]+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
