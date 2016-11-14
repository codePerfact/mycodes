/**
 * Created by shilpagu on 12/19/2014.
 */
import java.util.*;
public class SherlockAndWatson {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        int K = myScan.nextInt();
        int Q = myScan.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i]=myScan.nextInt();
        }
        while(Q--!=0){
            int index = myScan.nextInt();
            for(int i=0; i<K; i++){
                if(index==0){
                    index=N-1;
                }else{
                    index--;
                }
            }
            System.out.println(arr[index]);
        }
    }
}
