import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Archery {

    public static void main(String[] args) {
     Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        int[] R = new int[N];
        for(int i=0; i<N; i++){
            R[i]=myScan.nextInt();
        }
        int M = myScan.nextInt();
        double[][] distance = new double[M][2];
        for(int j=0; j<M; j++){
            int x1 = myScan.nextInt();
            int y1 = myScan.nextInt();
            distance[j][0]=Math.sqrt((x1*x1)+(y1*y1));
            int x2 = myScan.nextInt();
            int y2 = myScan.nextInt();
            distance[j][1]=Math.sqrt((x2*x2)+(y2*y2));
            if(x1>=0&&y1>=0){
                if(x2<0 || y2<0){
                    if(distance[j][0]>distance[j][1]){
                        distance[j][1]=0;
                    }else{
                        distance[j][0]=0;
                    }
                }
            }else if(x1<=0 && y1>=0){
                if(x2>0 || y2<0) {
                    if (distance[j][0] > distance[j][1]) {
                        distance[j][1] = 0;
                    } else {
                        distance[j][0] = 0;
                    }
                }
            }else if(x1<=0 && y1<=0) {
                    if (x2 > 0 || y2 > 0) {
                        if (distance[j][0] > distance[j][1]) {
                            distance[j][1] = 0;
                        } else {
                            distance[j][0] = 0;
                        }
                    }
                    } else if (x1 >= 0 && y1 <= 0) {
                        if (x2 < 0 || y2 > 0) {
                            if (distance[j][0] > distance[j][1]) {
                                distance[j][1] = 0;
                            } else {
                                distance[j][0] = 0;
                            }
                        }
                    }
                }


        int count=0;
        for(int k=0; k<M; k++){
         for(int l=0; l<N; l++){
             if(R[l]>=distance[k][0] && R[l]<=distance[k][1]){
                 count++;
                    }
                }
            }
        System.out.println(count);
    }
}