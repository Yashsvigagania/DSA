import java.util.*;
public class coinChange {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
        int n=sc.nextInt();
        int[] coins=new int[n];
        for(int i=0;i<n;i++){
            coins[i]=sc.nextInt();
        }
        int[] dp=new int[sum+1];
        dp[0]=1;
        for(int coin:coins){
            for(int i=coin;i<=sum;i++){
                dp[i]+=dp[i-coin];
            }
        }
        System.out.println(dp[sum]);
        sc.close();
    }
}
