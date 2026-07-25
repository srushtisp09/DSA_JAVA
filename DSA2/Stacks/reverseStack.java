package Stacks;
import java.util.*;

 
public class reverseStack{
    public static void pushAtBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtBottom(s,data);
        s.push(top);

    }
    public static void reverseStack(Stack<Integer> s){
if(s.isEmpty()){
    return;
}
int top=s.pop();
reverseStack(s);
pushAtBottom(s,top);
    }
    public static void printStack(Stack<Integer> s){

    }
    public static void main(String args[]){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverseStack(s);    
        printStack(s);
    }
}

//"To reverse a stack without extra data structures, I use two recursive functions.
//  reverseStack pops the top element, recursively calls itself on the remaining stack until it's empty —
//  that's the base case — and then, as each call returns, it inserts its own popped element at the bottom of the now-smaller
//  reversed stack using a helper, pushAtBottom. pushAtBottom does the same recursive pattern: pop everything until empty, 
// insert the new element there since that's now the bottom, and then as it returns, push each popped element back on top in order. 
// The combination means the first element popped by reverseStack — the original top — 
// ends up at the very bottom, and elements end up in reverse order. Time complexity is O(n²) 
// since pushAtBottom does O(n) work inside an O(n) recursion.
//  Space is O(n) for the call stack, but no extra array or stack is declared, 
// which is what the question is really testing."