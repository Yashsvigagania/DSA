import java.util.*;
public class kthSmallestInTree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ArrayList<String> arr=new ArrayList<>();
        String x;  // Variable to temporarily store each input value
        while(sc.hasNext()){  // Checks if there is another token available
            x=sc.next(); // Reads next input as a String
            if(x.equals("-1")){  // If input equals "-1", stop taking input
                break;
            }
            arr.add(x);  // Otherwise, add the string to the list
        }
        int k=sc.nextInt();  // Read integer k (to find k-th smallest element)
        ArrayList<Integer> a=new ArrayList<>();   // List to store valid integer values (excluding "null")
        int n=arr.size();  // Store number of elements in arr
        for(int i=0;i<n;i++){
            if(!arr.get(i).equals("null")) {  // Check if element is NOT equal to "null"
                a.add(Integer.parseInt(arr.get(i))); // Convert string to integer and add to list 'a'
            }
        }
        Collections.sort(a);
        System.out.println(a.get(k-1));

    }
}
