package LinkedList;

public class ReverseLL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        } 
     
    }
    public static Node head;
    public static Node tail;
    public static void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
             return;
        }
        newNode.next=head;
        head=newNode;
    }
    public static void addLast(int data){
        Node newNode =new Node(data);
        if(head==null){
            head=tail=newNode;
return;
        }
         tail.next=newNode;
         newNode=tail;
    }
    public void  print()
    {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;


        }
        System.out.println("null");
    }
    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String args[]){
        ReverseLL ll=new ReverseLL();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(9);
        ll.print();
        ll.reverse();
        ll.print();

    }
}
