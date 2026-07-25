package queues;

import java.util.*;
public class queueusingdeque {
     static class Queues{
        Deque<Integer> d=new LinkedList<>();
        public void add(int data){
            d.addLast(data);
        }
        public int remove(){
            return d.removeFirst();
        }
        public int peek(){
          return  d.getFirst();
          //the element from the front is peeked
        } 
     }
    public static void main(String args[]){
        Queue q=new LinkedList();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        System.out.println(q.remove());
    }
}
