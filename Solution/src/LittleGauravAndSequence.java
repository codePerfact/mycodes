import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LittleGauravAndSequence {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            long N = myScan.nextLong();
            int l = (int)(Math.log(N)/Math.log(2));
            int Sum1=0;
            if(l==0){
                Sum1=2;
            }else if(l>=1){
                Sum1=6*(l%10);
                Sum1=Sum1%10;
            }
            int Sum2;
            if(N%2==0){
                Sum2=1;
            }else{
                Sum2=5;
            }
            int S;
            S=((Sum1%10)*(Sum2%10))%10;
            System.out.println(S);
        }
    }
}