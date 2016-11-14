/**
 * Created by shilpagu on 12/21/2014.
 */
import java.util.*;
public class WaterCollected {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            int N = myScan.nextInt();
            long[] arr = new long[N];
            for(int j=0; j<N; j++){
                arr[j]=myScan.nextLong();
            }
            long result =0;
            long temp=0;
            if(N<=2){
                result = 0;
            }else {
                long key = arr[0];
                int keyIndex = 0;
                for (int i = 1; i < N; i++) {
                    if (arr[i] < key) {
                        temp = (temp + (key - arr[i]) % 1000000007) % 1000000007;
                        if(i==N-1){
                            key = arr[keyIndex+1];
                            i=keyIndex+2;
                            temp=0;
                        }
                    } else if (arr[i] >= key) {
                        result = (result + temp % 1000000007) % 1000000007;
                        temp = 0;
                        key = arr[i];
                        keyIndex=i;
                    }
                }
            }
            System.out.println(result%1000000007);
        }
    }
}
