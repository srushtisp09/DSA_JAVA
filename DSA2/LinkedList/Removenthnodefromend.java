package LinkedList;

public class Removenthnodefromend {
    //the question follows iterative approach 
    ///classical question imp for interview
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
    // public static int size;

    public void print(){
        if(head==null){
            System.out.println("empty ");
            return;

        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
             
        }
        // size++;
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        } 
        // size++;
        tail.next=newNode;
        tail=newNode;
    }
    public void deleteNthnodeend(int n){
        //calculate size;
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            head=head.next;
            return;
           
        }
        int i=1;
        int iTofind=size-n;
        Node prev=head;
        while(i<iTofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }
    public static void main(String args[]){
       Removenthnodefromend N=new Removenthnodefromend(); 
       N.print();
       N.addFirst(4);
       N.print();
       N.addFirst(2);
       N.print();
       N.addFirst(3);
        N.print();
        N.addLast(5);
        N.print();
        // System.out.println(size);

       N.deleteNthnodeend(1);
        N.print();
            }
    
 }
