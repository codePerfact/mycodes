import sun.security.util.BigInt;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SummingTheNSeries {

    public static void main(String[] args) {
       Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            BigInteger N = myScan.nextBigInteger();
            System.out.println(N.multiply(N).mod(BigInteger.valueOf(1000000007)));
        }
    }
}