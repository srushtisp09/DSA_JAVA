public class sumofnodes {
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
    public static int calcSumofNodes(Node root){
        if(root==null){
            return 0; 
        }
        int leftSum=calcSumofNodes(root.left);
        int rightSum=calcSumofNodes(root.right);
        return leftSum+rightSum+root.data;
    }
    public static void main(String args[]){
 Node root=new Node(1);
         root.left=new Node(2);
         root.right=new Node(3);
         root.left.left=new Node(4);
         root.left.right=new Node(5);
         root.right.left=new Node(6);
         root.right.right=new Node(7);
         System.out.println(calcSumofNodes(root));
    }
}
