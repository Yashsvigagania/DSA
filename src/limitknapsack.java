
import java.util.*;
public class limitknapsack {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        int[] value=new int[n];
        int[] weight=new int[n];
        for(int i=0;i<n;i++){
            weight[i]=sc.nextInt();
            value[i]=sc.nextInt();
        }
        int[][][] dp=new int[n+1][m+1][k+1];
        for(int i=1;i<=n;i++){
            for(int w=0;w<=m;w++){

                for(int j=0;j<=k;j++){

                    dp[i][w][j]=dp[i-1][w][j];

                    if(w>=weight[i-1] && j>=1){

                        dp[i][w][j]=Math.max(dp[i][w][j],dp[i-1][w-weight[i-1]][j-1]+value[i-1]);
                    }
                }
            }
        }
        System.out.println(dp[n][m][k]);
    }
}
