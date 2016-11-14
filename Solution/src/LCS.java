import javax.swing.text.html.StyleSheet;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by shilpagu on 12/12/2014.
 */

public class LCS {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int n = myScan.nextInt();
        int m = myScan.nextInt();
        int[] a = new int[n + 1];
        int[] b = new int[m + 1];
        for (int i = 1; i < n + 1; i++) {
            a[i] = myScan.nextInt();
        }
        for (int j = 1; j < m + 1; j++) {
            b[j] = myScan.nextInt();
        }
        int[][] memo = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            Arrays.fill(memo[i], 0);
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (a[i] == b[j]) {
                    memo[i][j] = memo[i - 1][j - 1] + 1;
                } else {
                    memo[i][j] = max(memo[i - 1][j], memo[i][j - 1]);
                }
            }
        }


        Stack<Integer> stack = new Stack<Integer>();
        for (int i = n, j = m; i > 0 && j > 0; ) {
            if (a[i] == b[j]) {
                stack.push(a[i]);
                i--;
                j--;
            } else if(memo[i][j]==memo[i-1][j]){
                    i--;
            }else{
                j--;
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }

    public static int max(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}
