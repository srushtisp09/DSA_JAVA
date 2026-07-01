package Stacks;
import java.util.*;
public class nextgreaterelement {
    
    public static void main(String args[]){
        int arr[]={6,8,0,1,3};
        Stack<Integer> s= new Stack<>();
        int nextGreater[]=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&& arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }else{
                nextGreater[i]=arr[s.peek()];
            }
            s.push(i);
        }
        for(int i=0;i<nextGreater.length;i++){
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
    }
}
//this question can be asked in different ways 
//1.nextGreater element towards right
//2.nextGreater element towards left
//3.next Smaller element towards right
//4.next Smaller element towards left    
////we have solved this nextGreateer elemnt towards right,
/// if the question is asked to find the nextGreater element towards left then 
// just change the for loop to start from 0 to
//  arr.length-1 and change the while condition to arr[s.peek()]>=arr[i] 
// package Stacks;
// import java.util.*;
// public class nextgreaterelement {
//     public static void nextGreater(){

//     }
//     public static void main(String args[]){
//         int arr[]={6,8,0,1,3};
//         Stack<Integer> s= new Stack<>();
//         int nextGreater[]=new int[arr.length];
//         for(int i=0;i<arr.length-1;i++){
//             while(!s.isEmpty()&& arr[s.peek()]<=arr[i]){
//                 s.pop();
//             }
//             if(s.isEmpty()){
//                 nextGreater[i]=-1;
//             }else{
//                 nextGreater[i]=arr[s.peek()];
//             }
//             s.push(i);
//         }
//         for(int i=0;i<nextGreater.length;i++){
//             System.out.print(nextGreater[i]+" ");
//         }
//         System.out.println();
//     }
// }
//"The problem asks us to build a nextGreater array, where each position holds the nearest greater element to its right, or -1 if none exists. I use a stack to track potential candidates efficiently.
// I traverse the array right to left, because 'next greater' looks to the right — going backward means 
// everything to the right of the current index has already been processed and is available in the stack.
// At each index i, I run a while loop: as long as the stack isn't empty and the value at the top of the 
// stack is less than or equal to arr[i], I pop it — because that value can never be anyone's next-greater-element
//  once something bigger than it (arr[i]) has shown up.
// After the loop, if the stack is now empty, there's no valid candidate, 
// so nextGreater[i] = -1. Otherwise, whatever's left on top is the answer, so nextGreater[i] = arr[s.peek()].
// Finally, I push the current index i onto the stack, so elements further to the left can consider it as their own candidate.
// This runs in O(n) time overall — even though there's a nested while loop, 
// each element is pushed once and popped at most once across the entire run, so the total work stays linear. Space is O(n) for the stack."