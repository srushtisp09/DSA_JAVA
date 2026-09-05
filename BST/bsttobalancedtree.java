package BST;
import java.util.*;
public class bsttobalancedtree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int val){
            this.data=val;
            this.left=null;
            this.right=null;
        }
    }
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    // public static Node insert(Node root,int val){
    //     if(root==null){
    //         root=new Node(val);
    //         return root;
    //     }
    //     if(root.data<val){
    //         insert(root.right,val);
    //     }
    //     else{
    //         insert(root.left,val);
    //     }
    //     return root;
    // }
    public static void getInorder(Node root,ArrayList<Integer> inorder){
if(root==null){
    return;
}
getInorder(root.left,inorder);
inorder.add(root.data);
getInorder(root.right,inorder);
    }
    public static Node createBST( ArrayList<Integer> inorder,int st,int end){
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(inorder.get(mid));
       root.left= createBST(inorder, st, mid-1);
      root.right=  createBST(inorder,mid+1,end);
        return root;
    }
    public static Node balanceBST(Node root){
        //inorder sequence
        ArrayList<Integer> inorder=new ArrayList<>();
        getInorder(root,inorder);
        //sorted inorder-> balanced bst
        root=createBST(inorder,0,inorder.size()-1);
        return root;
    }
    public static void main(String args[]){
    //     int arr[]={8,6,5,3,10,11,12};
    //    Node root=null;
    //    for(int i=0;i<arr.length;i++){
    //     root=insert(root,arr[i]);
    //    }
    Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);
       root=balanceBST(root);
       preorder(root);
    }
}
//tc o(n)
//second step of creating bst will aslo take linear tc so othe overall tc is o(n)
