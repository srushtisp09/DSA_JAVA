package Heaps;

public class heapsort {
    public static void heapify(int arr[], int i,int size){
        int left=2*i+1;
        int right=2*i+2;
        int maxIdx=i;
        if(left<size && arr[left] > arr[maxIdx]){
            maxIdx=left;
        }
        if(right <size && arr[right]>arr[maxIdx]){
            maxIdx=right;
        }
        if(maxIdx!=i){
            //swap
            int temp=arr[i];
            arr[i]=arr[maxIdx];
            arr[maxIdx]=temp;

            heapify(arr,maxIdx,size);
        }
    }
    public static void heapsort(int arr[]){
        // step 1 -build  maxheap
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }
        //step2 : push largest at end
       for(int i=n-1;i>0;i--){
        //swap (largest -first with last)
        int temp=arr[0];
        arr[0]=arr[i];
        arr[i]=temp;

        heapify(arr, 0,i);
       }
    }
    public static void main(String args[]){
        int arr[]={1,2,4,5,3};
        heapsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
// T.C 0(nlogn)
// arr --> maxHeap
// ascending --> maxHeap
//descending --- > min heap
 //"heapify is a function that fixes the max-heap property 
 // at a single node, assuming both its child subtrees 
 // are already valid max-heaps. Given a node at index i,
 //  I calculate its children's indices as 2*i+1 (left) and
 //  2*i+2 (right). I compare the node's value against both 
 // children (checking bounds so I don't go out of array 
 // range) to find the index of the largest of the three, 
 // stored in maxIdx. If maxIdx equals i, 
 // the node is already the largest, and I'm done. 
 // Otherwise, I swap arr[i] with arr[maxIdx],
 //  and then recursively call heapify on maxIdx,
 //  because the demoted value might now violate the heap property further down. 
 // This recursive 'sink-down' continues until the value reaches a spot where it's no longer smaller than its children, 
 // or it becomes a leaf. Each call does O(log n) work since it only travels one root-to-leaf path."