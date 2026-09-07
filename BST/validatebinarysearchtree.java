public class validatebinarysearchtree {
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
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data<val){
            root.right=insert(root.right,val);
        }else if(root.data>val){
            root.left=insert(root.left,val);
        }
        return root;
    }
    public static boolean ValidateBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }
        if(max!=null && root.data>=max.data){
            return false;
        }
        return ValidateBST(root.left,min,root) && ValidateBST(root.right,root,max);
    }
    public static void main(String args[]){
int arr[]={8,5,3,1,4,6,10,11,14};
Node root=null;
for(int i=0;i<arr.length;i++){
    root=insert(root,arr[i]);
}
if(ValidateBST(root,null,null)){
    System.out.println("Valid");
}else{
    System.out.println("Not valid");
}

    }
}
 