package linkedlist;


class Node {
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
public class reverse_linkedList_recursion {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printl(head);
        head = revR(head,null);
        printl(head);
    }
    static Node revR(Node curr,Node prev)
    {
        if(curr==null)
            return prev;
        Node next = curr.next;
        curr.next=prev;
        return revR(next,curr);        
    }
    
    static void printl(Node head)
    {
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
    
}
