import java.util.Scanner;

/**
 * Created by shilpagu on 11/30/2014.
 */
public class noofOne {
    public static void main(String[]args){
        Scanner myScan = new Scanner(System.in);
        int n= myScan.nextInt();
        int i=1;
        int m=1;
        while(i<=n){
            if(m%n==0){
                for(int j=0; j<i; j++){
                    System.out.print("1");
                }
                return;
            }
            m= ((10*m)+1)%n;
            i++;
        }
    }
}
