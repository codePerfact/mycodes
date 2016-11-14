import java.util.Scanner;

/**
 * Created by shilpagu on 12/12/2014.
 */
public class equal {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            int N = myScan.nextInt();
            int[] a = new int[N];
            int min=1000;
            for(int i=0; i<N; i++){
                a[i]=myScan.nextInt();
                if(a[i]<min){
                    min=a[i];
                }
            }
            long operations = TotalOperation(a,min);
            for(int i=1; i<=4; i++){
                long tempOperations = TotalOperation(a,min-i);
                if(tempOperations<operations){
                    operations=tempOperations;
                }
            }
            System.out.println(operations);
        }

    }

    public static long TotalOperation(int[] a, int min){
        long result=0;
        for(int i=0; i<a.length; i++){
            int x = a[i]-min;
            result += ((x/5) + ((x%5)/2) + ((x%5)%2));
        }
        return result;
    }
}
