/**
 * Created by shilpagu on 12/29/2014.
 */
import java.util.*;
public class SherlockMinMax {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        long[] arr = new long[N];
        for(int i=0; i<N; i++){
            arr[i]=myScan.nextLong();
        }
        long P = myScan.nextLong();
        long Q = myScan.nextLong();
        System.out.println(P);
    }
}
