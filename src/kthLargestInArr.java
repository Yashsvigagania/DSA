/*The kth largest element is the element that would appear at position k from the end
if the array were sorted in descending order*/
import java.util.*;
public class kthLargestInArr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        Arrays.sort(a);
        System.out.println(a[n-k]);
    }
}
