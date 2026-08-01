public class DiameterApproach2 {

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
         static class Info{
            int diam;
            int ht;
            public Info(int diam,int ht){
                this.diam=diam;
                this.ht=ht;
            } 
           
         }
        //  public static int diameter2(Node root){
        //     if(root==null){
        //         return 0;
        //     }
        //     int leftDiam=diameter2(root.left);
        //     int leftht=diameter2(root.left);
        //     int rightDiam=diameter2(root.right);
        //     int rightht=diameter2(root.right);
        //     int selfDiam=leftht+rightht+1;
        //     return Math.max(selfDiam,Math.max(leftDiam,rightDiam));
        //  } 
         public static Info diameter(Node root){
            if(root==null){
                return new Info(0,0);
            }
            Info leftInfo=diameter(root.left);
            Info rightInfo=diameter(root.right);
           int diam=Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
           int ht=Math.max(leftInfo.ht,rightInfo.ht)+1;
           return new Info(diam,ht);

         }
         

    public static void main(String args[]){
           Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
System.out.println(diameter(root).diam);
System.out.println(diameter(root).ht);
       


    } 
}

//In this question we make a static class called Info that will store the results of both diameter and height and 
// this will be returned when u want ur height and diam .the reason that we create 
// class is that we have two info taht we need to return and in the brute force appraoch we had two functions separately writtten to calculate both height and diameter 
// so that ead to tc ofo(n2) to reduce that we made a class and create a object out of it thus returning both ht and diameter
//at one go . so the real  reason y both ht and diameter return the both is that for some skewed and small trees both diameter and height are the same they are calcualted by the same formula
   //Use the correct code — Approach 2 (Info-based)

// Never dry-run diameter2 (the buggy one) in an interview — you'd be explaining a bug as if it were a feature. Always dry-run the working Info-based diameter().

// A clean structure to follow when asked "dry run this for me"

// 1. State your example tree out loud first (draw it if there's a whiteboard):

// "Let me take a small tree — root 1, with left child 2, and 2 has a left child 4."

//     1
//    /
//   2
//  /
// 4

// 2. State the core idea in one sentence before diving into numbers:

// "This is a bottom-up recursion — I go all the way down to the null children first, and then compute height and diameter on the way back up, combining each node's children's results."

// 3. Walk the recursion downward, briefly:

// "diameter(1) calls diameter(2), which calls diameter(4), which calls diameter(null) twice — that's the base case."

// 4. Resolve bottom-up, showing the object at each step — this is the part interviewers actually want to see:

// "diameter(null) returns Info(diam=0, ht=0) — that's my base case."

// "Back at node 4: leftInfo = Info(0,0), rightInfo = Info(0,0). So diam = max(max(0,0), 0+0+1) = 1, and ht = max(0,0)+1 = 1. Node 4 returns Info(1,1)."

// "Back at node 2: leftInfo = Info(1,1) from node 4, rightInfo = Info(0,0) since node 2 has no right child. diam = max(max(1,0), 1+0+1) = 2, ht = max(1,0)+1 = 2. Node 2 returns Info(2,2)."

// "Finally at root 1: leftInfo = Info(2,2), rightInfo = Info(0,0). diam = max(max(2,0), 2+0+1) = 3, ht = max(2,0)+1 = 3. Root returns Info(3,3)."

// 5. Sanity-check your final answer against the tree visually:

// "The longest path here is 4→2→1, which is 3 nodes — that matches diam=3. And the tree is 3 levels deep, which matches ht=3."