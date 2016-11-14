import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MissingNumbers {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        int temp;
        int value;
        HashMap<Integer,Integer> mapA = new HashMap<Integer, Integer>();
        for(int i=0; i<N; i++){
            temp=myScan.nextInt();
            if(mapA.containsKey(temp)){
                value = mapA.get(temp);
                mapA.put(temp,value+1);
            }else{
                mapA.put(temp,1);
            }
        }
        int M = myScan.nextInt();
        HashMap<Integer,Integer> mapB = new HashMap<Integer, Integer>();
        for (int j = 0; j < M; j++) {
            temp=myScan.nextInt();
            if(mapB.containsKey(temp)){
                value = mapB.get(temp);
                mapB.put(temp,value+1);
            }else{
                mapB.put(temp,1);
            }
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int iterator : mapB.keySet()) {
            if(mapA.containsKey(iterator)){
                if(mapA.get(iterator)<mapB.get(iterator)){
                    list.add(iterator);
                }
            }else{
                list.add(iterator);
            }
        }

        Collections.sort(list);
        for (int result : list) {
            System.out.print(result+" ");
        }

    }
}