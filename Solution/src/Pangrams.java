import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangrams {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String S = myScan.nextLine();
        if(S.length()<26){
            System.out.println("not pangram");
            return;
        }
        for(char i='a'; i<='z'; i++){
            if(!((S.contains(i+"")) || S.contains((i + "").toUpperCase()))){
                System.out.println("not pangram");
                return;
            }
        }
            System.out.println("pangram");
            return;

    }
}