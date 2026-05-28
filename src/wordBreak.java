import java.util.*;
public class wordBreak {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] words=sc.nextLine().split(" ");
        String s=sc.nextLine();
        HashSet<String> dict=new HashSet<>();
        for(String word:words){
            dict.add(word);
        }
        int len=s.length();
        boolean[] dp=new boolean[len+1];
        dp[0]=true;
        for(int i=0;i<=len;i++){

            for(int j=0;j<i;j++){

                if(dp[j] && dict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        if(dp[len]){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
