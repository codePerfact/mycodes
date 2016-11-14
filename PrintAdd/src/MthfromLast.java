/**
 * Created by shilpagu on 12/28/2014.
 */


import java.util.*;
public class MthfromLast {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        int N = myScan.nextInt();
        LinkList list = new LinkList();
        while(myScan.hasNext()){
            list.add(myScan.nextInt());
        }
        Node i = list.head;
        int m = N;
        while(m--!=0){
            if(i.next != null){
                i=i.next;
            }else{
                break;
            }
        }
        if(m>0){
            System.out.println("NIL");
            return;
        }

        Node j = list.head;
        while(i.next!=null){
            i=i.next;
            j=j.next;
        }

        System.out.println(j.value);
    }
}

 class Node {
    public int value;
    public Node next;

    public Node(){
        value = 0;
        next = null;
    }
    public Node(int a){
        value = a;
        next = null;
    }
}

 class LinkList {
    public Node head;
    public LinkList(){
        head = null;
    }
    public void add(int a){
        Node n = new Node(a);
        if(head == null){
            head = n;
        }else{
            while(head.next !=null){
                head = head.next;
            }
            head.next=n;
        }
    }
}

