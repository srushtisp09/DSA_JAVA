package BST;

public class bst {
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
    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
     public static Node delete(Node root,int val){
        if(root.data<val){
            root.right=delete(root.right,val);
        }else if(root.data>val){
            root.left=delete(root.left,val);
        }else{ /// this else means the root.val==val
            //case 1-leaf node
            if(root.left==null && root.right==null){
                return null;
            }

            //case 2-single child
            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            //case 3: both childeren
            //find the inorder successor and replace it this deletes the node
            Node IS=findInorderSuccessor(root.right);
            root.data=IS.data;
            root.right=delete(root.right,IS.data);
        }
        return root;
    }
    public static void main(String args[]){
int values[]={8,5,3,1,4,6,10,11,14};
Node root=null;
for(int val:values){
    root=insert(root,val);

}
root=delete(root,5);
System.out.println();
 inorder(root);
    }
}


//Case 1 — leaf node: no children, just detach it by returning null.

// Case 2 — one child: return the surviving child, so the parent link skips over the deleted node.

// Case 3 — two children: this is the tricky one. You can't just remove the node without breaking the tree, so instead:

// Find the inorder successor — the smallest value in the right subtree (findInorderSuccessor just walks left until it can't anymore).
// Copy that successor's value into the current node (root.data = IS.data) — this "deletes" the node conceptually, since now its value has changed to something valid and correctly placed.
// // Actually remove the original successor node from the right subtree (since its value now lives in two places).
//Read this literally: "whatever delete hands back, that's my new left/right child now." This is how the connection gets formed or re-formed — the parent doesn't manually rewire anything, it just trusts the return value and plugs it in


//BST delete() — Full Summary
 //Above is the code

// Sample tree used throughout:

//               8
//             /   \
//            5     10
//           / \       \
//          3   6       11
//         / \            \
//        1   4            14
// Part 1 — The outer if/else: navigation, not deletion

// This part just performs a BST search for val. Exactly one of three things is true at any node:

// root.data < val → val must be in the right subtree (BST property) → recurse right
// root.data > val → val must be in the left subtree → recurse left
// neither → root.data == val → this is the node to delete

// The recursive calls (root.right = delete(root.right, val)) both search deeper and immediately reconnect whatever comes back — this reassignment is what lets fixes made deep in the recursion propagate back up to the top.

// Part 2 — The else block: three cases based on child count

// Once we know root is the node to delete, the question changes to: how many children does it have?

// Case 1 — Leaf (0 children)
// java
// if(root.left==null && root.right==null){
//     return null;
// }

// Returns: null. Meaning: "nothing belongs at this spot anymore." Effect on parent: parent's pointer becomes null, deleted node is unreachable.

// Case 2 — One child
// java
// if(root.left==null){ return root.right; }
// else if(root.right==null){ return root.left; }

// Returns: the surviving child node itself (an existing, different node object). Meaning: "put my child where I used to be." Effect on parent: parent's pointer skips over the deleted node and connects straight to the child.

// Case 3 — Two children (the tricky one)
// java
// Node IS = findInorderSuccessor(root.right);
// root.data = IS.data;
// root.right = delete(root.right, IS.data);

// Returns (at the very bottom, shared line): root — the same object, only its .data field changed. Meaning: "I'm still the correct node for this position — I just now hold a different, valid value."

// Part 3 — Case 3 walked through fully (deleting 5, children 3 and 6)

// Step 1 — Find inorder successor: findInorderSuccessor(root.right) walks left from node 6. It has no left child, so the successor is node 6 itself.

// Step 2 — Copy value in:

// java
// root.data = IS.data;   // the "5" node now holds 6

// At this instant, there are two boxes holding 6:

//               8
//             /   \
//            6     10      <- was 5, now says 6 (SAME node object)
//           / \       \
//          3   6       11   <- original 6 node, untouched
//         / \            \
//        1   4            14

// This is the duplicate. It exists only briefly, between this line and the next.

// Step 3 — Delete the duplicate:

// java
// root.right = delete(root.right, IS.data);

// This recurses into the original 6 node (a leaf), which hits Case 1 and returns null. That null is assigned to root.right, severing the old node from the tree.

// Step 4 — Return:

// java
// return root;   // same object as always, just relabeled

// Result:

//               8
//             /   \
//            6     10
//           / \       \
//          3  null     11
//         / \            \
//        1   4            14
// Part 4 — Visualizing "reassignment" (the exact mechanism)

// delete(...) never moves a pointer by itself — it only computes and returns a value. The = is what actually moves the arrow.

// Before:

// root ──────► [data: 6]
//                 right ────► [old 6 box]

// Calling delete(root.right, 6) returns null — but that null is just floating, not connected to anything, until it's assigned.

// After root.right = delete(root.right, IS.data):

// root ──────► [data: 6]
//                 right ────► null

// The old box is now unreachable (orphaned) — functionally deleted.

// The bug version — forgetting the assignment:

// java
// delete(root.right, IS.data);   // return value discarded!
// root ──────► [data: 6]
//                 right ────► [old 6 box]   <- arrow never redirected

// The computed null evaporates. The duplicate 6 stays permanently attached to the tree.

// Part 5 — Return values compared across all three cases
// Case	What's returned	New/different node?	Effect at parent
// 1 — Leaf	null	N/A	pointer → null
// 2 — One child	the surviving child	yes, a pre-existing different node	pointer skips deleted node, → child directly
// 3 — Two children	root itself	no, same object, only .data changed	pointer reassigned to same object (no real change at this level — the real fix happened one level deeper)
// Part 6 — The interview-ready explanation (say this out loud)

// "The outer if-else is a BST search: if the current node's data is smaller than the value, the target must be in the right subtree, so I recurse right; if greater, I recurse left. Both recursive calls immediately reassign the result back into root.left or root.right, which is how fixes made deeper in the recursion get wired back up the tree.

// Once I find the node — root.data == val — I branch on how many children it has. If it's a leaf, I return null, erasing it. If it has one child, I return that child directly, so the parent skips over the deleted node entirely.

// If it has two children, I can't safely remove it outright, so I find its inorder successor — the smallest value in its right subtree — and copy that value into the current node. That handles the deletion in terms of value, but it temporarily creates a duplicate, since the original successor node still physically exists. So I recursively delete that successor from the right subtree, and — critically — I assign the result back to root.right, otherwise the duplicate is never actually unlinked. Finally, I return root itself, since this node's identity never changed — only its data did."

// Part 7 — The one bug to always check for

// Any time a function like this returns a Node, and a recursive call to it isn't assigned to something —

// java
// delete(root.right, val);        // ❌ bug: return value thrown away
// root.right = delete(root.right, val);   // ✅ correct

// — assume it's broken. This exact mistake was in your original code's Case 3.