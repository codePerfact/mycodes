/**
 * Created by shilpagu on 11/30/2014.
 */
public class ReverseALinkList {
    public reverseLinkList(Node head){
        if(head == null || head.next == null){
            return;
        }
            Node Second = head.next;
            Node Third = Second.next;
            Second.next=head;
            head.next=null;
            if(Third == null){
                return;
            }
            Node CurrentNode = Third;
            Node previousNode = Second;
            while(CurrentNode != null){
                Node NextNode = Third.next;
                CurrentNode.next = previousNode;
                previousNode = CurrentNode;
                CurrentNode = NextNode;
            }
        head = previousNode;
    }
}

public class Node{
    int value;
    Node next;
}
