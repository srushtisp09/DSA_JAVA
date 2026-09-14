  
package Heaps;

 
import java.util.*;
 
public class deleteinheap {
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
private void heapify(int i){
    int left=2*i+1;
    int right=2*i+2;
    int minIdx=i;
    if(left<arr.size() && arr.get(minIdx)>arr.get(left)){
        minIdx=left;
    }
    if(right<arr.size() && arr.get(minIdx)>arr.get(right)){
        minIdx=right;
    }
    if(minIdx!=i){
        int temp=arr.get(i);
        arr.set(i, arr.get(minIdx));
        arr.set(minIdx,temp);

        heapify(minIdx);
    }

 }
        public int remove(){
            int data=arr.get(0);
            // step1: //swap first and last
            int temp=arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);
            //step2; deleteeee last
            arr.remove( arr.size()-1);
            //step3-heapify
            heapify(0);
            return data;

        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String args[]){
        Heap h=new Heap();
        // int[] values={5,3,8,1,9,2};
        // for(int v:values){
        //     h.add(v);
        // }
        // h.print();
        // System.out.println(h.peek());
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
// Time complexity is 0(logn )
// (n nodes)
// the time complexity of heapify itself is 0(logn) thus the t.c of deletion is 0(logn) 
//  add() → heapify-up (bubble up)
// New element goes to the last index, then you compare it with its parent and swap upward until it's no longer smaller than its parent (or hits the root). This restores the heap property from the bottom toward the top.

// remove() → heapify-down (sink down)
// // You swap the root with the last element, delete the last (which was the old root/min), then call heapify(0). This compares the new root with its children and swaps downward until it's smaller than both children (or hits a leaf). This restores the heap property from the top toward the bottom.
