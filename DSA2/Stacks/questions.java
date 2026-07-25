
package Stacks;
import java.util.*;
public class questions{
   //1. Check if a linked list is a palindrome
    // static class  Node{

    //     int data;
    //     Node next;
    //      Node(int data){
    //         this.data=data;
    //         this.next=null;
    //     }
    // }
    // public static boolean isPallindrome(Node head){
    //     Node slow=head;
    //     boolean isPallindrome=true;
    //     Stack<Integer> s=new Stack<>();
    //     while(slow!=null){
    //         s.push(slow.data);
    //         slow=slow.next;

    //     }
    //     while(head!=null){
    //         int i=s.pop();
    //         if(head.data==i){
    //             isPallindrome=true;
    //         }else{
    //             isPallindrome=false;
    //             break;
    //         }
    //         head=head.next;
    //     }
    //     return isPallindrome;
    // } 
    // public static void main(String args[]){
    //     Node one=new Node(1);
    //     Node two=new Node(2);
    //     Node three=new Node(3);
    //     Node four=new Node(2);
    //     Node five=new Node(1);
    //     one.next=two;
    //     two.next=three;
    //     three.next=four;
    //     four.next=five;
    //     five.next=null;
    //     boolean condition=isPallindrome(one); 
    //     System.out.println(condition);
        

    // }
         // QUESTION 2: Simplify Path
    public static String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        String[] str = path.split("/");

        for (String i : str) {
            if (i.equals("") || i.equals(".")) {
                continue;
            } else if (i.equals("..")) {
                if (!s.isEmpty()) {
                    s.pop();
                }
                // no else here — if stack is empty, just do nothing
            } else {
                s.push(i);  // this is the missing case: real folder names
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String i : s) {
            sb.append("/").append(i);
        }

        return sb.length() == 0 ? "/" : sb.toString();
    }

    public static void main(String args[]) {
        System.out.println(simplifyPath("/apnacollege/"));   // /apnacollege
        System.out.println(simplifyPath("/a/.."));           // /
        System.out.println(simplifyPath("/a/./b/../../c/")); // /c
        System.out.println(simplifyPath("/../"));            // /
        System.out.println(simplifyPath("/home//foo/"));     // /home/foo
    }
 
}