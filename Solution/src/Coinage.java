import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Coinage {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            int count=0;
            int N = myScan.nextInt();
            int a= myScan.nextInt();
            int b = myScan.nextInt();
            int c = myScan.nextInt();
            int d = myScan.nextInt();
            for(int i=0; i<=b && (i*2<=N);i++){
                for(int j=0; j<=c&&(j*5<=N); j++){
                    for(int k=0; k<=d && (k*10<=N); k++){
                        if((i*2)+(j*5)+(k*10) <= N){
                            if(N-((i*2)+(j*5)+(k*10)) <=a){
                                count++;
                            }
                        }
                    }
                }
            }
            System.out.println(count);
        }

    }
}