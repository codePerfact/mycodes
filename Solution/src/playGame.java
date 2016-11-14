/**
 * Created by shilpagu on 12/13/2014.
 */
import java.util.*;
public class playGame {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            int N = myScan.nextInt();
            int[] a = new int[N];
            for(int i=N-1; i>=0; i--){
                a[i]=myScan.nextInt();
            }
            long[] sum = new long[N];
            sum[0]=a[0];
            for(int i=1; i<N; i++){
                sum[i]=sum[i-1]+a[i];
            }
            long[] dp = new long[N];
            if(N>3){
                dp[0]=sum[0];
                dp[1]=sum[1];
                dp[2]=sum[2];
            }else{
                System.out.println(sum[N-1]);
            }

            for(int i=3; i<N; i++){
                dp[i]=max(sum[i-1]-dp[i-1]+a[i],sum[i-2]-dp[i-2]+a[i]+a[i-1],sum[i-3]-dp[i-3]+a[i]+a[i-1]+a[i-2]);
            }
            System.out.println(dp[N-1]);
        }
    }

    public static long max(long a, long b, long c){
        if(a>b){
            if(a>c){
                return a;
            }else{
                return c;
            }
        }else{
            if(b>c){
                return b;
            }else{
                return c;
            }
        }
    }
}
