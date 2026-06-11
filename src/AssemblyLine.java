import java.util.*;
public class AssemblyLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of stations
        int[] a1 = new int[n];
        int[] a2 = new int[n];
        int[] t1 = new int[n];
        int[] t2 = new int[n];
        // input processing times
        for (int i = 0; i < n; i++) a1[i] = sc.nextInt();
        for (int i = 0; i < n; i++) a2[i] = sc.nextInt();
        // input transfer times (start from index 1)
        for (int i = 1; i < n; i++) t1[i] = sc.nextInt();
        for (int i = 1; i < n; i++) t2[i] = sc.nextInt();
        int e1 = sc.nextInt(), e2 = sc.nextInt();
        int x1 = sc.nextInt(), x2 = sc.nextInt();
        int f1 = e1 + a1[0];
        int f2 = e2 + a2[0];
        for (int i = 1; i < n; i++) {
            int newf1 = Math.min(f1 + a1[i], f2 + t2[i] + a1[i]);
            int newf2 = Math.min(f2 + a2[i], f1 + t1[i] + a2[i]);
            f1 = newf1;
            f2 = newf2;
        }
        int result = Math.min(f1 + x1, f2 + x2);
        System.out.println(result);
        sc.close();
    }
}