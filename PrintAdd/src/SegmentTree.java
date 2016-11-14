import java.util.Scanner;

/**
 * Created by shilpagu on 12/16/2014.
 */
public class SegmentTree {
    private int[] tree;
    private int maxsize;
    private int height;

    private final int STARTINDEX = 0;
    private final int ENDINDEX;
    private final int ROOT=0;

    public SegmentTree(int size){
        height = (int)Math.ceil(Math.log(size)/Math.log(2));
        maxsize = 2*(int)Math.pow(2,height)-1;
        tree = new int[maxsize];
        ENDINDEX = size-1;
    }

    public void constructSegmentTree(int[] elements){
        constructSegmentTreeUtil(elements,STARTINDEX,ENDINDEX,ROOT);
    }

    public int constructSegmentTreeUtil(int[] elements, int startIndex, int endIndex, int current){
        if(startIndex == endIndex){
            tree[current] = elements[startIndex];
            return tree[current];
        }
        int mid = mid(startIndex, endIndex);
        tree[current]=max(constructSegmentTreeUtil(elements,startIndex,mid,leftchild(current)),constructSegmentTreeUtil(elements,mid+1,endIndex,rightchild(current)));
        return tree[current];
    }

    public int leftchild(int pos){
        return 2*pos+1;
    }
    public int rightchild(int pos){
        return 2*pos+2;
    }
    public int max(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
    public int mid(int start, int end){
        return start+(end-start)/2;
    }

    public int getMax(int queryStart, int queryEnd){
        if(queryStart<0 || queryEnd>tree.length){
            return -1;
        }else{
            return getMaxUtil(STARTINDEX,ENDINDEX,queryStart,queryEnd,ROOT);
        }
    }

    public int getMaxUtil(int startIndex, int endIndex, int queryStart, int queryEnd, int current){
        if(queryStart<=startIndex && queryEnd>=endIndex){
            return tree[current];
        }
        if (endIndex < queryStart || startIndex > queryEnd) {
            return 0;
        }
        int mid = mid(startIndex,endIndex);
        return max(getMaxUtil(startIndex,mid,queryStart,queryEnd,leftchild(current)),getMaxUtil(mid+1,endIndex,queryStart,queryEnd,rightchild(current)));
    }

    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        int[] a = new int[N];
        for(int i=0; i<N; i++){
            a[i]=myScan.nextInt();
        }

        SegmentTree t = new SegmentTree(N);
        t.constructSegmentTree(a);
        System.out.println(t.getMax(3, 6));
    }

}
