/**
 * Created by shilpagu on 12/29/2014.
 */
import java.math.BigInteger;
import java.util.*;
public class GameOfRotation {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        long[] arr = new long[N];
        BigInteger sum = BigInteger.ZERO;
        BigInteger ans = BigInteger.ZERO;
        for(int i=0; i<N; i++){
            arr[i]=myScan.nextLong();
            sum = sum.add(BigInteger.valueOf(arr[i]));
            ans = ans.add(BigInteger.valueOf(arr[i]*(i+1)));
        }

        BigInteger best = ans;
        for(int i=0; i<N; i++){
            ans  = ans.subtract(sum);
            ans=ans.add(BigInteger.valueOf(arr[i]*N));
            if(ans.compareTo(best)>0){
                best=ans;
            }

        }
        System.out.println(best);
    }
}
