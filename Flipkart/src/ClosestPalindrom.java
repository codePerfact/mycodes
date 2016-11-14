import java.util.*;

public class ClosestPalindrom {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = myScan.nextInt();
        }

        if(checkForAllNine(arr,N)){
            System.out.print("1");
            for(int j=1; j<N;  j++)
                System.out.print("0");

            System.out.print("1");
        }else{
            generateNextPalindrome(arr,N);
            printArray(arr,N);
        }
    }

    public static void generateNextPalindrome(int[] arr, int n){
        int mid = n/2;
        boolean leftSmaller = false;
        int i=mid-1;
        int j = ((n%2)==0) ? mid:mid+1;
        while(i>=0 && arr[i]==arr[j]){
            i--;
            j++;
        }
        if(i<0 || arr[i]<arr[j]){
            leftSmaller = true;
        }
        while(i>=0){
            arr[j]=arr[i];
            j++;
            i--;
        }
        if(leftSmaller){
            int carry = 1;
            i=mid-1;
            if(n%2==1){
                arr[mid]+=carry;
                carry = arr[mid]/10;
                arr[mid] = arr[mid]%10;
                j=mid+1;
            }else{
                j=mid;
            }
            while (i>=0){
                arr[i]+=carry;
                carry= arr[i]/10;
                arr[i]=arr[i]%10;
                arr[j++]=arr[i--];
            }
        }
    }



    public static boolean checkForAllNine(int[] a,int n){
        for(int j : a){
            if(j!=9){
                return false;
            }
        }
        return true;
    }

    public static void printArray(int[] a, int n){
        for (int i : a){
            System.out.print(i);
        }
        System.out.println();
    }

}
