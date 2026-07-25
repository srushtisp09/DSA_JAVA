package queues;
import java.util.*;

public class dequeue {
    public static void main(String args[]){
        Deque<Integer> deque=new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        
        System.out.println(deque );
    }
}
//addFirst → always adds to left
// addLast → always adds to right
// removeFirst → removes from left
// removeLast → removes from right