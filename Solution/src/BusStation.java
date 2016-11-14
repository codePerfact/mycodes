/**
 * Created by shilpagu on 12/29/2014.
 */
import java.util.*;
public class BusStation {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int n = myScan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=myScan.nextInt();
        }
        int[] sum = new int[n];
        sum[0]=arr[0];
        for(int i=1; i<n; i++){
            sum[i]=sum[i-1]+arr[i];
        }
        for(int i=0; i<n; i++) {
            int oneTime = sum[i];
            if (sum[n - 1] % oneTime == 0) {
                int check=0;
                for (int j = i + 1; j < n; j++) {
                    check += arr[j];
                    if (check == oneTime) {
                        check = 0;
                    }else if(check>oneTime){
                        break;
                    }
                }
                if(check==0){
                    System.out.print(oneTime+" ");
                }
            }

        }
    }
}
