 package LinkedList;

public class MergeSortLL {

    public class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next; // ✅ fixed
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        if (head1 != null) temp.next = head1;
        if (head2 != null) temp.next = head2;
        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) { 
                  return head;
        }
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        MergeSortLL list = new MergeSortLL();
        Node head = list.new Node(4);
        head.next = list.new Node(2);
        head.next.next = list.new Node(5);
        head.next.next.next = list.new Node(1);
        head.next.next.next.next = list.new Node(3);

        Node temp = head;
        while (temp != null) { System.out.print(temp.data + " -> "); temp = temp.next; }
        System.out.println("null");

        head = list.mergeSort(head);

        temp = head;
        while (temp != null) { System.out.print(temp.data + " -> "); temp = temp.next; }
        System.out.println("null");
    }
}
