import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pairs {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        long diff = myScan.nextLong();
        HashMap<BigInteger, Integer> map = new HashMap<BigInteger, Integer>();
        long count=0;
        for(int i=0; i<N; i++){
            BigInteger temp = myScan.nextBigInteger();
            if(map.containsKey(temp.add(BigInteger.valueOf(diff))) && map.containsKey(temp.subtract(BigInteger.valueOf(diff)))){
                count++;
                count++;
                map.put(temp,0);
            }else if(map.containsKey(temp.add(BigInteger.valueOf(diff))) || map.containsKey(temp.subtract(BigInteger.valueOf(diff)))){
                count++;
                map.put(temp,0);
            }else {
                map.put(temp, 0);
            }
        }
        System.out.println(count);
    }
}
