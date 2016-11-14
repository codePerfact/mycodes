/**
 * Created by shilpagu on 12/11/2014.
 */
import java.math.BigInteger;
import java.util.*;
public class kcandystore {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0) {
            int N = myScan.nextInt();
            int K = myScan.nextInt();
            BigInteger nck;
            System.out.println(factorial(N+K-1).divide(factorial(K)).divide(factorial(N-1)).mod(BigInteger.valueOf(1000000000)));

        }
    }

    private static BigInteger factorial(int a){
        if(a<=1){
            return BigInteger.ONE;
        }else{
            return BigInteger.valueOf(a).multiply(factorial(a-1));
        }
    }

}
