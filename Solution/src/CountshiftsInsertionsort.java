import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountshiftsInsertionsort {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for(int i=0;i<t;i++){
            int n = in.nextInt();
            int[] ar = new int[n];
            int[] temp = new int[n];
            for(int j=0;j<n;j++){
                ar[j]=in.nextInt();
                //System.err.println(ar[j]);
            }
            System.out.println(MS(ar,temp,0,n-1));
        }
    }


    public static long MS(int[] ar,int[] temp,int left,int right)
    {
        long count = 0;
        int mid;
        while(right>left){
            mid = (left+right)/2;
            count = MS(ar,temp,left,mid);
            count += MS(ar,temp,mid+1,right);
            count += merge(ar,temp,left,mid+1,right);
        }
        return count;
    }

    public static long merge(int[] ar, int[] temp, int left, int mid, int right){
        int i,j,k;
        long count=0;
        i=left;
        j=mid;
        k=left;
        while(i<=mid-1 && j<=right){
            if(ar[i]<ar[j]){
                temp[k++]=ar[i++];
            }else{
                temp[k++]=ar[j++];
                count+=(mid-i);
            }
        }
        while(i<=mid-1){
            temp[k++]=ar[i++];
        }
        while(j<=right){
            temp[k++]=ar[i++];
        }
        for(int l=left; l<=right; l++){
            ar[l]=temp[l];
        }
        return count;
    }




}
