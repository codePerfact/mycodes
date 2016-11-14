/**
 * Created by shilpagu on 12/18/2014.
 */
import java.util.*;
public class Reverse {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        String s = myScan.nextLine();
        char[] arr = s.toCharArray();
        for(int i=0; i<arr.length/2; i++){
            char temp = arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-i-1]=temp;
        }
        System.out.println(arr);
    }
}
