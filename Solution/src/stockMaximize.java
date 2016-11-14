/**
 * Created by shilpagu on 12/12/2014.
 */
import java.util.*;
public class stockMaximize {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            int N = myScan.nextInt();
            int[] a = new int[N];
            for(int i=0; i<N; i++){
                a[i] = myScan.nextInt();
            }
            long result=0;
            int currMax = 0;
            for(int j=N-1; j>=0; j--){
                if(a[j]>currMax){
                    currMax=a[j];
                }
                result += currMax - a[j];
            }
            System.out.println(result);
        }
    }
}
