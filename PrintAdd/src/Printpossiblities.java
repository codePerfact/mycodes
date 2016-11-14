/**
 * Created by shilpagu on 1/9/2015.
 */
import java.util.*;
public class Printpossiblities {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        String input = myScan.nextLine();
        char[] in = new char[input.length()];
        in = input.toCharArray();
        char[] result = new char[input.length()];
        int covered = 0;
         printperm(in,result,covered);
    }
        public static void printperm(char[] in, char[] result, int covered){
                if(covered == in.length){
                    System.out.println(result);
                    return;
                }
            else if (in[covered]=='?'){
                    result[covered] = '0';
                    printperm(in,result,covered+1);
                    result[covered]='1';
                    printperm(in,result,covered+1);
                }else {
                    result[covered] = in[covered];
                    printperm(in,result,covered+1);
                }
        }

}
