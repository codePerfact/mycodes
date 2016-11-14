/**
 * Created by shilpagu on 12/15/2014.
 */
import java.util.*;
public class CommanChild {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        String s1 = myScan.nextLine();
        String s2 = myScan.nextLine();
        int[][]  dp = new int[s1.length()+1][s2.length()+1];
        for(int i=0; i<=s1.length(); i++){
            Arrays.fill(dp[i],0);
        }
        for (int j=1; j<=s1.length(); j++){
            for(int k=1; k<=s2.length(); k++){
                if(s1.charAt(j-1) == s2.charAt(k-1)){
                    dp[j][k] = dp[j-1][k-1]+1;
                }else{
                    dp[j][k] = max(dp[j-1][k],dp[j][k-1]);
                }
            }
        }

        System.out.println(dp[s1.length()][s2.length()]);


            }


    public static int max(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}
