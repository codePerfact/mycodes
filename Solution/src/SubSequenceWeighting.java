import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubSequenceWeighting {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            int N = myScan.nextInt();
            long[] a = new long[N];
            long[] w = new long[N];
            for(int i=0; i<N; i++){
                a[i]=myScan.nextLong();
            }
            for(int i=0; i<N; i++){
                w[i]=myScan.nextLong();
            }
            long[] wSum = new long[N];
            wSum[0]=w[0];
            long max = wSum[0];
            for(int i=1; i<N; i++){
                max=0;
                for(int j=i-1; j>=0; j--){
                    if(a[j]<a[i]){
                        if((wSum[j]+w[i])>max){
                            max = wSum[j]+w[i];
                        }
                    }

                }
                wSum[i]=max;
            }

            System.out.println(wSum[N-1]);

        }
    }
}