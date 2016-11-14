/**
 * Created by shilpagu on 1/4/2015.
 */
import java.util.*;
public class Knapsack {
    public static int n;
    public static int K;
    public static int[] arr;
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
             n = myScan.nextInt();
             K = myScan.nextInt();
             arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=myScan.nextInt();
            }
            int result;
            result = knapSack(0, K);
            //System.out.println(result);
        }
    }

    public static int knapSack(int start, int k){
        if(k<=0){
            return K;
        }else if(start > n-1){
            return K-k;
        }else{
        int result=0;
        for(int i=0; (i*arr[start])<k; i++){
            int temp = i*arr[start]+knapSack(start+1,k-(i*arr[start]));
            if(temp>result){
                result = temp;
            }
        }
        return result;
        }
    }
}
