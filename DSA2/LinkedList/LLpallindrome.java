package LinkedList;

public   class LLpallindrome {
    public static  class Node{
        int data;
        Node next;
        public  Node(int  data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public  void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }  
        tail.next=newNode;
        newNode=tail;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println();
    }
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        } 
        return slow;
    }
    public boolean checkpallindrome(){
        if(head==null||head.next==null){
            return true;

        }
        //step1 find mid
        Node midNode=findMid(head);
        //step 2 reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

      Node right=prev;
      ///right half head 
      Node left=head;
      //step 3 check left half is equla to right half
      while(right!=null){
        if(left.data!=right.data){
            return false;
        }
        left=left.next;
        right=right.next;
      }
return true;

    }
    public static void main(String args[]){
        LLpallindrome LL=new LLpallindrome();
        LL.print();
        LL.addFirst(2);
        LL.print();
        LL.addFirst(2);
        LL.print();
        LL.addLast(2);
        LL.print();
        LL.addLast(2);
        LL.print();
        System.out.println(LL.checkpallindrome());



    }
}
