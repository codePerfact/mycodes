/**
 * Created by shilpagu on 12/15/2014.
 */
import java.math.BigInteger;
import java.util.*;
public class GameOfThrons2 {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        String s = myScan.nextLine();
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++){
            Character key = s.charAt(i);
            if(map.containsKey(key)){
                int val = map.get(key);
                map.put(key,val+1);
            }else{
                map.put(key,1);
            }
        }
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int noOfChar=0;
        for(Character a : map.keySet()){
            noOfChar += (map.get(a)/2);
            arr.add(map.get(a)/2);
        }

        BigInteger result = factorial(noOfChar).mod(BigInteger.valueOf(1000000007));
        System.out.println(result);
        for(int i=0; i<arr.size(); i++){
            result = result.divide(factorial(arr.get(i)).mod(BigInteger.valueOf(1000000007)));
            System.out.println(result);
        }
        System.out.println(result.mod(BigInteger.valueOf(1000000007)));
    }

    private static BigInteger factorial(int a){
        if(a<=1){
            return BigInteger.ONE;
        }else{
            return BigInteger.valueOf(a).multiply(factorial(a - 1));
        }
    }
}
