/**
 * Created by shilpagu on 12/18/2014.
 */
import java.util.*;
public class flipBiits {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            long input = myScan.nextLong();
            long xor = (long)Math.pow(2,32)-1;
            System.out.println(input^xor);
        }
    }

}
