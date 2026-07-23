package LinkedList;

public class basik {
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
    public static int size;
public void addFirst(int data){////tc O(1)
   //step1 :Create a node
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;
    }
     
    //step2: newnode next=head
    newNode.next=head;
    //step3-head=newNode
    head=newNode;


}
public void addLast(int data){  ///O(1)
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;
    }
    //step1:created anew node above;
    //step: assign the tail next to newnode
    tail.next=newNode;
    tail=newNode;

}
public void  printll(){     //TC O(n)
    Node temp=head;
 while(temp!=null){
    System.out.print(temp.data+"-->");
    temp=temp.next;

 }
 System.out.println("null");


}
public void addMiddle(int idx,int data){
    if(idx==0){
        addFirst(data);
        return;
    }
Node newNode=new Node(data);
size++;
Node temp=head;
int i=0;
while(i<idx-1){
    temp=temp.next;
    i++;
}
newNode.next=temp.next;
temp.next=newNode;
}
public  int removeFirst(){
    if(size==0){
        System.out.print("LL is empty");
        return Integer.MIN_VALUE;
    }else if(size==1){
       int val= head.data;
       head=tail=null;
       return val;
    }
int val=head.data;
head=head.next;
size--;
return val;
}
public int removeLast(){
    if(size==0){
       System.out.println("LL is empty");
       return Integer.MIN_VALUE;

    }else if(size==1){
        int val=head.data;
        head=tail=null;
        size=0;
        return val;
    }
    Node prev=head;
    for(int i=0;i<size-2;i++){
        prev=prev.next;
    }
    int val=tail.data;
    prev.next=null;
    tail=prev;
    size--;
    return val;


}
    public static void main(String args[]){
      basik ll=new basik();
      ll.printll();
      ll.addFirst(1);
      ll.printll();
      ll.addFirst(2);
      ll.printll();
// ll.addMiddle(2, 9);
// ll.printll();
//       ll.addLast(3);
    //   ll.printll();
    //   ll.addLast(4);
    //   ll.printll();
    //   System.out.println(ll.size);
             ll.removeFirst();
             ll.printll();
             ll.removeLast();
             ll.printll();
             System.out.println(ll.size);



    }
}
