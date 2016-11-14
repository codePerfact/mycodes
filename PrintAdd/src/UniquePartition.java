/**
 * Created by shilpagu on 12/29/2014.
 */
import java.lang.*;
public class UniquePartition {
public static int m=4;
    public static void main(String[] args){
        partition(10);
    }
    public static void partition(int n){
            int[] p = new int[n];
            int k = 0;
            p[k] = n;
            while (true)
            {
                if((k+1)==m) {
                    printArray(p, k + 1);
                }
                int rem_val = 0;
                while (k >= 0 && p[k] == 1)
                {
                    rem_val += p[k];
                    k--;
                }
                if (k < 0)  return;
                p[k]--;
                rem_val++;
                while (rem_val > p[k])
                {
                    p[k+1] = p[k];
                    rem_val = rem_val - p[k];
                    k++;
                }
                p[k+1] = rem_val;
                k++;
            }
        }
    public static void printArray(int p[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(p[i]);
        System.out.println();
    }
}
