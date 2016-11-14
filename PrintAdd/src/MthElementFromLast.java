/**
 * Created by shilpagu on 12/28/2014.
 */
import java.util.*;
public class MthElementFromLast {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        String input = myScan.nextLine();
        if (input.length() > 0) {
            String[] str = input.split(" ");
            int[] arr = new int[str.length];
            int i;
            for (i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            if (N > i) {
                System.out.println("NIL");
                return;
            }
            System.out.println(arr[i - N]);
        }
    }
}
