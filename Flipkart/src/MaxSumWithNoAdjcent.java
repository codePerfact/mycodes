import java.util.*;
public class MaxSumWithNoAdjcent {

    public static void main(String[] args){

        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        int[] a = new int[N];
        for(int i=0; i<N; i++){
            a[i]=myScan.nextInt();
        }
        System.out.println(max_Sum(a, N));
    }

    public static int max_Sum(int[] a,int n){
        int incL = a[0];
        int excL = 0;
        int excL_new =0;
        for (int i = 1; i < n ; i++) {
            excL_new = (incL>excL) ? incL : excL;
            incL = excL + a[i];
            excL=excL_new;
        }
        return (incL>excL) ? incL : excL;
    }
}
