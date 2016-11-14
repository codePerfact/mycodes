/**
 * Created by shilpagu on 11/30/2014.
 */
public class RowWidMaxOne {
    max_row(int[][] arr, int n){
        for(int i=n-1; i>=0;i--){
            int result = findOne(arr, i, n);
            if(result >=0){
                System.out.println(result);
                return;
            }
        }
    }
    public static int findOne(int[][] arr, int c, int n){
        for(int j=0; j<n; j++){
            if(arr[j][c]==1){
                return j;
            }
        }
        return -1;
    }


}

