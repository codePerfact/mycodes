import java.math.BigInteger;
import java.util.*;
 class DexterandMandark {
    public static void main(String args[]){
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            long result=0;
            int N = myScan.nextInt();
            int M = myScan.nextInt();
            result = possibleWays(N, M, 0, 0);
            System.out.println(result%1000000007);
            }

        }
        private static long possibleWays(int N,int M, int d, int m){
            if(N==0){
                return 1;
            }else if(((d+1)>=(M*m)) && (d>=(M*(m+1)))){
                return possibleWays(N-1,M,d+1,m)+ (possibleWays(N-1,M,d,m+1));
            }else if((d+1)>=(M*m)){
                return possibleWays(N-1,M,d+1,m);
            }else{
                return 0;
            }
        }



}
