/**
 * Created by shilpagu on 12/19/2014.
 */
import java.util.*;
public class MissingAP {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=myScan.nextInt();
        }

        for(int i=1; i<N-1; i++){
            if(arr[i+1]-arr[i]!=arr[i]-arr[i-1]){
                if(arr[i+1]-arr[i]>arr[i]-arr[i-1]){
                    System.out.println(arr[i]+arr[i]-arr[i-1]);
                    return;
                }else{
                    System.out.println(arr[i-1]+arr[i+1]-arr[i]);
                    return;
                }
            }
        }
    }
}
