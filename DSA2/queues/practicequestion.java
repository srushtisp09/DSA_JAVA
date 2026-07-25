package queues;
import java.util.*;
public class practicequestion {
    // public static void binaryNumbers(int n){
    //     Queue<String> q=new LinkedList<>();
    //     q.add("1");
    //     for(int i=0;i<n;i++){
    //         String curr=q.remove();
    //         System.out.println(curr+" ");
    //         q.add(curr+"0");
    //         q.add(curr+"1");


    //     }
    // }
   public static void reverse(Queue<Integer> q, int k){
      Stack<Integer> s=new Stack<>();
      int n=q.size();
        for(int i=0;i<k;i++){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
         for(int i=0;i<n-k;i++){
             q.add(q.remove());
         }
   }
    public static void main(String args[]){
    //      int n=5;
    //    binaryNumbers(5);
    Queue<Integer> q=new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.add(6);
    q.add(7);
    q.add(8);
    q.add(9);
    q.add(10);
    reverse(q,5);
    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }


    }
}
