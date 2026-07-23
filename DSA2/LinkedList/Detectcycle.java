package LinkedList;

public class Detectcycle {
     public static  class Node{    // this is floyds cycle finding algorithm
        int data;
        Node next;
        public  Node(int data){
            this.data=data;
            this.next=null;

        }

    }
    public static Node head;
    public static Node tail;
    public  void AddFirst(int  data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=new Node(data);
            return;
        }
        newNode.next=head;
        head=newNode; 
    } 
    public void AddLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;

    }
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    } 
    public static void main(String args[]){
        head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=head;
        System.out.println(isCycle());
    }
}
