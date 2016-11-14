import java.util.*;

/**
 * Created by shilpagu on 12/5/2014.
 */
public class LexRankOfString {
            private static char[] arr;
public static void main(String[] args){

            Scanner myScan = new Scanner(System.in);
            arr = myScan.next().toCharArray();
            int rank=1;
            rank += possibleSmallerStrings(0,arr.length-1);
            System.out.println(rank);
}

    public static int possibleSmallerStrings(int start, int end) {
        if (start == end) {
            return 0;
        } else {
            int count = 0;
            char key = arr[start];
            for (int i = start + 1; i <= end; i++) {
                if (arr[i] < key) {
                    count++;
                }
            }
            if(count==0){
                return possibleSmallerStrings(start+1,end);
            }else {
                return (count * factorial(end - start)) + possibleSmallerStrings(start + 1, end);
            }
        }
    }

    public static int factorial(int n){
        //System.out.println("factorial of "+n+"is called");
        if(n<=1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
