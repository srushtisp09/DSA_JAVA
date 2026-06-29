package LinkedList;

 

public class search {
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
     public int iterativesearch(int key){  //o(n)
            Node temp=head;
            int i=0;
            while(temp!=null){
                if(temp.data==key){
                    return i;
                }
                temp=temp.next;
                i++;
            }
            return -1;
     }
     public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "-->");
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
        newNode.next=head;
        head=newNode;

    }
    // public int search(int key){

    // }
    public static void main(String args[]){

        search s=new search();
        s.print();
        s.addFirst(1);
        s.print();
        s.addFirst(2);
        s.print();

        s.addFirst(3);
        s.print();
        s.addFirst(4);
        s.print();
        s.addFirst(5);
        s.print();
        System.out.println(s.iterativesearch(1));
        System.out.println(s.iterativesearch(9));
         }
}
