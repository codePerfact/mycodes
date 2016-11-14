import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EasySum {

    public static void main(String[] args) {
       Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            long N = myScan.nextLong();
            long M = myScan.nextLong();
            long R = N%M;
            long result = M*(M-1)/2*(N/M) + R*(R+1)/2;
            System.out.println(result);

        }
    }
}