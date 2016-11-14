/**
 * Created by shilpagu on 12/13/2014.
 */
import java.math.BigInteger;
import java.util.*;
public class samAndSubString {
    public static void main(String[]args){
        Scanner myScan = new Scanner(System.in);
        String input = myScan.nextLine();
        long[] sd = new long[input.length()];
        sd[0] = (input.charAt(0)-'0');
        for(int j=0; j<input.length()-1; j++){
            sd[j+1] += ((j+2)*(input.charAt(j)-'0'))%1000000007;
            sd[j+1] += (10*sd[j])%1000000007;
        }
        BigInteger result = BigInteger.ZERO;
        for(int k=0; k<input.length(); k++){
            result = result.add(BigInteger.valueOf(sd[k])).mod(BigInteger.valueOf(1000000007));
        }

        System.out.println(result.mod(BigInteger.valueOf(1000000007)));

            }
}
