import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SteppingStone {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            long N = myScan.nextLong();
            N = N*2;
            long n = (int)Math.sqrt(N);
            if((n*(n+1))==N){
                System.out.println("Go On Bob "+n);
            }else{
                System.out.println("Better Luck Next Time");
            }
        }
    }
}