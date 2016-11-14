import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by shilpagu on 12/12/2014.
 */
public class fibonacciModified {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        BigInteger A = myScan.nextBigInteger();
        BigInteger B = myScan.nextBigInteger();
        int n = myScan.nextInt();
        int t = n - 2;
        BigInteger c=BigInteger.ZERO;
        for (int i = 0; i < t; i++) {
            c = B.multiply(B).add(A);
            A=B;
            B=c;
        }
        System.out.println(c);

    }
}
