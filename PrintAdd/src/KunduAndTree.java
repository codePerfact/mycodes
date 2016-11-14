import sun.reflect.generics.tree.Tree;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class KunduAndTree {
    private static int arr[];
    private static int[] visited;
    private static int n;
    private static ArrayList<Integer> count;

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        n = myScan.nextInt();
        arr = new int[n+1];
        visited = new int[n+1];
        count = new ArrayList<Integer>();
        int a,b;
        String c;
        for(int i=1; i<n; i++){
            a=myScan.nextInt();
            b=myScan.nextInt();
            c=myScan.next();
            if(c.equals("b")){
                arr[a]=b;
                arr[b]=a;
            }
        }
        int trees=0;
        for(int i=1; i<=n; i++){
            if(visited[i]==0){
                count.add(bfs(i));
                trees++;
            }
        }
        BigInteger Sum = BigInteger.ZERO;
        for (int j=0; j<trees; j++){
            for(int k=j+1; k<trees; k++){
                for(int l=k+1; l<trees; l++){
                    Sum = Sum.add(BigInteger.valueOf(count.get(j)*count.get(k)*count.get(l)).mod(BigInteger.valueOf(1000000007)));
                }
            }
        }
        System.out.print(Sum.mod(BigInteger.valueOf(1000000007)));
    }

    public static int bfs(int node){
        int count=0;
        int[] arr = new int[n];
        int first =-1;
        int last=-1;
        if(first == -1 && last == -1){
            arr[++last]=node;
            first++;
        }else if(last == n-1){
            System.out.println("Queue is full");
        }else{
            arr[++last]=node;
        }
        int temp;
        while(!((first==-1)||(first>last))){
             if(first==-1 || first>last){
                 temp = -1;
            }else{
                 temp = arr[first++];
            }
            visited[temp]=1;
            count++;
            if(arr[temp]>0 && visited[arr[temp]]==0) {
                if(first == -1 && last == -1){
                    arr[++last]=arr[temp];
                    first++;
                }else if(last == n-1){
                    System.out.println("Queue is full");
                }else{
                    arr[++last]=arr[temp];
                }
            }
        }
        return count;
    }
}