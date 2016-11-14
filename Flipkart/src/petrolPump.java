import java.util.Scanner;

/**
 * Created by shilpagu on 12/6/2014.
 */
public class petrolPump {
    public static void main(String args[]){
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        int[] pump = new int[N];
        int[] req = new int[N];
        for(int i=0; i<N; i++){
            pump[i]=myScan.nextInt();
            req[i]=myScan.nextInt();
        }

        int start=0;
        int end = 1;
        int available = pump[start];
        int requird = req[start];
        while(end != start){
            if(available>=requird){
                available+=pump[end];
                requird+=req[end];
                end=(end+1)%N;
            }else {
                if (start == 0) {
                    start = N - 1;
                } else {
                    start--;
                }

                available += pump[start];
                requird += req[start];
            }
        }

        System.out.println(start);

    }
}
