import java.util.*;
public class quickSort {
    public static void partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[pivot];
        arr[pivot]=arr[i+1];
    }
    public static void quickSortt(int[] arr,int low,int high){
        if(low<high){
           int pi= partition(arr, low, high);
           quickSortt(arr, low, pi-1);
           quickSortt(arr,pi+1,high);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quickSortt(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
