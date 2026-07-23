 public class SingleOne{
    public static int SingleOne(int nums[]){
        int result=0;
        for(int i=0;i<nums.length;i++){
            result^=nums[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[]={2,2,1,4,5,3,4,5,1};
         System.out.println(SingleOne(nums));
    }
 }