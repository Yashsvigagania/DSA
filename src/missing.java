/*The missing number of a sequence is the number that is absent from a
continuous sequence of numbers but should be present according to the sequence pattern.
 */
import java.util.Scanner;

public class missing {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] input=sc.nextLine().split(","); //read the line of input seperated by comma
        int n=input.length;
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(input[i]); //convert each string into integer
            sum+=arr[i];
        }
        int total=n*(n+1)/2;
        System.out.println(total-sum);
    }
}
