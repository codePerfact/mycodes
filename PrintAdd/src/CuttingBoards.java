/**
 * Created by shilpagu on 1/3/2015.
 */

import java.util.*;
public class CuttingBoards {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while (T-- != 0) {
            int M = myScan.nextInt();
            int N = myScan.nextInt();
            ArrayList<Integer> y = new ArrayList<Integer>();
            ArrayList<Integer> x = new ArrayList<Integer>();
            for(int i=0; i<M-1; i++){
                y.add(myScan.nextInt());
            }
            for(int i=0; i<N-1; i++){
                x.add(myScan.nextInt());
            }
            Collections.sort(y);
            Collections.sort(x);
            long result=0;
            int ymul = 1;
            int xmul = 1;
            int i=N-2;
            int j=M-2;
            while(true){
                if(i<0 && j<0){
                    System.out.println(result);
                    break;
                }else if(i<0 || j<0){
                    if(i>=0){
                        while(i>=0) {
                            result = result + (x.get(i) * xmul);
                            i--;
                        }
                    }else{
                        while(j>=0) {
                            result = result + (y.get(j) * ymul);
                            j--;
                        }
                    }
                }else{
                    if(x.get(i)>=y.get(j)){
                        result = result + x.get(i)*xmul;
                        ymul++;
                        i--;
                    }else{
                        result = result + y.get(j)*ymul;
                        xmul++;
                        j--;
                    }
                }
            }
        }
    }
}
