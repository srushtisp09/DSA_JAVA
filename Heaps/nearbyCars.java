package Heaps;
import java.util.*;
///Nearby Cars
/// We are given N points in a 2D plane which are locations of N cars.
/// If we re at the origin ,print the nearest K cars.
/// c0(3,3)
/// c1(5,-1)
/// c2(-2,4)
/// K=2
/// ans=C0 & C2
/// This question can come as K nearest cars or anything like restuarants etc
  
 
public class nearbyCars { 
    static class Point implements Comparable<Point> { 
        int x; 
        int y; 
        int distSq; 
        int idx; 

        // Fixed: Added int idx to the constructor parameters
        public Point(int x, int y, int distSq, int idx) { 
            this.x = x; 
            this.y = y; 
            this.distSq = distSq; 
            this.idx = idx; 
        } 

        @Override 
        public int compareTo(Point p2) { 
            return this.distSq - p2.distSq; // Min-Heap: Closest distance comes first
//             //this.distSq - p2.distSq can overflow if the values are very large (close to Integer.MAX_VALUE or very negative), because subtracting two large ints can wrap around and give the wrong sign.

// Safer alternative:

// java
// return Integer.compare(this.distSq, p2.distSq);
        } 
    } 

    public static void main(String args[]) { 
        int pts[][] = {{3, 3}, {5, -1}, {-2, 4}}; 
        int k = 2; 
        
        PriorityQueue<Point> pq = new PriorityQueue<>(); 
        
        for (int i = 0; i < pts.length; i++) { 
            // Fixed: Added missing semicolon
            int distSq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1]; 
            // Fixed: Constructor now matches the 4 arguments passed here
            pq.add(new Point(pts[i][0], pts[i][1], distSq, i)); 
        } 

        // Print the nearest k cars
        for (int i = 0; i < k; i++) { 
            System.out.println("C" + pq.remove().idx); 
        } 
    } 
}
//remove() always gives you back whatever was at the root before any fixing began — the sift-down afterward only prepares the heap for the next remove() call, it doesn't change the answer for the current one.

  
 //"A PriorityQueue in Java is implemented as an array-based binary min-heap, where for any node at index i, its children are at 2i+1 and 2i+2. The heap property guarantees every parent is ≤ its children, so the smallest element is always at index 0.

// When remove() is called, it does four things, in this exact order:

// Save the root first — result = queue[0]. This is locked in immediately, before any rearranging happens, and it's what will eventually be returned.
// Move the last element in the array to the root position, and shrink the size by one. I use the last element specifically because removing it doesn't break the heap's shape — a heap must stay a complete binary tree, filled left to right.
// Sift-down (bubble-down) from the root — compare this misplaced element with its children, swap with whichever child is smaller if it violates the heap property, and repeat this at the new position until it settles correctly or becomes a leaf. This restores the heap property in O(log n) time, since the tree height is log n.
// Return the saved root — importantly, this is the value saved in step 1, before the sift-down ran. The sift-down only rearranges the heap for the next operation — it has no effect on what's returned for the current call."

// Complexity: O(log n) per removal, because sift-down does at most one swap per level of the tree.

// One-liner to close it

// "So in short: remove() grabs the current minimum, patches the hole left behind using the last leaf, and lets that leaf sink to its correct position — but the value returned was already decided before any of that patching began."

 


