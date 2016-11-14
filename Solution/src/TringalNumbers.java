import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TringalNumbers {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            BigInteger N = myScan.nextBigInteger();
            if(N.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)){
                if(((N.divide(BigInteger.valueOf(2)).mod(BigInteger.valueOf(2))).equals(BigInteger.ZERO))){
                    System.out.println("3");
                }else{
                    System.out.println("4");
                }
            }else{
                System.out.println("2");
            }
        }
    }
}