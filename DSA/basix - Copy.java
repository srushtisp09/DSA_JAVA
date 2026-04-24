 public class basix{
    // public static  int linearSearch(int marks[],int target){
      
    //      System.out.println("Enter the target:");
         
    //     for(int i=0;i<marks.length;i++){
    //         if(marks[i]==target){
    //              return i;
                
    //         }
    //     }
    //     return -1;
    // }
    // public static void largestSmallest(int marks[]){
    //     int largest=Integer.MIN_VALUE;
    //     int smallest=Integer.MAX_VALUE;
    // for(int i=0;i<marks.length;i++){
    //     if(largest<marks[i]){
    //         largest=marks[i];   
    //     }if(smallest> marks[i]){
    //         smallest=marks[i];
    //     }
    // }
    // System.out.println("Largest number is : "+largest); 
    // System.out.println("Smallest number is :"+smallest);
    // }
// public static  int BinarySearch(int numbers[],int key){
// int start=0,end=numbers.length-1;
// while(start<=end){
//     int mid=(start+end)/2;
//     if(numbers[mid]==key){
//         return mid;
//     }
//     if(numbers[mid]<key){
//        start=mid+1;
//     }else{
//         end=mid-1;
//     }
// }
// return -1;
// }
// public static void reverseArray(int numbers[]){
//     int first=0;
//     int last=numbers.length-1;
//     while(first<last){
//         int temp=numbers[last];
//         numbers[last]=numbers[first];
//         numbers[first]=temp;
//         first++;
//         last--;

//     }

// } 
//  public static void subarrays(int numbers[]){
//  for(int i=0;i<=numbers.length-1;i++){
//     for(int j=i;j<=numbers.length-1;j++){
//         for(int k=i;k<=j;k++){
//             System.out.print(numbers[k]+" " );
//         }
//          System.out.println();   
//      }
//       System.out.println(); 
//  }
 

//  }
//  public static void bruteForce(int numbers[]){
//     int maxSum= Integer.MIN_VALUE;
//     for(int i=0;i<numbers.length;i++){
        
//         for(int j=i;j<numbers.length;j++){
//             int currSum=0;
//             for(int k=i;k<=j;k++){
//                 currSum+=numbers[k];
//             }
//             System.out.println( currSum);
// if(maxSum<currSum){
//     maxSum=currSum;
// }
//         }
//     }
//     System.out.println(maxSum);
//  }

//  public static void prefixSum(int numbers[]){
//     int maxSum=Integer.MIN_VALUE;
//     int prefix[]=new int[numbers.length];
//     prefix[0]=numbers[0];
//     for(int i=1;i<numbers.length;i++){
//         prefix[i]=prefix[i-1]+numbers[i];

//     }
//     for(int i=0;i<numbers.length;i++){
//         int start=i;
//         int currSum=0;
//         for(int j=i;j<numbers.length;j++){
//             int end=j;
// currSum=start==0? prefix[end]:prefix[end]-prefix[start-1];
// System.out.println(currSum);
// if(maxSum<currSum){
//     maxSum=currSum;
// }
//         }
//     }
// System.out.println(maxSum);
//  }
// public static void kadanes(int numbers[]){
//     int ms=Integer.MIN_VALUE;
//     int cs=0;
     

//     for(int i=0;i<numbers.length;i++){
//         if(numbers[i]<0){
//              cs=Math.max(numbers[i],cs+numbers[i]);
//              ms=Math.max(ms,cs);
//         }
    
         
        // cs+=numbers[i];


        // if(cs<0){
        //     cs=0;

        // }
        // ms=Math.max(cs,ms);
//     }
//          System.out.println("The minimum sum is "+ms);
//     // System.out.println("Our maxsum is"+ms);
// }


public static   void kadanes(int numbers[]){
    int cs=numbers[0];
    int ms=numbers[0];
    for(int i=1;i<numbers.length;i++){
        cs=Math.max(numbers[i],cs+numbers[i]);
        ms=Math.max(ms,cs);
    }
     System.out.print(ms);
}
    public static void main(String[] args){
    //     int marks[]={ 2,3,4,5,6,7,8,9};
    //       Scanner sc= new Scanner(System.in);
    //      System.out.println("Enter the target:");
    //     int target=sc.nextInt();
    //  int index=linearSearch(marks,target);
    //    if(index==-1){
    //     System.out.println("Not found");
    //    }else{
    //     System.out.println("Key is at index:"+index);
    //    }
///LARGEST IN AN ARRAY/
//  int marks[]={1,2,3,4,5,6,7,8,9};
//   largestSmallest(marks);
//   int numbers[]={2,4,5,6,7,8,9};
//   int key=8;
//   System.out.println("Index is:"+ BinarySearch(numbers,key));
// int numbers[]={2,3,4,5,6,7,8};
// reverseArray(numbers);
// for(int i=0;i<numbers.length;i++){
// System.out.print(numbers[i]+" ");
//  }
//  System.out.println();
// int numbers[]={2,4,6,8,10};
// pairs(numbers);
// int numbers[]={2,4,6,8,10};
// subarrays(numbers);
int numbers[]={ 1,-2,6,1,-3};
    kadanes(numbers); 
 
     }
 }
 