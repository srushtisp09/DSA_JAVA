package LinkedList;

public class linkedlist {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("null");

    }

    public void addmiddle(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;

        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return -1;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        } else {
            int value = head.data;
            head = head.next;
            size--;
            return value;
        }
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return -1;
        } else if (size == 1) {
            int value = head.data;
            head = tail = null;
            size = 0;
            return value;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int value = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return value;

    }

    public static int search(int key) {
        int i = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recursiveSearch(int key) {
        return helper(head, key);

    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String args[]) {
        linkedlist ll = new linkedlist();

        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(3);
        ll.print();

        ll.addLast(4);
        ll.print();
        ll.addmiddle(2, 5);
        ll.print();

        // System.out.println(size);
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.search(3));
        // System.out.println("The index is:");
        // System.out.println(ll.recursiveSearch(5));
        ll.reverse();
        ll.print();

    }

}
