public class mirrortree {
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
        }else{
            root.left=insert(root.left,val);
        }
        return root;
    } 
    public static Node mirror(Node root){
        if(root==null){
            return null;
        }
        Node leftsubtree=mirror(root.left);
        Node rightsubtree=mirror(root.right);
        root.right=leftsubtree;
        root.left=rightsubtree;
        return root;

    }
    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        preorder(root.left);
        System.out.println(root.data+"");
        preorder(root.right);
    }
    public static void main(String args[]){
        int arr[]={8,5,10,3,6,11};
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=insert(root,arr[i]);
        }
        root=mirror(root);
        preorder(root);
    }

}
