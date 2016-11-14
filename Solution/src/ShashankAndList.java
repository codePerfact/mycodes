import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ShashankAndList {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        long[] a = new long[N];
        for (int i = 0; i < N; i++) {
            a[i] = myScan.nextLong();
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < N; i++) {
            result=result.multiply(power(2,a[i]).add(BigInteger.ONE)).mod(BigInteger.valueOf(1000000007));
        }
        System.out.println(result.add(BigInteger.valueOf(1000000006)).mod(BigInteger.valueOf(1000000007)));
    }

    public static BigInteger power(int a, long b){
        if(b==0){
            return BigInteger.ONE;
        }
        if(b==1){
            return BigInteger.valueOf(a%1000000007);
        }
        if(b%2==0){
            BigInteger temp = power(a, b / 2);
            return temp.multiply(temp).mod(BigInteger.valueOf(1000000007));
        }else{
            BigInteger temp = power(a, b / 2);
            temp=temp.multiply(temp).mod(BigInteger.valueOf(1000000007));
           return temp.multiply(BigInteger.valueOf(a)).mod(BigInteger.valueOf(1000000007));
        }

    }
}

