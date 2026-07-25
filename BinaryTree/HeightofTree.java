public class HeightofTree {
    static class Node{
        int data;
        Node right;
        Node left;
         Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
         }

    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftheight=height(root.left);
        int rightheight=height(root.right);
        return Math.max(leftheight,rightheight)+1;
    }
     public static void main(String args[]){
Node root=new Node(1);
root.left=new Node(2);
root.right=new Node(3);
root.left.left=new Node(4);
root.left.right=new Node(5);
root.right.left=new Node(6);
root.right.right=new Node(7);
System.out.println(height(root));
     }
  }
 
// always when any code comes of binary trees think of recursion
//because if  u calculate the child nodes then u will get the answer for the 
//parent node
