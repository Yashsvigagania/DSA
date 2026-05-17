import java.util.*;
public class dynamicKnapsack {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] value=new int[n];
        int[] weight=new int[n];
        for(int i=0;i<n;i++){
            value[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            weight[i]=sc.nextInt();
        }
        int[][] dp=new int[n][n];
        for(int i=1;i<=n;i++){
            for(int w=1;w<=m;w++){
                if(weight[i-1]<=w){
                    int take=value[i-1]+dp[i-1][w-weight[i-1]];
                    int skip=dp[i-1][w];
                    dp[i][w]=Math.max(take,skip);
                }
                else{
                    dp[i][w]=dp[i-1][w];
                }
            }
        }
        System.out.println(dp[n][m]);
        sc.close();
    }
}
