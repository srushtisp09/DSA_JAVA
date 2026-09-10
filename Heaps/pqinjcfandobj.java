package Heaps;
import java.util.*; 
public class pqinjcfandobj {

    public static void main(String args[]){
    //     PriorityQueue<Integer> pq=new PriorityQueue<>();
    //     pq.add(3);          //0(logn)
    //     pq.add(4);
    //     pq.add(7);
    //     pq.add(1);
    //     while(!pq.isEmpty()){
    // System.out.println(pq.peek());
    // pq.remove(); 
    PriorityQueue<Integer> pq1=new PriorityQueue<>(Comparator.reverseOrder());
    pq1.add(3);
    pq1.add(8);
    pq1.add(4);
    pq1.add(6);
    while(!pq1.isEmpty()){
        System.out.println(pq1.peek());
        pq1.remove();
    } 
        }  
}

//  Over here we see that the order that gets by default will always be a ascending order because pririty queue gives priority to the integer that has less value 
//  thus the order that gets printed will be ascending order 
//  incase if  u dont want the order to be ascending and want to make it descending then we use a comparator that will basically reverse the order
//  in the arguments add Comparator .reverseOrder() this reverses the logic
//  and hence u will get descending order  
