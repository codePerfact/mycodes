/**
 * Created by shilpagu on 12/17/2014.
 */
import java.util.*;
public class ExtraSpaces {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        String s = myScan.nextLine();
        System.out.println("before : "+s);
        String result = s.trim().replaceAll(" +"," ");
        System.out.println("after  :"+result);
    }
}
