/**
 * Created by shilpagu on 12/28/2014.
 */
import java.util.*;
public class SubStrings {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
            String input = myScan.next();
            int n = myScan.nextInt();
            String[] str = new String[n];
            for(int i=0; i<n; i++){
                str[i]=myScan.next();
            }
        System.out.println(countNo(input,str).length());

    }

    public static String countNo(String input, String[] str){
        boolean found = false;
        for(String s : str){
            if(input.indexOf(s)>=0){
                String s1 = input.substring(0,input.indexOf(s));
                String s2 = input.substring(input.indexOf(s)+s.length(),input.length());
                return countNo(s1+s2,str);
            }
        }
        return input;
    }
}
