import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CoverGrid{
        public static void main(String[] args){

                Scanner myScan = new Scanner(System.in); //Scanner to take the input from Standard input.
                int N = myScan.nextInt(); //Number of Rows of grid.
                int M = myScan.nextInt(); //Number of columns of grid.
                char[][] grid = new char[N][M]; //grid contains the input.

                //loop to take grid value as a input.
                for(int i=0; i<N; i++){
                    grid[i] = myScan.next().toCharArray();

                }


                //Printing result
                System.out.println(checkReqBlueStrip(grid, N, M) + checkReqRedStrip(grid, N, M));
                myScan.close();
        }

        //Method for counting number Blue Strip Req.
        public static int checkReqBlueStrip(char arr[][], int n, int m){
            int count=0;
            int flag=0;
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){
                    if ((arr[j][i] == 'B' || arr[j][i] == 'G') && flag==0 ){
                        if(arr[j][i]=='G'){
                            arr[j][i]='R';
                        }else{
                            arr[j][i]='.';
                        }
                        count++;
                        flag=1;
                    }else if(arr[j][i]=='.' || arr[j][i]=='R'){
                        flag=0;
                    }
                }
            }
            return count;
        }

        //Method for counting number Red Strip Req.
    public static int checkReqRedStrip(char arr[][], int n, int m){
        int count=0;
        int flag=0;
        for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    if(arr[i][j] == 'R' && flag==0){
                        count++;
                        flag=1;
                    }else if(arr[i][j]=='.'){
                        flag=0;
                    }
                }
            }
        return count;

    }
}