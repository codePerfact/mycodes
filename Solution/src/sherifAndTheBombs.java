import java.util.Scanner;

/**
 * Created by shilpagu on 12/13/2014.
 */
public class sherifAndTheBombs {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        int[][] points = new int[N][3];
        int Index=0;
        for(int i=0; i<N; i++){
            points[i][0]=myScan.nextInt();
            points[i][1]=myScan.nextInt();
            points[i][2]=myScan.nextInt();
            if(points[i][2]<points[Index][2]){
                Index=i;
            }
        }
        int count = 0;
        for(int x=points[Index][0]-points[Index][2]; x<=points[Index][0]+points[Index][2];x++){
            for(int y=points[Index][1]-points[Index][2]; y<=points[Index][1]+points[Index][2];y++){
                boolean flag = true;
                for(int k=0; k<N; k++) {
                    if ((((x - points[k][0]) * (x - points[k][0])) + ((y - points[k][1]) * (y - points[k][1]))) > (points[k][2] * points[k][2])) {
                        flag = false;
                        break;
                    }
                }
                    if(flag) {
                        count++;
                    }
            }
        }
            System.out.println(count);
    }
}
