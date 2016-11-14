/**
 * Created by shilpagu on 12/21/2014.
 */
import java.util.*;
public class DeepuAndArray {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = myScan.nextLong();
        }
        int M = myScan.nextInt();
        while(M--!=0){
            long Q = myScan.nextLong();
            for(int i=0; i<N; i++){
                if(arr[i]>Q){
                    arr[i]--;
                }
            }
        }
        for(int i=0; i<N; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
