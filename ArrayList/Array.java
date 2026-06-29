import java.util.ArrayList; 
public class Array {
 
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        int element=list.get(3);
        list.remove(3);
        System.out.println(list);
        list.set(2,8);
        System.out.println(list); 
        System.out.println(element);
         System.out.println(list.contains(2));
         System.out.println(list.size());
         }
}
