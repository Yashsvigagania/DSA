/*[1 2 1 3] → distinct = 3
[2 1 3 4] → distinct = 4
[1 3 4 2] → distinct = 4
[3 4 2 3] → distinct = 3
 */
import java.util.*;
public class distinctWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i = 0; i <= n - k; i++) {
            int count = 0;
            for (int j = i; j < i + k; j++) {
                boolean isDistinct = true;
                for (int x = i; x < j; x++) {
                    if (arr[x] == arr[j]) {
                        isDistinct = false;
                        break;
                    }

                }
                if (isDistinct) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

