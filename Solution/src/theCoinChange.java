/**
 * Created by shilpagu on 12/12/2014.
 */
import java.util.*;
public class theCoinChange {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        ArrayList<Integer> coins = new ArrayList<Integer>();
        String input = myScan.nextLine();
        String[] str = input.split(",");
        for(int i=0; i<str.length; i++){
            coins.add(Integer.parseInt(str[i].replaceAll("[\\D]","")));
        }
        int N = myScan.nextInt();
        int[][] memo = new int[N+1][coins.size()];
        for(int j=0; j<N+1;j++){
            Arrays.fill(memo[j],0);
        }
        Arrays.fill(memo[0],1);
        for(int i=1; i<N+1; i++){
            for(int j=0; j<coins.size(); j++){
                if((i-coins.get(j))>=0){
                    memo[i][j] += memo[i-coins.get(j)][j];
                }
                if(j-1>=0){
                    memo[i][j] += memo[i][j-1];
                }
            }
        }
        System.out.println(memo[N][coins.size()-1]);
    }
}
