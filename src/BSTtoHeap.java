import java.util.*;
public class BSTtoHeap {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] arr=sc.nextLine().split(" ");
        ArrayList<Integer> list=new ArrayList<>();
        for(String s:arr){
            int var=Integer.parseInt(s);
            if(var!=-1){
                list.add(var);
            }
        }
        Collections.sort(list);
        for(int s:list){
            System.out.print(s+" ");
        }

    }
}
