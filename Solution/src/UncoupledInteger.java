/**
 * Created by shilpagu on 12/28/2014.
 */
import java.util.*;
public class UncoupledInteger {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        String input = myScan.nextLine();
        String[] strs = input.split(",");
        int[] a = new int[strs.length];
        for(int i=0; i<strs.length;i++){
            a[i]=Integer.parseInt(strs[i]);
        }
        for(int i=0; i<strs.length; i++){
            System.out.println(a[i]);
        }
        int result = a[0];
        for(int i=1; i<strs.length; i++){
            result = result ^ a[i];
        }

        System.out.println(result);
    }
}
