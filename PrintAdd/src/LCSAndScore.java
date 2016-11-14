/**
 * Created by shilpagu on 12/21/2014.
 */

import java.util.*;
public class LCSAndScore {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        String s1 = myScan.nextLine();
        String s2 = myScan.nextLine();
        getDNAAlignment(s1,s2);
    }

    public static int getDNAAlignment(String dna1, String dna2){
        char[] dna1char = dna1.toCharArray();
        char[] dna2char = dna2.toCharArray();
        char[] LCS = getLCS(dna1char,dna2char,dna1.length(),dna2.length());
        int[][] matrix ={{5,-1,-2,-1,-3},
                         {-1,5,-3,-2,-4},
                         {-2,-3,5,-2,-2},
                         {-1,-2,-2,5,-1},
                         {-3,-4,-2,-1,0}
                     };
        String main = "ACGT-";
        int result=0;
        int i=0,j=0,k=0;
        while(k<LCS.length){
            if(dna1char[i]==LCS[k] && dna2char[j]==LCS[k]){
                result += matrix[main.indexOf(LCS[k])][main.indexOf(LCS[k])];
                i++;
                j++;
                k++;
            }else if(dna1char[i]==LCS[k]){
                result += matrix[main.indexOf('-')][main.indexOf(dna2char[j])];
                j++;
            }else if(dna2char[j]==LCS[k]){
                result += matrix[main.indexOf(dna1char[i])][main.indexOf('-')];
                i++;
            }else{
                result += matrix[main.indexOf(dna1char[i])][main.indexOf(dna2char[j])];
                i++;
                j++;
            }

        }
        while(i<dna1char.length || j<dna2char.length){
            if(i<dna1char.length && j<dna2char.length){
                result += matrix[main.indexOf(dna1char[i])][main.indexOf(dna2char[j])];
                i++;
                j++;
            }
            else if(i>dna1char.length) {
                result += matrix[main.indexOf('-')][main.indexOf(dna2char[j])];
                j++;
            }else if(j>dna2char.length){
                result += matrix[main.indexOf(dna1char[i])][main.indexOf('-')];
                i++;
            }

        }


        return result;
    }

   public static char[] getLCS( char[] X, char[] Y, int m, int n )
    {
        int[][] L = new int[m+1][n+1];
        for (int i=0; i<=m; i++)
        {
            for (int j=0; j<=n; j++)
            {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (X[i-1] == Y[j-1])
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = max(L[i-1][j], L[i][j-1]);
            }
        }
        int index = L[m][n];
        char[] lcs=new char[index];
        int i = m, j = n;
        while (i > 0 && j > 0)
        {
            if (X[i-1] == Y[j-1])
            {
                lcs[index-1] = X[i-1];
                i--; j--; index--;
            }

            else if (L[i-1][j] > L[i][j-1])
                i--;
            else
                j--;
        }

       return lcs;
    }

    public static int max(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}
