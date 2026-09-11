 
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

    }
    public static void main(String args[]){
        Heap h=new Heap();
        int[] values={5,3,8,1,9,2};
        for(int v:values){
            h.add(v);
        }
        h.print();
    }
}
