import java.util.*;
public class maxHeap {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>();
        //PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            int var=sc.nextInt();
            maxHeap.add(-var);
            //maxHeap.add(-var);
        }
        while(!maxHeap.isEmpty()){
            int node=maxHeap.poll();
            System.out.print(-node+" ");
            //System.out.print(-node+" ");
        }
    }
}
