/**
 * Created by shilpagu on 12/19/2014.
 */
import java.util.*;
public class MarkAndToys {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        long K = myScan.nextLong();
        ArrayList<Long> arr = new ArrayList<Long>();
        for(int i=0; i<N; i++){
            arr.add(myScan.nextLong());
        }
        Collections.sort(arr);
        int result=0;
        long totalSpent =0;
        int i=0;
        while(totalSpent<K){
            totalSpent += arr.get(i++);
            ++result;
        }
        System.out.println(--result);
    }
}
