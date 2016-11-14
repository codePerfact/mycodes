import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AChocolateFiesta {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        int odd=0;
        int[] a = new int[N];
        for(int i=0; i<N; i++){
            a[i]=myScan.nextInt();
            if((a[i]%2)!=0){
                odd++;
            }
        }
        if(odd==0){
            System.out.println((power(N)-1)%1000000007);
        }else{
            System.out.println(((power(N-1))-1)%1000000007);
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