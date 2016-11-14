import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PowerCalculation {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            long result=0;
            long K = myScan.nextLong();
            long N = myScan.nextLong();
            int remain = (int)K%100;
            if(K>100) {
                for (long i = 1; i <= 100; i++) {
                    result = (result + power2Digit(i, N)) % 100;
                }
                result=(((int)K/100)*result)%100;
            }
            for(int j=1; j<=remain; j++){
                result = (result + power2Digit(j,N))%100;
            }
            System.out.println(String.format("%02d",result));
        }
    }

    public static long power2Digit(long a, long b){
        int result=1;
        if(b==0){
            return 1;
        }
        if(b==1){
            return (int)(a%100);
        }
        else{
            if(b%2==0){
                long temp = power2Digit(a,b/2)%100;
                return (temp*temp)%100;
            }else{
                long temp = power2Digit(a,b/2)%100;
                return (temp*temp*a)%100;
            }
        }
    }
}