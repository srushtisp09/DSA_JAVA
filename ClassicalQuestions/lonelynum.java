import java.util.*;
public class lonelynum {
    public ArrayList<Integer> findLoneley(ArrayList<Integer> nums){
        Collections.sort(nums);
        for(int i=0;i<nums.size()-2;i++){
            if(nums.get(i-1)+1 <nums.get(i) &&nums.get(i)+1<nums.get(i+1)){
                list.add(nums.get(i));
            }
        }
        if(nums.size()==1){
            list.add(nums.get(0));
        }
        if(nums.size()>1){
            if(nums.get(0)+1<nums.get(1)){
                list.add(nums.get(0));
            }
            if(nums.get(nums.size()-2)+1<nums.get(nums.size()-1)){
                list.add(nums.get(nums.size()-1));
            }
        }
        return list;
    } 
    public static void main(String args[]){
ArrayList<Integer> list=new ArrayList<>();
list.add(1);
list.add(2);
list.add(7);
list.add(6);
    }
}
