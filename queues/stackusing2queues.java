package queues;
import java.util.*;
public class stackusing2queues {
    static class Stack{
        static Queue<Integer> q1=new LinkedList<>();
        static Queue<Integer> q2=new LinkedList<>();
        public static boolean isEmpty(){
            return q1.isEmpty() &&   q2.isEmpty();

        }
        public static void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);   // add the elements in the queue that already has elements 
            }else{
                q2.add(data);
            }
        }
        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack empty");
                return -1;
            }
            int top=-1;
            if(!q1.isEmpty()){
                while(q1.size()>1){
                     q2.add(q1.remove());
                }
                top=q1.remove();
            }else{
                while( q2.size()>1){
                    q1.add(q2.remove());
                }
                top=q2.remove();
            }
            return top;
        }
        public static int peek(){
          if(isEmpty()){
                System.out.println("Stack empty");
                return -1;
            }
             int top=-1;
            if(!q1.isEmpty()){
                 while(q1.size()>0){
                    top=q1.remove();
                    q2.add(top);
                 }
            }else{
                 while(q2.size()>0){
                    top=q2.remove();
                    q1.add(top);
                 }
            }
             return top;
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
