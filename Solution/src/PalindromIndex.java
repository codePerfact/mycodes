import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PalindromIndex {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            int result=-1;
            String S = myScan.next();
            for(int i=0,j=S.length()-1; j>=i; i++,j--){
                if(S.charAt(i) != S.charAt(j)){
                    if(S.charAt(i+1) == S.charAt(j) && S.charAt(i) == S.charAt(j-1)){
                        if(S.charAt(i+2) == S.charAt(j-1)){
                            result = i;
                            break;
                        }else{
                            result = j;
                            break;
                        }
                    }
                   else if(S.charAt(i+1) == S.charAt(j)){
                       result=i;
                       break;
                   }else if(S.charAt(i) == S.charAt(j-1)){
                       result=j;
                       break;
                   }
                }
            }
            System.out.println(result);
        }

    }
}
