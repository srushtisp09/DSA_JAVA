 ////day august 6 2026
 /// notes on merge linkedlist
 /// If you were to actually write this as real, working Java code (no comment symbols), it looks like this:

// java
// public class ListNode {
//     int val;
//     ListNode next;

//     ListNode() {}

//     ListNode(int val) {
//         this.val = val;
//     }

//     ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }
// }

// Let's break down what each part means:

// 1. Fields:

// java
// int val;
// ListNode next;

// Every node stores a value (val) and a pointer to the next node in the chain (next). If it's the last node, next is null.

// 2. Three constructors — this is called "constructor overloading." Java lets you define multiple ways to create an object, depending on what info you have at the time:

// java
// ListNode() {}

// Creates an empty node — val defaults to 0, next defaults to null. Useful when you want a node but will fill in the value later.

// java
// ListNode(int val) {
//     this.val = val;
// }

// Creates a node with just a value, no connection yet (next stays null). This is the one you used in your merge solution: new ListNode(-1).

// java
// ListNode(int val, ListNode next) {
//     this.val = val;
//     this.next = next;
// }

// Creates a node with both a value and an immediate connection to another node — handy for building a list quickly, e.g. new ListNode(1, new ListNode(2)) builds 1 → 2 in one line.

// Why this.val = val?

// Because the parameter and the field have the same name (val). this.val means "the field belonging to this object," while plain val means "the parameter I was just given." Without this., Java would get confused about which val you mean.

 