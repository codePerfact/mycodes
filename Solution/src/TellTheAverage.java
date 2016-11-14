import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TellTheAverage {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        long result,b;
        result=myScan.nextInt();
        while(myScan.hasNextInt()){
            b=myScan.nextInt();
            result = (result+b+(result*b))%1000000007;
        }
        System.out.println(result%1000000007);
    }
}