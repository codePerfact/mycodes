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
    public void update(int update, int updatePos, int[] elements) {
        int updatediff = update - elements[updatePos]  ;
        elements[updatePos] = update;
        updateTreeUtil(STARTINDEX, ENDINDEX, updatePos, updatediff, ROOT);
    }

    private void updateTreeUtil(int startIndex, int endIndex, int updatePos, int update, int current) {
        if ( updatePos < startIndex || updatePos > endIndex) {
            return;
        }
        tree[current] = tree[current] + update;
        if (startIndex != endIndex) {
            int mid = mid(startIndex, endIndex);
            updateTreeUtil(startIndex, mid, updatePos, update, leftchild(current));
            updateTreeUtil(mid+1, endIndex, updatePos, update, rightchild(current));
        }
    }


    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int T = myScan.nextInt();
        while(T--!=0){
            int N = myScan.nextInt();
            long[] a = new long[N];
            long[] w = new long[N];
            for(int i=0; i<N; i++){
                a[i]=myScan.nextLong();
            }
            for(int i=0; i<N; i++){
                w[i]=myScan.nextLong();
            }
            int[] tree = new int[N];
            SegmentTree t = new SegmentTree(N);
            t.constructSegmentTree(tree);
            t.update((int)w[0],0,tree);
            for(int i=1; i<N; i++){
                  int temp =  t.getMax(0,i-1);
                t.update((int)(temp+w[i]),i,tree);
            }

            System.out.println(t.getMax(0,N-1));
        }
    }



}
