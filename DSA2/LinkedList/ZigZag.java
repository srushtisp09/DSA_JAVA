 package LinkedList;

public class ZigZag {

    // ✅ static Node — can be accessed from static main
    public static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    public void zigzag() {
        // find mid
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while (curr != null) {
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
        }

        // alternate merge
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        while (left != null && right != null) {
            nextL = left.next;
            nextR = right.next;
            left.next = right;
            right.next = nextL;
            left = nextL;
            right = nextR;
        }
    }

    public static void main(String args[]) {
        // ✅ Use YOUR ZigZag class, not java.util.LinkedList
        ZigZag ll = new ZigZag();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        System.out.print("Before: ");
        print(ll.head);         // ✅ static method called correctly

        ll.zigzag();

        System.out.print("After:  ");
        print(ll.head);
    }
}