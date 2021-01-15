
//reverse  a linkedlist using iterative method.

class Node{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}

public class reverse__LinkList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        printlist(head);
        head=reverse(head);
        printlist(head);
        
    }
    static Node reverse(Node head)
    {
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev=curr;
            curr = next;
        }
        return prev;
    }
    
    
    
    
     static void printlist(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr=curr.next;
        }
        System.out.println();
    }
    
}
