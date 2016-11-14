/**
 * Created by shilpagu on 1/13/2015.
 */
import java.util.*;
public class noOfCoins {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int n = myScan.nextInt();
        int S = myScan.nextInt();
        int[] arr = new  int[n];
        for(int i=0; i<n; i++){
            arr[i]=myScan.nextInt();
        }
        System.out.println(Coins(arr,n,S));
    }
    public static int Coins(int[] arr, int n, int S){
        int[] min = new int[S+1];
        Arrays.fill(min,S);
        min[0]=0;
        for(int i=1; i<(S+1); i++){
            for(int j=0; j<n; j++){
                if(i-arr[j]>=0 && min[i-arr[j]]+1<min[i]){
                    min[i]=min[i-arr[j]]+1;
                }
            }
        }
        return min[S];
    }
}
