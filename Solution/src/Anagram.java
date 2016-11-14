import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Anagram {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){

            HashMap<Character,Integer> map = new HashMap<Character, Integer>();
            int result=0;
            String S = myScan.next();
            if((S.length()%2)!=0){
                System.out.println("-1");
            }else{
                for(int i=0; i<(S.length()/2); i++){
                    char ch1 = S.charAt(i);
                    if(map.containsKey(ch1)){
                        int value = map.get(ch1);
                        map.remove(ch1);
                        map.put(ch1,value+1);
                    }else{
                        map.put(S.charAt(i),1);
                    }
                }
                for (int j=(S.length()/2);j<S.length();j++){
                    char ch = S.charAt(j);
                    if(map.containsKey(ch)){
                        int value1 = map.get(ch);
                        if(value1==1){
                            map.remove(ch);
                        }else{
                            map.remove(ch);
                            map.put(ch,value1-1);
                        }
                    }else{
                        result++;
                    }
                }

                System.out.println(result);
            }

        }
    }
}