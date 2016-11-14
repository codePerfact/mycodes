/**
 * Created by shilpagu on 12/15/2014.
 */
import java.math.BigInteger;
import java.util.*;
public class ManasaAndSubSequences {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        BigInteger N = myScan.nextBigInteger();
        int[] number = new int[2*10*10*10*10*10];
        Stack<Integer> stack = new Stack<Integer>();
        BigInteger n=N;
        int i=0;
        while(n!=BigInteger.ZERO){
            stack.push(n.mod(BigInteger.valueOf(10)).intValue());
            n=n.divide(BigInteger.valueOf(10));
        }
        int size = stack.size();
        while(size--!=0){
            number[i++]=stack.pop();
        }
        long[] S = new long[(int)Math.pow(2,i)];
        int numberOfDigits = i;
        S[0]=number[0];
        int index=0;
        for(int j=1; j<numberOfDigits; j++){
            int till = index;
            S[++index]=number[j];
            for(int p=0; p<=till; p++){
                S[++index]= (S[p]*10+number[j]);
            }
        }


//        for(int p=0; p<numberOfDigits; p++){
//            System.out.println(S[p]);
//        }

        long result=0;
        for(int m=0; m<=index; m++){
            result += S[m]%1000000007;
        }
        System.out.println(result%1000000007);
    }
}
