public class DiameterofTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

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
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int ldiameter=diameter(root.left);
        int rdiameter=diameter(root.right);
        int lheight=height(root.left);
        int rheight=height(root.right);
        int selfdiam=lheight+rheight+1;
        return Math.max(selfdiam, Math.max(ldiameter,rdiameter));
    }
    public static void main(String args[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        System.out.println(diameter(root));

    }
}


//This approach takes o()n2 approach because at every node the height is being calculated
//every time and thus this is not a perfect apporach so we use apprach 2 
