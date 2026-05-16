import java.util.*;
public class fractionalKnapsack {
    static class Item{
        int value,weight;
        double ratio;
        Item(int value,int weight){
            this.value=value;
            this.weight=weight;
            this.ratio=(double)value/weight;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int capacity=sc.nextInt();
        Item[] items=new Item[n];
        for(int i=0;i<n;i++){
            int value=sc.nextInt();
            int weight=sc.nextInt();
            items[i]= new Item(value,weight);
        }
        Arrays.sort(items,(a,b)->Double.compare(b.ratio,a.ratio));
        double maxValue=0.0;
        for(Item item:items){
            if(capacity>=item.weight){
                maxValue+=item.value;
                capacity-=item.weight;
            }
            else{
                maxValue=item.ratio*capacity;
                break;
            }
        }
        System.out.printf("%.6f\n",maxValue);
        sc.close();
    }
}
