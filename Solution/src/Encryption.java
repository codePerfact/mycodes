import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Encryption {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String input = myScan.next();
        int upperBound = (int)Math.ceil(Math.sqrt(input.length()));
        int lowerBound = (int)Math.floor(Math.sqrt(input.length()));
        int rows = lowerBound;
        int colums = lowerBound;
        if(rows*colums < input.length()){
            colums=upperBound;
            if(rows*colums<input.length()){
                rows=upperBound;
            }
        }
        for(int i=0; i<colums; i++){
            for(int j=i; j<input.length(); j+=colums){
                System.out.print(input.charAt(j));
            }
            System.out.print(" ");
        }
    }
}