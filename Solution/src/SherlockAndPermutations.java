import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndPermutations{

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            int zeros = myScan.nextInt();
            int ones = myScan.nextInt();
            ones--;
            int totalBits = zeros+ones;
            BigInteger result = factorial(totalBits).divide(factorial(zeros).multiply(factorial(ones)));
            System.out.println(result.mod(BigInteger.valueOf(1000000007)));
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