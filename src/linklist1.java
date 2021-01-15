
//Basic operation in linkedlist


import java.util.*;
public class linklist1 
{
    public static void main(String[] args) {
        //create the object of linkedlist
        LinkedList<String> l1 = new LinkedList<String>();
        
        //Adding elements;
        l1.add("A");
        l1.add("B");
        l1.add("C");
        l1.add("D");
        l1.add("E");
        System.out.println(l1);
        l1.remove("B");
        System.out.println(l1);
        l1.remove(3);
        System.out.println(l1);
        l1.removeFirst();
        System.out.println(l1);
        l1.removeLast();
        System.out.println(l1);
        l1.add(0,"hII");
        System.out.println(l1);
        l1.set(0,"hello");
        System.out.println(l1);
        l1.remove("hello");
        System.out.println(l1);
        l1.add("hey");
        l1.add("whatsup");
        l1.add("i am good");
        l1.add("what about u?");
        for(int i=0;i<l1.size();i++)
        {
            System.out.print(l1.get(i) + " ");
        }
        System.out.println("");
        
        // using foreach loop
        for(String str : l1)
            System.out.print(str + " ,");
    }
    
}
