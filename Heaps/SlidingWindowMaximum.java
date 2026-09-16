package Heaps;
import java.util.*;

import javax.swing.Painter;
//Sliding Window Maximum 
// Maximum of all Subarrays of SIze k 
//int k =3 it could be anything
//ex -- 1,2,3,4,5,6,7,
//ans -- 3,4,5,6,7
public class SlidingWindowMaximum {
    static class pair implements Comparable<pair>{
        int val;
        int idx;
        public pair(int val,int idx){
            this.val=val;
            this.idx=idx;
        }
        @Override
        public int compareTo(pair p2){
            //ascending
            // return this.val-p2.val;
            return p2.val-this.val;
            //descending

        }
    }
    public static void main(String args[]){
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int res[]=new int[arr.length-k+1];
        PriorityQueue<pair> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(new pair(arr[i],i));
        } 
        res[0]=pq.peek().val;
        for(int i=k;i<arr.length;i++){
            while(pq.size()>0 && pq.peek().idx<=(i-k)){
                pq.remove();
            }
          pq.add(new pair(arr[i],i));
          res[i-k+1]=pq.peek().val;
        }
        System.out.println(Arrays.toString(res));
    } 
}
