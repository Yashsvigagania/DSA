import java.util.*;
public class countSort {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int range=max-min+1;
        int[] count=new int[range];
        for(int i=0;i<n;i++){
            count[arr[i]-min]++;
        }
        boolean first=true;
        for(int i=0;i<range;i++){
            while(count[i]>0){
                if(!first) System.out.print(" ");
                System.out.print(i+min);
                first=false;
                count[i]--;
            }
        }

    }
}
