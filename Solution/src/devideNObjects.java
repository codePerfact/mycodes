import java.math.BigInteger;
import java.util.*;
public class devideNObjects {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        int R = myScan.nextInt();
        N -= R;
        if(N<=0 || R<=0){
            System.out.println("-1");
            return;
        }
        BigInteger result = factorial(N+R-1).divide(factorial(N).multiply(factorial(R-1)));
        System.out.println(result.mod(BigInteger.valueOf(10000007)));
    }
    private static BigInteger factorial(int a){
        if(a<=1){
            return BigInteger.ONE;
        }else{
            return BigInteger.valueOf(a).multiply(factorial(a-1));
        }
    }
}
