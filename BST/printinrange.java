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
        }else if(root.data>k2){
            printInRange(root.left,k1,k2);
        }else{
            printInRange(root.right,k1,k2);
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
