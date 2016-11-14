/**
 * Created by shilpagu on 12/15/2014.
 */
import java.util.*;
public class findPoint {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            int px = myScan.nextInt();
            int py = myScan.nextInt();
            int qx = myScan.nextInt();
            int qy = myScan.nextInt();
            System.out.print((2*qx)-px);
            System.out.print(" ");
            System.out.println((2*qy)-py);
        }
    }
}
