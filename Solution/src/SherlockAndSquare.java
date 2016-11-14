import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class  SherlockAndSquare{

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            long N = myScan.nextLong();
            BigInteger result = BigInteger.valueOf(4);
            if(N>0){
                result=result.add(BigInteger.valueOf((long)(2*(power(N)-1))%1000000007)).mod(BigInteger.valueOf(1000000007));
            }
            System.out.println(result);
        }

    }

    public static long power(long b){
        if(b==0){
            return 1;
        }
        if(b%2==0){
            long temp = power(b/2)%1000000007;
            return (temp*temp)%1000000007;
        }else{
            long temp=power(b/2)%1000000007;
            return (temp*temp*2)%1000000007;
        }
    }
}