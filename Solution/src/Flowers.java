import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Flowers {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        int K = myScan.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=myScan.nextInt();
        }
        int[] count = new int[K];
        long result = 0;
        sort(arr);
        for(int j=N-1,l=K-1; j>=0; j--){
            result += arr[j]*(1+count[l]);
            count[l] +=1;
            if(l==0){
                l=K-1;
            }else{
                l--;
            }
        }
        System.out.println(result);
    }

    private static void sort(int[] list){
        int key;
        for (int i = 1; i < list.length; i++) {
            key=list[i];
            for (int j = i-1; j >=0; j--) {
                if (list[j]>key) {
                    list[j+1]=list[j];
                    list[j]=key;
                }else{
                    break;
                }
            }
        }
    }
}