import java.util.*;
public class bitCount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] arr=new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr,(a,b) -> {
            int bitA=Integer.bitCount(a);
            int bitB=Integer.bitCount(b);
            return bitB-bitA;
        });
        System.out.println(Arrays.toString(arr));
    }
}
