/**
 * Created by shilpagu on 12/18/2014.
 */
import java.util.*;
public class TrimSpaces {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        String s = myScan.nextLine();
//        for(int i=0; i<s.length(); i++){
//            if(s.charAt(i)==' '){
//                for(int j=i+1; j<s.length();j++){
//                    if(s.charAt(j)!=' '){
//                        s.re
//                    }
//                }
//            }
//        }
        String s1 = s.replaceAll(" ","");


        System.out.println(s1);
    }
}
