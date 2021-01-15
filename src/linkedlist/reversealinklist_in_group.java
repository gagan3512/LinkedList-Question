package linkedlist;
/*import java.util.Scanner;

class abc
{
    int data;
    Node next;
    abc(int key)
    {
        data=key;
        next=null;
    }
}



public class reversealinklist_in_group 
{
    static Node head;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        
        while(t-- >0)
        {
            int n = s.nextInt();
            int a1 = s.nextInt();
            Node head = new Node(a1);
            Node tail = head;
            for(int i=1;i<n;i++)
            {
                int a=s.nextInt();
                tail.next = new Node(a);
                tail=tail.next;
            }
            int k = s.nextInt();
            GFG gfg = new GFG();
            Node res=gfg.reverse(head,k);
            printList(res);
            System.out.println();
        }
    }
     static void printList(Node node)
    {
        while(node!=null)
        {
            System.out.print(node.data + " ");
            node= node.next;
        }
    }   
}



class GFG
{
    public static Node reverse(Node node,int k)
    {
        Node curr=node;
        Node prev=null;
        Node next= null;
        int c=0;
        while(curr!=null && c<k)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            c++;
        }
        if(next!=null)
        {
            node.next = reverse(next,k);
        }
        return prev;
    }
}*/