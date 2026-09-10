public class TwosumBSTs {
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int val){
            this.data=val;
            this.right=null;
            this.left=null;
        }
    } 
    int count=0;
    public int countPairs(Node root1,Node root2,int x){
        findPairs(root1,root2,x);
        return count;
    }
    public void findPairs(Node root1,Node root2,int x){
        if(root1==null){
            return;
        }
        findPairs(root1.left,root2,x);
        int needed=x-root1.data;
        if(searchBST(root2,needed)){
            count++;
        }
        findPairs(root1.right,root2,x);
    }
    boolean searchBST(Node root,int target){
        if(root==null){
            return false;
        }
        if(root.data==target){
            return true;
        }
        if(target<root.data){
            return searchBST(root.left,target);
        }
        return search
    }
    public static void main(String args[]){

    }
}
