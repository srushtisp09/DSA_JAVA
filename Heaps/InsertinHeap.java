 
package Heaps;

 
import java.util.*;
 
public class InsertinHeap {
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();
        public void add(int data){
            //add at last index
            arr.add(data);
            int x=arr.size()-1;
            
           
            while(x>0){
                    int par=(x-1)/2;
                    if(arr.get(x)<arr.get(par)){
                        int temp=arr.get(x);
                        arr.set(x,arr.get(par));
                        arr.set(par,temp);
                        x=par;
                    }else{
                        break;
                    }
            }

        }

        public void print(){
            for(int i=0;i<arr.size();i++){
                System.out.println(arr.get(i)+ " ");

            }
            System.out.println();
        }
        public int peek(){
            return arr.get(0);
        }

    }
    public static void main(String args[]){
        Heap h=new Heap();
        int[] values={5,3,8,1,9,2};
        for(int v:values){
            h.add(v);
        }
        h.print();
        System.out.println(h.peek());
    }
}
// They belong inside Heap specifically because of encapsulation — add() and print() operate directly on arr, which is Heap's own field. Putting them inside the class that owns the data means:

// They can access arr directly (arr.add(data)), without needing to pass it in as a parameter or expose it publicly.
// // Anyone using a Heap object just calls h.add(5) or h.print() — they don't need to know arr exists at all. That's the whole point of an object: it bundles data + the operations that make sense on that data into one unit