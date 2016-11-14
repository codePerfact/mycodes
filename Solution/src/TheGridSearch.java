import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheGridSearch {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        String result="NO";
        while(T--!=0) {
            ArrayList<String> listOfString1 = new ArrayList<String>();
            ArrayList<String> listOfString2 = new ArrayList<String>();
            int Row1 = myScan.nextInt();
            int column1 = myScan.nextInt();
            for (int i = 0; i < Row1; i++) {
                listOfString1.add(myScan.next());
            }
            int Row2 = myScan.nextInt();
            int column2 = myScan.nextInt();
            for(int j=0; j<Row2; j++){
                listOfString2.add(myScan.next());
            }
            int start;
            int end;
            for (int k = 0; k < Row1; k++) {
                result="NO";
                if(listOfString1.get(k).contains(listOfString2.get(0))){
                    start = listOfString1.get(k).indexOf(listOfString2.get(0));
                    end = start + listOfString2.get(0).length()-1;
                    for(int l=k+1,m=1; m<Row2; l++,m++){
                        if(listOfString1.get(l).contains(listOfString2.get(m))) {
                            if (listOfString1.get(l).indexOf(listOfString2.get(m)) == start) {

                            }else{
                                result="NO";
                                break;
                            }
                        }else{
                            result="NO";
                            break;
                        }
                        result="YES";
                    }

                }
                if(result.equals("YES")){
                    break;
                }
            }

            System.out.println(result);

        }
    }
}