/**
 * Created by shilpagu on 12/4/2014.
 */
public class Queue {
    int[] arr;
    int first;
    int last;
    int n;
    public Queue(int N){
        arr = new int[N];
        first=-1;
        last=-1;
        n=N;
    }

    public void put(int a){
        if(first == -1 && last == -1){
            arr[++last]=a;
            first++;
        }else if(last == n-1){
            System.out.println("Queue is full");
        }else{
            arr[++last]=a;
        }
    }

    public int pop(){
        if(first==-1 || first>last){
            System.out.println("queue is empty");
            return -1;
        }else{
            return arr[first++];
        }
    }

    public boolean isEmpty(){
        return (first==-1)||(first>last);
    }
}
