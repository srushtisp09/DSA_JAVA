// public class bt1{
//     static class Node{
//         int data;
//         Node left;
//         Node right;
//         Node(int data){
//             this.data=data;
//             this.left  =null;
//             this.right=null;
//               } 
//     }
     
//     static class BinaryTree{
//            static int idx=-1;
//         public static Node buildTree(int nodes[]){
//           idx++;
//           if(nodes[idx]==-1){
//             return null;
//           }
//            Node newNode=new Node(nodes[idx]);
//            newNode.left=buildTree(nodes);
//            newNode.right=buildTree(nodes);
//            return newNode;
//         }
//         //PREORDER
//     //       public static void preorder(Node root){
//     //         if(root==null){
//     //             // System.out.println("-1");
//     //             return;
//     //         }
//     //         System.out.println(root.data+" ");
//     //         preorder(root.left);
//     //          preorder(root.right);
//     // }
//     //INORDER
//     // public static void inorder(Node root){
//     //     if(root==null){
//     //         return;
//     //     }
//     //     inorder(root.left);
//     //     System.out.println(root.data);
//     //     inorder(root.right);
//     // }
//     //POSTORDER
//     public static void postorder(Node root){
//         if(root==null){
//             return;
//         }
//         postorder(root.left);
//         postorder(root.right);
//         System.out.println(root.data);
//     }
//     }
    
     
   
//     public static void main(String args[]){
//         int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//          Node root=BinaryTree.buildTree(nodes);
//         //  BinaryTree.preorder(root);
//         // BinaryTree.inorder(root);
//         BinaryTree.postorder(root);
//     }
// }
// //TC o(n)
// //preorder traversal--> first root and then left subtree and then 
// //right subtree
