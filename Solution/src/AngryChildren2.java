/**
 * Created by shilpagu on 1/8/2015.
 */
import java.util.*;
public class AngryChildren2 {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        int K = myScan.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=myScan.nextInt();
        }
        Arrays.sort(arr);
        int[] Sum = new int[N];
        Sum[0]=arr[0];
        for(int i=1; i<N; i++){
            Sum[i]=Sum[i-1]+arr[i];
        }
        int[] D = new int[N-K+1];
        int initial=arr[0];
        for(int i=1; i<K; i++){
            initial = initial + Math.abs(Sum[i-1]-((i-1)*arr[i]));
        }
        D[0]=initial;
        for(int i=1; i<N-K+1; i++){
            D[i] = D[i-1] - Math.abs((K-1)*arr[i-1]-(Sum[i+K-1]-Sum[i])) + Math.abs((K-1)*arr[i+K-1]-(Sum[i+K-1]-Sum[i]));
        }
        int min=1000000007;
        for(int i=0; i<N-K+1; i++){
            if(D[i]<min){
                min=D[i];
            }
        }
        System.out.println(min);
    }
}
