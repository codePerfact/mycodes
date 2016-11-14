/**
 * Created by shilpagu on 12/18/2014.
 */
import java.util.*;
public class Heap {
    public static int[] arr;
    public static int maxsize;
    public static int currSize;
    public Heap(int n){
        this.maxsize = n;
        this.arr = new int[n];
        this.currSize=-1;
    }

    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        Heap H = new Heap(N);
        for(int i=0; i<N;i++){
            H.insert(myScan.nextInt());
        }
        for(int i=0; i<N; i++){
            System.out.print(H.delete(0)+" ");
        }
    }

    public static void insert(int a){
        arr[++currSize]=a;
        heapify(currSize);
    }

    public static void heapify(int index){
        if(index>0) {
            int parent = getParent(index);
            while (parent >= 0 && arr[parent] < arr[index]) {
                swap(parent, index);
                index = parent;
                parent = getParent(index);
            }
        }
        if(getLeft(index)>currSize){
            return;
        }
        if(getRight(index)>currSize){
            if(arr[index]<arr[getLeft(index)]){
                swap(index,getLeft(index));
            }
            return;
        }
        if(arr[index]>arr[getLeft(index)] && arr[index]>arr[getRight(index)]){
            return;
        } else{
            if (arr[index]<arr[getLeft(index)] || arr[index]<arr[getRight(index)]){
                int tempIndex = max(getLeft(index),getRight(index));
                swap(tempIndex,index);
                index = tempIndex;
                heapify(index);
            }
        }
        return;
    }

    public static int delete(int i){
        int index = i;
        int t = arr[index];
        arr[index]=arr[currSize--];
        heapify(index);
        return t;
    }

    public static int getParent(int i){
        return (int)((i-1)/2);
    }
    public static void swap(int i, int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int getLeft(int i){
        return 2*i+1;
    }
    public static int getRight(int j){
        return (2*j)+2;
    }
    public static int max(int i, int j){
        if(arr[i]>arr[j]){
            return i;
        }else{
            return j;
        }
    }
}
