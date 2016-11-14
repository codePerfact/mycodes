import java.util.*;
import java.math.*;

public class Queue {
    private static int[] arr;
    private static int[] visited;
    private static int n;
    private static ArrayList<Integer> count;

    int[] arrq;
    int first;
    int last;
    int nq;

    public Queue(int N){
        arrq = new int[N];
        first=-1;
        last=-1;
        nq =N;
    }

    public void put(int a){
        if(first == -1 && last == -1){
            arrq[++last]=a;
            first++;
        }else if(last == nq -1){
            System.out.println("Queue is full");
        }else{
            arrq[++last]=a;
        }
    }

    public int pop(){
        if(first==-1 || first>last){
            System.out.println("queue is empty");
            return -1;
        }else{
            return arrq[first++];
        }
    }

    public boolean isEmpty(){
        return (first==-1)||(first>last);
    }

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        n = myScan.nextInt();
        arr = new int[n +1];
        visited = new int[n +1];
        count = new ArrayList<Integer>();
        int a,b;
        String c;
        for(int i=1; i< n; i++){
            a=myScan.nextInt();
            b=myScan.nextInt();
            c=myScan.next();
            if(c.equals("b")){
                arr[a]=b;
                arr[b]=a;
            }
        }
        int trees=0;
        for(int i=1; i<= n; i++){
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
        Queue q = new Queue(5*n);
        q.put(node);
        while(!q.isEmpty()){
            int temp = q.pop();
            visited[temp]=1;
            count++;
            q.put(arr[temp]);
        }
        return count;
    }
}