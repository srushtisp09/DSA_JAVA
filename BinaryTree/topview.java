import java.util.*;
public class topview {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
static class Info{
    int hd;
    Node node;
    public Info(Node node,int hd){
        this.node=node;
        this.hd=hd;
    }
}
//
// Breaking down Queue<Info> q = new LinkedList<>();
// java
// Queue<Info> q = new LinkedList<>();

// This line has two separate things happening:

// 1. Queue<Info> q — declaring the variable
// Queue is an interface in Java (java.util.Queue) — it defines the behavior of a queue: add(), poll(), peek(), etc. (FIFO — First In, First Out).
// <Info> is the generic type parameter — it tells Java what type of objects this queue will hold. Here, it holds objects of type Info — presumably a custom class you've defined.
// q is just the variable name.

// So this declares: "q is a reference variable of type Queue, and this queue will only ever store Info objects."

// 2. new LinkedList<>() — creating the actual object
// LinkedList is a class that implements the Queue interface (along with List and Deque).
// new LinkedList<>() actually creates the real object on the heap.
// The empty <> (called the diamond operator) means "infer the type from the left side" — Java automatically knows it should be LinkedList<Info>, so you don't have to repeat Info twice.
// STACK                    HEAP
// ┌────────┐              ┌───────────────────┐
// │ q      │──────────────►│ LinkedList object  │
// │ (addr) │              │ (empty, ready to    │
// └────────┘              │  hold Info objects) │
//                          └───────────────────┘

//The core idea: Horizontal Distance (HD)

// Imagine dropping a vertical line through the root. Every node gets a horizontal distance from root:

// Root → hd = 0
// Go left → hd - 1
// Go right → hd + 1
//Top view = for each unique horizontal distance, only the first node encountered (top-most, level-by-level) is visible — everything below it at the same hd is hidden behind it.

//             1 (hd=0)
//            / \
//           2   3      hd=-1, hd=1
//          / \   \
//         4   5   6    hd=-2, hd=0, hd=2

// Here, node 5 has hd=0, same as root 1 — but since 1 is encountered first (it's higher up, level-order-wise), 1 "blocks" 5 from the top view.

// Since BFS visits level-by-level, the first time you see a given hd, that's guaranteed to be the topmost node at that horizontal distance — that's the whole trick this algorithm exploits.

// Why Info bundles node + hd
// java
// q.add(new Info(root,0));

// Same reasoning as before — a plain Queue<Node> can't also track horizontal distance, so Info carries both together as nodes travel through the BFS queue.

// Why there's a null in the queue — this is the clever/unusual part
// java
// q.add(null);

// This null is a level marker/delimiter — but honestly, it's not needed for this particular problem since topView doesn't care about levels, only about "first time seeing an hd." This pattern is usually borrowed from level-order traversal code (where you do need to know when one level ends and the next begins, e.g., to print each level on a new line) — but here it's just extra unused machinery. Worth flagging in an interview:

// "This null-marker technique is typically used to separate levels in BFS, but in this specific algorithm it doesn't actually affect correctness — the HashMap's containsKey check alone is what guarantees 'first occurrence wins.' I could remove the null-marker logic entirely and the output would be identical."

// That's a strong thing to point out — it shows you're not just reciting code, you're evaluating whether every part of it is necessary.

// Line-by-line trace

// Setup:

// java
// Queue<Info> q = new LinkedList<>();
// HashMap<Integer,Node> map = new HashMap<>();   // hd → first node seen at that hd
// int min=0, max=0;                               // track the range of hd values
// q.add(new Info(root,0));
// q.add(null);                                     // level delimiter (unused effectively)

// Main loop:

// java
// while(!q.isEmpty()){
//     Info curr = q.remove();
//     if(curr==null){
//         if(q.isEmpty()) break;      // all real nodes processed, stop
//         else q.add(null);           // mark end of this level, continue
//     } else {
//         if(!map.containsKey(curr.hd)){
//             map.put(curr.hd, curr.node);   // ONLY store if this hd hasn't been seen — "first wins"
//         }
//         if(curr.node.left != null){
//             q.add(new Info(curr.node.left, curr.hd - 1));
//             min = Math.min(min, curr.hd - 1);
//         }
//         if(curr.node.right != null){
//             q.add(new Info(curr.node.right, curr.hd + 1));
//             max = Math.max(max, curr.hd + 1);
//         }
//     }
// }

// The key line doing all the real work:

// java
// if(!map.containsKey(curr.hd)){
//     map.put(curr.hd, curr.node);
// }

// Because BFS processes nodes level by level, left to right, the first time any hd value is encountered, it's guaranteed to be the topmost, and (among same-level ties) leftmost node at that hd. This if check simply refuses to overwrite an already-recorded hd — so later, deeper nodes at the same hd get silently ignored.

// Final output:

// java
// for(int i=min; i<=max; i++){
//     System.out.print(map.get(i).data+" ");
// }

// Walks through every horizontal distance from leftmost (min) to rightmost (max), printing the recorded top-view node at each position, left to right.

// Full dry run
//             1 (hd=0)
//            / \
//           2   3
//        hd=-1  hd=1
//          / \    \
//         4   5    6
//      hd=-2 hd=0  hd=2
// Step	Dequeue	hd	map before	Action
// 1	Info(1, 0)	0	{}	not in map → put {0:1}. Add left Info(2,-1), right Info(3,1). min=-1, max=1
// 2	null	—		q not empty → re-add null
// 3	Info(2,-1)	-1	{0:1}	not in map → put {0:1, -1:2}. Add left Info(4,-2), right Info(5,0). min=-2
// 4	Info(3,1)	1	{0:1,-1:2}	not in map → put {..., 1:3}. Add right Info(6,2). max=2
// 5	null	—		q not empty → re-add null
// 6	Info(4,-2)	-2		not in map → put {-2:4}
// 7	Info(5,0)	0		already in map → skip! (5 stays hidden)
// 8	Info(6,2)	2		not in map → put {2:6}
// 9	null	—		q is now empty → break

// Final map: {-2:4, -1:2, 0:1, 1:3, 2:6}

// // Output loop (min=-2 to max=2): 4 2 1 3 6

// // That's the top view, left to right — and notice 5 never made it into the output, correctly hidden behind 1.

// // Complexity
// // Time: O(n) — every node is visited once, HashMap operations are O(1) average.
// // Space: O(n) — for the queue and the HashMap.
// // One-liner for the interview

// // "Top view relies on horizontal distance from root — left decreases it, right increases it. I do a BFS, and the very first node encountered at each horizontal distance is guaranteed to be the topmost one, since BFS processes level by level. I use a HashMap keyed by horizontal distance, only inserting if that key isn't already present — that 'first-write-wins' behavior is what naturally hides deeper nodes at the same horizontal distance. Finally, I print the map values in order from the minimum to maximum horizontal distance to get left-to-right output."








public static void topView(Node root){
    Queue<Info> q=new LinkedList<>();
    HashMap<Integer,Node> map=new HashMap<>();
    int min=0,max=0;
    q.add(new Info(root,0));
    q.add(null);
    while(!q.isEmpty()){
        Info curr=q.remove();
        if(curr==null){
            if(q.isEmpty()){
                break;

            }
            else{
                q.add(null);
            }
        }else{
            if(!map.containsKey(curr.hd)){
            map.put(curr.hd,curr.node);
        }
        if(curr.node.left!=null){
            q.add(new Info(curr.node.left,curr.hd-1));
            min=Math.min(min,curr.hd-1);
                }
                if(curr.node.right!=null){
                    q.add(new Info(curr.node.right,curr.hd+1));
                    max=Math.max(max ,curr.hd+1);
                }

        }

         
    }
    for(int i=min;i<=max;i++){
        System.out.print(map.get(i).data+" ");
    }
    System.out.println();

} 
    public static void main(String args[]){
         Node root=new Node(1);
         root.left=new Node(2);
         root.right=new Node(3);
         root.left.left=new Node(4);
         root.left.right=new Node(5);
         root.right.left=new Node(6);
         root.right.right=new Node(7);




        topView(root);
    }
    
}
//Hash maps are the efficient data structures that  have constant 
//Tc for adding getting and removing the node 

//we use the concept of horizontal distance and maps 


