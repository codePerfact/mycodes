import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by shilpagu on 12/5/2014.
 */
public class GenLexOrder {
    private static char[] str;
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        str = myScan.next().toCharArray();
        int length = str.length;
        Arrays.sort(str);
        boolean notfinished = true;
        while (notfinished) {
            int i;
            for (i = length - 2; i >= 0; i--) {
                if (str[i] < str[i + 1]) {
                    break;
                }
            }
            if (i == -1) {
                notfinished = false;
            } else {
                int ceilIndex = findCeil(str[i], i + 1, length - 1);
                char temp = str[i];
                str[i] = str[ceilIndex];
                str[ceilIndex] = temp;
                reverse(i + 1, length - 1);
            }
            printArray();
        }
    }

    public static void printArray(){
        for(int i=0; i<str.length;i++){
            System.out.print(str[i]);
        }
        System.out.println();
    }

    public static void reverse(int start, int end){
        while (start<end){
            char temp=str[start];
            str[start]=str[end];
            str[end]=temp;
            start++;
            end--;
        }
    }

    public static int findCeil(char c, int start, int end){
        int max=start;
        for(int i=start; i<=end; i++){
            if(str[i]>c){
                if(str[i]<str[max]){
                    max=i;
                }
            }
        }
        return max;
    }
}
