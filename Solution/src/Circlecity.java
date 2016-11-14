import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Circlecity {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            long R = myScan.nextLong();
            long K = myScan.nextLong();
            long maxX = (long)Math.ceil(Math.sqrt(R));
            int count = 0;
            long y;
            for(int x=1; x<=maxX; x++){
                y=(int)Math.sqrt(R-(x*x));
                if((x*x)+(y*y)==R){
                    count++;
                }
            }
            if(Math.sqrt(R) > Math.floor(Math.sqrt(R))){
                if (K<4*count){
                    System.out.println("impossible");
                }else{
                    System.out.println("possible");
                }
            }else {
                if (K < ((4 * count) + 4)) {
                    System.out.println("impossible");
                } else {
                    System.out.println("possible");
                }
            }
        }
    }
}