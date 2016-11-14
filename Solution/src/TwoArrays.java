/**
 * Created by shilpagu on 12/19/2014.
 */
import java.util.*;
public class TwoArrays {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            int N = myScan.nextInt();
            long K = myScan.nextLong();
            ArrayList<Long> a = new ArrayList<Long>();
            ArrayList<Long> b = new ArrayList<Long>();
            for(int i=0; i<N; i++){
                a.add(myScan.nextLong());
            }
            for(int i=0; i<N; i++){
                b.add(myScan.nextLong());
            }

            Collections.sort(a);
            Collections.sort(b);
            String result = "YES";
            for(int i=0,j=N-1; i<N && j>=0; i++,j--){
                if(a.get(i)+b.get(j)<K){
                    result = "NO";
                    break;
                }
            }
        System.out.println(result);
        }
    }
}
