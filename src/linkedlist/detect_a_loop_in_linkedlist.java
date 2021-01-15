package linkedlist;
import java.util.*;

public class detect_a_loop_in_linkedlist {
    static Node head;
    public static void main(String[] args) {
        int n=3;
        head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(4);
        int x=2;
        
        ABC abc = new ABC();
        if( abc.detectLoop(head) )
        System.out.println("true");
        else
        System.out.println("False");
    
    }    
}

class ABC
{
    public static boolean detectLoop(Node head)
    {
        Node prev=head;
        Node nextnode=head;
        if(head==null)
            return false;
        while(nextnode!=null && nextnode.next!=null)
        {
            nextnode= nextnode.next.next;
            prev = prev.next;
            if(prev == nextnode)
                return true;
        }
        return false;
        
    }
    
}