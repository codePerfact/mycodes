/**
 * Created by shilpagu on 12/19/2014.
 */
import java.util.*;
public class NoOfPrime {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        System.out.println(noOfPrimes(N));

    }

    public static int noOfPrimes(int N){
        int count=0;
        Boolean arr[] = new Boolean[N+1];
        Arrays.fill(arr,false);
        if(N>=2){
            for(int i=2; i<=N; i++){
                if(!arr[i]){
                    arr[i]=true;
                    markAll(arr,i,i);
                    count++;
                }
            }
        }
        return count;
    }

    public static void markAll(Boolean[] arr,int start, int jump){
        for(int i=start; i<arr.length; i+=jump){
            arr[i]=true;
        }
    }
}
