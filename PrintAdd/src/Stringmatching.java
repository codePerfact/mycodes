/**
 * Created by shilpagu on 12/18/2014.
 */
import java.util.*;
public class Stringmatching {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        String s1 = myScan.nextLine();
        String s2 = myScan.nextLine();
        if(stringMatching(s1,s2)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }

    }

    public static boolean stringMatching(String s1, String s2){
        for(int i=0; i<s1.length();i++){
                if(s1.substring(i).matches(s2+".*")){
                    return true;
                }
        }
            return false;
    }
}
