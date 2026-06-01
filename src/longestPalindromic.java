// Longest Palindromic Subsequence
import java.util.*;
public class longestPalindromic {
    public static void main(String[] args){
        Scanner sc=new Scanner();
        String s=sc.nextLine();
        int n=s.length();
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]= 1;
        }
        for(int len=2;len<n;len++){
            for(int i=0;i<n-len;i++){
                int j=i+len-1;
                if(s.charAt(i)==s.charAt(j)){
                    if(len==2){
                        dp[i][j]=2;
                    }
                }
            }
        }
    }
}
