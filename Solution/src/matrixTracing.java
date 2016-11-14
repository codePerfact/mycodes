/**
 * Created by shilpagu on 12/11/2014.
 */
import java.math.BigInteger;
import java.util.*;
public class matrixTracing {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            int M = myScan.nextInt();
            int N = myScan.nextInt();
            System.out.println(factorial(M+N-2).multiply(power(factorial(M-1),1000000005)).multiply(power(factorial(N-1),1000000005)).mod(BigInteger.valueOf(1000000007)));
        }
    }

    private static BigInteger factorial(int a){
        if(a<=1){
            return BigInteger.ONE;
        }else{
            a= a%100000007;
            return BigInteger.valueOf(a).multiply(factorial(a-1).mod(BigInteger.valueOf(1000000007)));
        }
    }

    public static BigInteger power(BigInteger n,long p){
        if(n==BigInteger.ONE) {
            return BigInteger.ONE;
        }
        if(p==0){
            return BigInteger.ONE;
        }else if(p==1){
            return n.mod(BigInteger.valueOf(1000000007));
        }else{
            BigInteger result;
            BigInteger temp = power(n,p/2).mod(BigInteger.valueOf(1000000007));
           result = temp.multiply(temp).multiply(n).mod(BigInteger.valueOf(1000000007));
            return result;
        }
    }
}
