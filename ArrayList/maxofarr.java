import java.util.*;
public class maxofarr {
    public static void main(String args[]){
            int max=Integer.MIN_VALUE;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);  
     
        for(int i=0;i<=list.size()-1;i++){
if(list.get(i)>max){
    max=list.get(i);

}
        }
        System.out.println(max);
            
}
    }
 
