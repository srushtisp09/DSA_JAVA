package LinkedList;

 

public class Recursivesearch {
     public class Node{
        int data;
        Node next;
       public Node(int data){
        this.data=data;
        this.next=null;
       } 
     }
     public static Node head;
     public static Node tail;
     public  void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
            return;

        }
        newNode.next=head;
        head=newNode;


     }
     public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp=temp.next;
        }
        System.out.println("null");
     }
     //recursove search
     //helper function
     public int helper(Node head,int key){
        if(head==null){
            return -1;

        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }

        return idx+1;
     }
     public int recursivesearch(int key){
        return helper(head,key);
     }
    //  public int search(int key){
    //     Node temp=head;
    //     int i=0;
    //     while(temp!=null){
    //         if(temp.data==key){
    //             return i;
    //         }
    //         temp=temp.next;
    //         i++;
    //     } 
    //     return -1;
    //  }
    public static void main(String args[]){
        Recursivesearch rs=new Recursivesearch();
        int key=2;
        rs.print();
        rs.addFirst(1);
        rs.print();
        rs.addFirst(2);
        rs.print();
        rs.addFirst(3);
        rs.print();
        rs.addFirst(4);
        rs.print();
        System.out.println(rs.recursivesearch(2));
        System.out.println(rs.recursivesearch(9));
        ///TC O(n) this is because of  helper function
        /// SC O(n) becuase recursion the call stack takes place  
    }
}
