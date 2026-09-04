package BST;

  

public class printinrange {
    static class Node{
        int data;
         Node right;
         Node left;
         Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
         }
    }
    public static Node insert(Node root,int val){
         if(root==null){
            root=new Node(val);
            return root;
         }
         if(root.data>val){
            root.left=insert(root.left,val);
         }else{
            root.right=insert(root.right,val);
         }
         return root;
    } 
    
    public static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
     public static void printInRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.data>=k1 && root.data<=k2){
            //So why left-first specifically? — it's inherited from inorder traversal

// This structure — visit left → process self → visit right — is exactly inorder traversal, the same pattern from your inorder() function:
//And you already know why inorder gives sorted output: because of the BST rule, everything in the left subtree is smaller than root.data, and everything in the right subtree is bigger. So visiting left → self → right naturally walks through values in increasing order.



            printInRange(root.left,k1,k2);
            System.out.println(root.data+"");
            printInRange(root.right,k1,k2);
        }else if(root.data<k1){
            printInRange(root.right,k1,k2);
        }else{
            printInRange(root.left,k1,k2);
        }
     }
    public static void main(String args[]){
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
for(int val:values){
    root=insert(root,val);

}
// inorder(root);
// System.out.println();
printInRange(root,5,12);
    }

}
///
// /// //
// /// ///
// /// printInRange — Full Summary
// The problem

// Given a BST and two numbers k1, k2, print every value in the tree that falls in [k1, k2] (inclusive) — in ascending sorted order — while skipping (pruning) any subtree that's guaranteed to be irrelevant.

//
// //The 3 situations (by elimination)

// Every value falls into exactly one zone on the number line:

// ────────────●═══════════●────────────
//   data<k1   k1  in range k2  data>k2
//  (too small)              (too big)
// Situation A — in range (k1<=data<=k2): print it, and check both sides — left subtree could have values still >=k1, right subtree could have values still <=k2.
// Situation B — too small (data<k1): the entire left subtree is guaranteed even smaller (BST rule) → skip/prune it entirely. Only the right subtree might have values that climb into range → recurse right.
// Situation C — too big (data>k2): the entire right subtree is guaranteed even bigger → skip it. Only the left subtree might have values that drop into range → recurse left.

// Direction rule (memorize this):

// Too small → need bigger values → go right. Too big → need smaller values → go left.

// Why the else doesn't need to explicitly check the second condition

// if / else if / else works by elimination, not independent checks:

// First if fails → data is not in range → only two zones remain: data<k1 OR data>k2.
// Second check (else if) tests one of those two zones.
// If that also fails, only the other zone could possibly be true — so the plain else doesn't need to re-check it; it's already proven by elimination.

// This works no matter which of the two zones you check explicitly — the else always ends up meaning "whichever zone I didn't check."

// Version	Explicit 2nd check	else implicitly means	else action
// A	root.data > k2	root.data < k1	recurse right
// // B	root.data < k1	root.data > k2	recurse left