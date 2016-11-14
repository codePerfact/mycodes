/**
 * Created by shilpagu on 12/10/2014.
 */
import java.math.BigInteger;
import java.util.*;
public class ncrTable {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            int N = myScan.nextInt();
            BigInteger nck = BigInteger.ONE;
            int i=N;
            for(int j=0; j<=N; j++){
                System.out.print(nck.mod(BigInteger.valueOf(1000000000))+" ");
                nck = nck.multiply(BigInteger.valueOf(i-j)).divide(BigInteger.valueOf(j+1));
            }
            System.out.println();
        }
    }
}
