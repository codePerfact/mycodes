/**
 * Created by shilpagu on 12/12/2014.
 */
import java.util.*;
public class RedJohnisBack {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            long[] possibleWays = new long[41];
            for(int i=0; i<4; i++){
                possibleWays[i]=1;
            }
                for(int i=3; i<40; i++){
                    possibleWays[i+1]=possibleWays[i]+possibleWays[i-3];
                }
           boolean[] P = new boolean[220000];
            Arrays.fill(P,true);
            P[0]=false;
            P[1]=false;
            for(int i=2; i<(int)Math.sqrt(220000); i++){
                if(P[i]==true){
                    for(int j=i*i; j<220000; j+=i){
                        P[j]=false;
                    }
                }
            }
            long result=0;
            int N = myScan.nextInt();
            for(int i=0; i<=possibleWays[N];i++){
                if(P[i]==true){
                    result++;
                }
            }
            System.out.println(result);
        }
    }


}
