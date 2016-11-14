/**
 * Created by shilpagu on 12/19/2014.
 */
import java.util.*;
public class CavityMap {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int n = myScan.nextInt();
        char[][] arr = new char[n][n];
        for(int i=0; i<n; i++){
            arr[i]=myScan.next().toCharArray();
        }


        if(n==2){
            printArray(arr,n);
            return;
        }

        for(int i=1; i<n-1; i++){
            for(int j=1; j<n-1; j++){
                if(isSafe(i,j,arr)){
                    int key = arr[i][j]-'0';
                    if(arr[i-1][j]-'0'<key && arr[i+1][j]-'0'<key && arr[i][j-1]-'0'<key && arr[i][j+1]-'0'<key){
                        arr[i][j]= 'X';
                    }
                }
            }
        }
        printArray(arr,n);
    }

    public static void printArray(char[][] a,int size){
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int i, int j,char[][] a){
        if(a[i][j]=='X'){
            return false;
        }else if(a[i-1][j]=='X'){
            return false;
        }else if(a[i+1][j]=='X'){
            return false;
        }else if(a[i][j-1]=='X'){
            return false;
        }else if(a[i][j+1]=='X'){
            return false;
        }
        return true;
    }
}
