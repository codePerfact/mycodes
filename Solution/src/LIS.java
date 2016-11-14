
import java.util.*;
public class LIS {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        int[] D = new int[N];
        for(int i=0; i<N; i++){
            D[i]=myScan.nextInt();
        }
        int[] L = new int[N];
        L[0] = 1;
        int max=0;
        for(int k=1; k<N; k++){
            for(int j=k-1; j>=0; j--){
                if(D[j]<D[k] && L[k]<(L[j]+1)){
                    L[k]=L[j];
                }
            }
            L[k]+=1;
            if(L[k]>max){
                max=L[k];
            }
        }

        System.out.println(max);

    }
}
