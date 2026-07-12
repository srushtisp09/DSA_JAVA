package queues;
import java.util.*;
public class practicequestion {
    public static void binaryNumbers(int n){
        Queue<String> q=new LinkedList<>();
        q.add("1");
        for(int i=0;i<n;i++){
            String curr=q.remove();
            System.out.println(curr+" ");
            q.add(curr+"0");
            q.add(curr+"1");


        }
    }
    public static void main(String args[]){
         int n=5;
       binaryNumbers(5);

    }
}
