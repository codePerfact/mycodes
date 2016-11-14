/**
 * Created by shilpagu on 12/18/2014.
 */
import java.math.BigInteger;
import java.util.*;
public class SuperPower {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int a = myScan.nextInt();
        int b = myScan.nextInt();
        double power = Math.pow(2, a);
        //double result = Math.pow(2, (int)power) % b;
        System.out.println(power);
    }
}
