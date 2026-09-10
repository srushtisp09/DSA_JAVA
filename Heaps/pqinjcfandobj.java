package Heaps;
import java.util.*; 
public class pqinjcfandobj {
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;
 
        }
        @Override 
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String args[]){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(3);          //0(logn)
        pq.add(4);
        pq.add(7);
        pq.add(1);
        while(!pq.isEmpty()){
    System.out.println(pq.peek());
    pq.remove(); 
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
        
        // priority Queue for objects
        // to compare objects in priority queue we dont have anything as such so we introduce a interface that will be implemented in the class 
        // this helps us to compare the class
        // The interface that weare using is called Comparable that is implemented in the class and this will contain fucntions that we will use to compare our classes
        // A compareTo function is used to compare the classes the compareto function exists in the comparable interface  
        // above is the syntax   
        PriorityQueue<Student> pq2=new PriorityQueue<>();
        pq2.add(new Student("A",4));
        pq2.add(new Student("B",5));
        pq2.add(new Student("C",4));
        pq2.add(new Student("D",8));
        while(!pq2.isEmpty()){
            System.out.println(pq2.peek().name+"->"+pq2.peek().rank);
            pq2.remove();
        }

}
}
//  Over here we see that the order that gets by default will always be a ascending order because pririty queue gives priority to the integer that has less value 
//  thus the order that gets printed will be ascending order 
//  incase if  u dont want the order to be ascending and want to make it descending then we use a comparator that will basically reverse the order
//  in the arguments add Comparator .reverseOrder() this reverses the logic
//  and hence u will get descending order  
