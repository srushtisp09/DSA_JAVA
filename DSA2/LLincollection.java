import java.util.LinkedList;
//  ----> optimised
public class LLincollection {
    public static void main(String args[] ){
        LinkedList<Integer> ll=new LinkedList<>();
        //create a linked list  use  Classes and not primitive data types 
      
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
System.out.println(ll);
ll.removeLast();
ll.removeFirst();
System.out.println(ll);
    }
}
