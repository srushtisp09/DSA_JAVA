import java.util.*;
public class Pairsum2 {
//     public static boolean pairsum2(ArrayList<Integer> list,int target){
//        int lp;
//        int rp;
//         int bp=-1;
//         int n=list.size();
//         for(int i=0;i<list.size()-1;i++){

//     if(list.get(i)>list.get(i+1)){
//         bp=i;
//         break;
//     }
     
// }
//  lp=bp+1;
//  rp=bp;
// while(lp!=rp){
// if(list.get(lp)+list.get(rp)==target){
//     return true;
// }else if(list.get(lp)+list.get(rp)<target){
//     lp=(lp+1)%n;
// }
// else{
//     rp=(n+rp-1)%n;
// }
// }
// return false;
//     }
//more optimised code
public static boolean pairsum2(ArrayList<Integer> list,int target){
    int bp=-1;
    int lp;
    int rp;
    for(int i=0;i<list.size()-1;i++) {
        if(list.get(i)>list.get(i+1)){
            bp=i;
            break;
        }
    }
    lp=bp+1;
    rp=bp;
    int count=0;
    int n=list.size();
    while(count<n){
        if(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }else if(list.get(lp)+list.get(rp)<target){
                lp=(lp+1)%n;
            }else{
                rp=(n+rp-1)%n;
        }
 
    }
    count++;

    }
    return false;

} 

 public static void main(String args[]){
ArrayList<Integer> list=new ArrayList<>();
list.add(11);
list.add(15);
list.add(6);
list.add(8);
list.add(9);
list.add(10);
int target=16;
System.out.println(pairsum2(list, target));
    }
}
