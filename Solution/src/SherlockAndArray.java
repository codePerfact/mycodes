/**
 * Created by shilpagu on 12/19/2014.
 */
import java.util.*;
public class SherlockAndArray {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0) {
            int N = myScan.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = myScan.nextInt();
            }
            String result = "NO";
            if (N == 1) {
                result = "YES";
                System.out.println(result);
            } else {
                int leftSum = arr[0];
                int rightSum = arr[N - 1];
                for (int i = 0, j = N - 1; i < j; ) {
                    if (leftSum == rightSum) {
                        if (i + 2 == j) {
                            result = "YES";
                            break;
                        }
                        i++;
                        j--;
                        leftSum += arr[i];
                        rightSum += arr[j];
                    } else if (leftSum < rightSum) {
                        i++;
                        leftSum += arr[i];
                    } else {
                        j--;
                        rightSum += arr[j];
                    }

                }
                System.out.println(result);
            }
        }
    }
}
