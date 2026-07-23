 import java.util.*; 
 public class arrays{
    public static int binarySearch(int arr[],int target){
         int start=0;
         int end=arr.length-1;
         while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
            
         }   
         return -1;
         }
    public static void main(String args[]){
        int arr[]={3,5,6,2,8,4,2};
 Arrays.sort(arr);
        System.out.println(binarySearch(arr,2));
    }
 }