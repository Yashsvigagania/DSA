import java.util.*;
public class activitySelection {
    static class Activity{
        int start;
        int end;
        Activity(int s,int e){
            start=s;
            end=e;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] start=new int[n];
        int[] end=new int[n];
        for(int i=0;i<n;i++){
            start[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            end[i]=sc.nextInt();
        }
        Activity[] activities=new Activity[n];
        for(int i=0;i<n;i++){
            activities[i]=new Activity(start[i],end[i]);
        }
        Arrays.sort(activities,(a,b)-> a.end-b.end);
        int count=0;
        int lastend=-1;
        for(int i=0;i<n;i++){
            if(activities[i].start>=lastend){
                count++;
                lastend=activities[i].end;
            }
        }
        System.out.println(count);
        sc.close();
    }
}
