public class closestelementinbst{
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
    public static int findClosest(Node root,int k){
        int closest=root.data;
        Node curr=root;
        while(curr!=null){
            if(Math.abs(curr.data-k)<=Math.abs(closest-k)){
                closest=curr.data;
            }
            
            if(k<curr.data){
                curr=curr.left;
            }else if(k>curr.data){
                curr=curr.right;
            }
            else{
                return curr.data;
            }
        }
        return closest;
    }
public static void main(String args[]){
     Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(11);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(20);
         int K1 = 5;
        System.out.println("Closest to " + K1 + " is " + findClosest(root, K1));
 }
 }