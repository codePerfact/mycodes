import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class PairwiseSumAndDivide {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while (T--!=0){
            int N = myScan.nextInt();
           int count1=0;
            int count2=0;
            int[] arr  = new int[N];
            for (int k = 0; k < N; k++) {
                arr[k]=myScan.nextInt();
            }
            for (int i = 0; i < N; i++) {
                for (int j = i+1; j < N; j++) {
                    if(arr[i]==1 && arr[j]==1){
                        count2++;
                    }else if((arr[i]==1 && arr[j]>=2) || (arr[i]==2 && arr[j]==2) || (arr[i]>=2 && arr[j]==1)){
                        count1++;
                    }
                }
            }
            System.out.println(count2*2+count1*1);

        }
    }
}