/**
 * Created by shilpagu on 12/15/2014.
 */
import java.math.BigInteger;
import java.util.*;
public class SummingTheKnSeries {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            BigInteger n = myScan.nextBigInteger();
            int k = myScan.nextInt();
            int count = n.divide(BigInteger.valueOf(1000000007)).intValue();
            long remainder = n.mod(BigInteger.valueOf(1000000007)).longValue();
            long result = 0;
            for(int i=0; i<1000000007; i++){
                result += Math.pow(i,k)%1000000007;
            }
            result = (result*count)%1000000007;
            for(int i=1; i<=remainder; i++){
                result = (result+(long)Math.pow(i,k))%1000000007;
            }
            System.out.println(result%1000000007);
        }
    }
}
