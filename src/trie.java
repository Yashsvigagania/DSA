import java.util.*;
public class trie {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<String> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(sc.next());
        }
        String key=sc.next();
        if(set.contains(key)){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
    }
}
