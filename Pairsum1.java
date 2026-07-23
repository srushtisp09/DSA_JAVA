import java.util.*;
public class Pairsum1 {
    //Brute force approach
    // public static boolean pairsum1(ArrayList<Integer> list,int target){
    //     for(int i=0;i<list.size();i++){
    //         for(int j=i+1;j<list.size();j++){
    //             if(list.get(i)+list.get(j)==target){
    //                 return true;
    //             }
                
    //         }
    //     }
    //     return false;
    // }
    //Two pointer approach
    public static boolean twopointer(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
             if(list.get(lp)+list.get(rp)==target){
                return true;
                
             }else if(list.get(lp)+list.get(rp)<target){
                lp++;
             }else{
                rp--;
             }
              
            
        }
        return false;
    } 
    public static void main(String args[]){
ArrayList<Integer> list=new ArrayList<>();
int target=3;
list.add(1);

list.add(2);
list.add(3);
list.add(4);
list.add(5);
list.add(6);
//  System.out.println(pairsum1(list,5));
System.out.println(twopointer(list, target));
    }
}
