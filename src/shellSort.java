import java.util.*;
public class shellSort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] line= sc.nextLine().split(" ");
        if(line.length!=n){
            System.out.println("-1");
            return;
        }
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(line[i]);
        }
        for(int gap=n/2;gap>0;gap/=2){
            for(int j=gap;j<n;j++){
                for(int i=j-gap;i>0;i-=gap){
                    if(arr[i]<arr[i+gap]){
                        break;
                    }
                    int temp=arr[i];
                    arr[i]=arr[i+gap];
                    arr[i+gap]=temp;
                }
            }
        }
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+" ");
        }
        if(n>0){
            System.out.println(arr[n-1]);
        }
        sc.close();
    }
}
