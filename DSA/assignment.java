public class assignment{
    // public static boolean valueAppears(int numbers[]){
    //     int n=numbers.length;
    //  Arrays.sort(numbers);
    //   for(int i=1;i<n;i++){
    //     if(numbers[i]==numbers[i-1]){
    //         return true;  
    //     }
    //   }  
    //   return false;
    // }
    // public static void main(String args[]){
    //     int numbers[]={1,2,3,1};
    //     System.out.println(valueAppears(numbers));
    // }
//     public static int rotatedArray(int nums[],int target){
//         int left=0,right=nums.length-1;
//         while(left<=right){
//             int mid=left+(right-left)/2;
//             if(nums[mid]==target){
//                 return mid;
//             }
//             if(nums[left]<= nums[mid]){
//                 if(target>=nums[left]&&target<=nums[mid]){
//                     right=mid-1;
//                 }else{
//                     left=mid+1;
//                 }
//              }
//              else{
//                 if(target<=nums[right]&&target>nums[mid]){
//                     left=mid+1;
//                 }else{
//                     right=mid-1;
//                 }
//              }
//         }
// return -1;
//     }  
//     public static void main(String arsg[]){
// int nums[]={4,5,6,7,0,1,2};
// int target=0;
// System.out.println(rotatedArray(nums,target));
// 

// two sum
// public static  boolean TwoSums(int nums[],int target){
//     Arrays.sort(nums);
//     int n=nums.length;
//     int left=0;
//     int right=n-1;
// while(left<right){
//     int sum=nums[left]+nums[right];
//     if(sum==target){
//         System.out.println("Pairs found :"+  nums[left]+ "+" + nums[right]+  "=" + target );
//         return true;
//     }else if(sum<target){
//         left++;
//     }else{
//         right--;
//     }
// }
// System.out.println("No pairs found");
// return false;
// }
// public static void main(String args[]){
//     int nums[]={2,7,11,15};
//     int target=9;
//     TwoSums(nums,target);
// }
// Triplets
// public static void Triplets(int nums[]){
//     for(int i=0;i<nums.length;i++){
//        for(int j=i+1;j<nums.length;j++){
//         for(int k=j+1;k<nums.length;k++){
//             if(nums[i]+nums[j]+nums[k]=0){
//                 System.out.println("("+nums[i]+","+)
//             }
//         }
//        }
//     }

// }
// public static void main(String ags[]){
//     int nums[]=[-1,0,1,2,-1,-4];
//     Triplets(nums);
// }
// public static void triplets(int nums[]){
//     Arrays.sort(nums);
//     int n=nums.length;
//     for(int i=1;i<=nums.length-2;i++){
//         if(i>0&&nums[i]==nums[i-1])continue;
//         int left=i+1;  
//         int right=n-1;
//         while(left<right){
//             int sum=nums[i]+nums[left]+nums[right];
//             if(sum==0){
//               System.out.println(nums[i] + " " + nums[left] + " " + nums[right]);
//              while (left < right && nums[left] == nums[left + 1]) left++;
//               while (left < right && nums[right] == nums[right - 1]) right--;

//                     left++;
//                     right--;
//             }else if(sum<0){
//                 left++;
//             }else{
//                 right--;
//             }
               
//         }
        
//         }
//     }
//     public static void main(String args[]){
// int nums[]={-1,0,1,2,-1,-4};
// triplets(nums);

// }
//  public static int majorityElement(int nums[]){
//     int candidate=0;
//     int count=0;
//     for(int i=0;i<nums.length;i++){
//         if(count==0){
//             candidate=nums[i];

//         }
//         count+=(nums[i]==candidate)?1:-1;

//     }
//     return candidate;
//  }
// public static void main(String args[]){
//  int nums[]={1,2,2,2,1,1,2,2,2};
//  System.err.println(majorityElement(nums)); 
// }
///MERGE THE ARRAYS
/// 
//   public static  void mergeArrays(int nums1[],int m,int nums2[],int n){
//     int i=m-1;
//     int j=n-1;
//     int k=m+n-1;
//     while(i>=0&&j>=0){
//         if(nums1[i]>nums2[j]){
//             nums1[k--]=nums1[i--];
//         }else  {
//             nums1[k--]=nums2[j--];
//         }
//     }
// while(j>=0){
//     nums1[k--]=nums2[j--];
// }
// public static int numbersseven(int matrixs[][]){
//     int count=0;
//     for(int i=0;i<=matrixs.length-1;i++){
 
// for(int  j=0;j<=matrixs[0].length-1;j++){
//     if(matrixs[i][j]==7){
//         count++;

//     }
// }
//     } 
//     return count;
// }
//   }
// public static int sumrow(int matrixs[][]){
// int sum=0;
// for (int i = 0; i < matrixs.length; i++) {
//     for(int j=0;j<matrixs[0].length;j++){
//         if(i==1){
//             sum+= matrixs[i][j]; 
//         }
//     }
    
// }
// return sum;
// }
public static void transpose(int matrixs[][])

{
    
}
public static void main(String args[]){
// int nums1[]={1,2,3,0,0,0};
// int nums2[]={2,5,6};
// mergeArrays(nums1,3,nums2,3);
// System.out.println(java.util.Arrays.toString(nums1));
int matrixs[][]={{1,4,9},{1,4,3},{2,2,3}};
 
    System.out.println(  sumrow(matrixs))
;
}
}
 



  