/**
 * Created by shilpagu on 12/4/2014.
 */
public class Queue {
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
}
