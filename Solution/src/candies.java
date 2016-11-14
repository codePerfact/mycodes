/**
 * Created by shilpagu on 12/12/2014.
 */
import java.util.*;
public class candies {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        int[] a = new int[N];
        for(int i=0; i<N; i++){
            a[i] = myScan.nextInt();
        }
        int[] left = new int[N];
        int[] right = new int[N];
        Arrays.fill(left,1);
        Arrays.fill(right,1);

        for(int i=N-2; i>=0; i--){
            if(a[i]>a[i+1]){
                right[i]=right[i+1]+1;
            }
        }

        for(int i=1; i<N; i++){
            if(a[i]>a[i-1]){
                left[i]=left[i-1]+1;
            }
        }
        long result=0;

        for(int i=0; i<N; i++){
            if(left[i]>right[i]){
                result+=left[i];
            }else{
                result+=right[i];
            }
        }
        System.out.println(result);
    }
}
