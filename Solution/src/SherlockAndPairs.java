/**
 * Created by shilpagu on 12/19/2014.
 */
import java.math.BigInteger;
import java.util.*;
public class SherlockAndPairs {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            Long N = myScan.nextLong();
            BigInteger result =BigInteger.ZERO;
            HashMap<BigInteger,Long> map = new HashMap<BigInteger, Long>();
            while(N--!=0){
                BigInteger temp = myScan.nextBigInteger();
                if(map.containsKey(temp)){
                    Long value = map.get(temp);
                    map.put(temp,value+1);
                }else{
                    map.put(temp,Long.valueOf(1));
                }
            }
            for(BigInteger i : map.keySet()){
                long j = map.get(i);
                    if(j>1){
                        result = result.add(BigInteger.valueOf(j*(j-1)));
                }
            }
            System.out.println(result);
        }
    }
}
