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
// // T.C 0(nlogn)
// // arr --> maxHeap
// // ascending --> maxHeap
// //descending --- > min heap
//  //"heapify is a function that fixes the max-heap property 
//  // at a single node, assuming both its child subtrees 
//  // are already valid max-heaps. Given a node at index i,
//  //  I calculate its children's indices as 2*i+1 (left) and
//  //  2*i+2 (right). I compare the node's value against both 
//  // children (checking bounds so I don't go out of array 
//  // range) to find the index of the largest of the three, 
//  // stored in maxIdx. If maxIdx equals i, 
//  // the node is already the largest, and I'm done. 
//  // Otherwise, I swap arr[i] with arr[maxIdx],
//  //  and then recursively call heapify on maxIdx,
//  //  because the demoted value might now violate the heap property further down. 
//  // This recursive 'sink-down' continues until the value reaches a spot where it's no longer smaller than its children, 
//  // or it becomes a leaf. Each call does O(log n) work since it only travels one root-to-leaf path."






//  ///Your Doubt, Restated Correctly

// You're asking: "After building the max-heap, why do I keep swapping root↔last and re-heapifying? Why not just read the heap in some order?"

// Here's the key insight you're circling around:

// A max-heap only guarantees that the root is the largest element. It does NOT guarantee that the rest of the array is sorted. The array {5, 3, 4, 2, 1} is a valid max-heap, but reading it left to right (5,3,4,2,1) is clearly not sorted ascending.

// So a max-heap gives you one correct fact per step: "the biggest remaining element is always at index 0." To turn that single fact into a fully sorted array, you have to extract that max, one at a time, n times, placing each one in its correct final position.

// Why Swap Root with the LAST Element (not just remove it)

// This is the clever part, and it's worth stating explicitly in an interview:

// "Since we're sorting in-place (no extra array), I need somewhere to put the extracted maximum. I swap it with the last element of the active heap region. This does two things at once: it moves the max into its correct final sorted position (the end), and it moves some arbitrary heap element (from the back) up to the root, which I now need to sift back down."

// That "arbitrary element that got moved to the root" is why you must re-heapify — the swap breaks the heap property at the root, since the previously-last element wasn't necessarily large.

// Why Shrink the Heap Size Each Time

// "The element I just placed at the end is finalized — it's in its sorted position and must never be touched again. So I shrink the 'active heap' boundary by one each iteration (size = i), which tells heapify to pretend the array ends there. This way the sorted suffix at the back is never disturbed by further heap operations, while the max-heap property is maintained only over the shrinking unsorted prefix."

// The Full Mental Model (one paragraph, interview-ready)

// "Building a max-heap only tells me where the single largest element is — at the root. To sort the whole array, I repeat a simple move n-1 times: swap the root (current max) with the last unsorted element, which places that max in its correct final spot and shrinks the unsorted region by one. The element that got swapped into the root position is now probably out of place, so I call heapify on the root to sift it back down into a valid heap — but only within the shrunk boundary, so I never disturb the sorted elements at the back. Repeating this process pulls out the max, second-max, third-max, and so on, placing each one correctly from the back forward, until the whole array is sorted ascending."

// Quick Analogy (good for a nervous interview moment)

// "It's like repeatedly picking the tallest person out of a crowd and placing them at the back of a line, then finding who's tallest among those remaining, and so on. Each round, you shrink the 'still needs sorting' group by one, and the 'already placed' group grows from the back."

// One-Line Gut-Check to Remember
// Max-heap property → tells you where the max is (root), not the full order.
// Extraction loop → is what actually produces the sorted order, one element at a time.
// // Shrinking size → is what protects the already-sorted part from being messed up again//