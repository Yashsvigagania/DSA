import java.util.*;
public class mergeSortedArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] arr1Str= sc.nextLine().split(" ");
        int n1=arr1Str.length;
        int[] arr1=new int[n1];
        for(int i=-0;i<n1;i++){
            arr1[i]=Integer.parseInt(arr1Str[i]);
        }
        int m=sc.nextInt();
        sc.nextLine();
        String[] arr2Str=sc.nextLine().split(" ");
        int n2=arr2Str.length;
        int[] arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=Integer.parseInt(arr2Str[i]);
        }
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            arr1[m+i]=arr2[i];
        }
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}