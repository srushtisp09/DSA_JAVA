package queues;
import java.util.*;
public class stackusingdeque {
     static class Stack{
         Deque<Integer> deque=new LinkedList<>();
         public boolean isEmpty(){  // ← add this
        return deque.isEmpty();
    }
     public  void push(int data){
         deque.addLast(data);
     }
     public  int pop(){
         return deque.removeLast();
     }
     public  int peek(){
        return deque.getLast();
     }

      }
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
         while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
         }
   



    }
}
//  we use addLast to push
// we use removeLast to delete element
// we use getLast to peek the element this will return elements in the form of stack