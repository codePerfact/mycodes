import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ClosestNumber {

    private static ArrayList<Integer> list = new ArrayList<Integer>();
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();

        int[] arr = new int[N];
        for (int i=0; i<N; i++){
            arr[i]=myScan.nextInt();
        }
        int min=Math.abs(arr[0]-arr[1]);
        for(int j=0; j<N; j++){
            for(int k=j+1; k<N; k++){
                if(Math.abs(arr[j]-arr[k])<min){
                    min=Math.abs(arr[j]-arr[k]);
                    list.clear();
                    add(arr[j],arr[k]);
                }else if (Math.abs(arr[j]-arr[k])==min){
                    add(arr[j],arr[k]);
                }
            }
        }

        for(int value : list){
            System.out.print(value+" ");
        }

    }

    private static void add(int a, int b){
        if(a>b){
            list.add(b);
            list.add(a);
        }else{
            list.add(a);
            list.add(b);
        }
    }
}