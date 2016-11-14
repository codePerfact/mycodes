/**
 * Created by shilpagu on 12/19/2014.
 */
import java.util.*;
public class FindTheMedian {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<N; i++){
            arr.add(myScan.nextInt());
        }
        Collections.sort(arr);
        if(N%2==0){
            System.out.println((arr.get(N/2) + arr.get((N/2)+1))/2);
        }else{
            System.out.println(arr.get(N/2));
        }
    }
}
