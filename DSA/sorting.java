// import java.util.Arrays;
// public class sorting {
//     // public static void bubbleSort(int arr[]){
//     //     for(int turn=0;turn<arr.length-1;turn++){
//     //         int swap=0;
//     //         for(int j=0;j<arr.length-1-turn;j++){
//     //             if(arr[j]>arr[j+1]){
//     //                 int temp=arr[j];
//     //                 arr[j]=arr[j+1];
//     //                 arr[j+1]=temp;
//     //                    swap++;
                
//     //             }
                
//     //         }
//     //          System.out.println("The total swaps are:"+swap);
//     //     }
//     // }
//     // public static void selectionSort(int arr[]){
//     //     for(int i=0;i<arr.length;i++){
//     //         int minPos=i;
//     //         for(int j=i+1;j<arr.length;j++){
//     //             if(arr[minPos]>arr[j]){
//     //                 minPos=j;
//     //             }
//     //         }
//     //         int temp=arr[minPos];
//     //         arr[minPos]=arr[i];
//     //         arr[i]=temp;
//     //     }
//     //     for(int i=0;i<=arr.length-1;i++){
//     //         System.out.print(arr[i]+" ");
//     //     }
//     // }

//     // public static void InsertionSort(int arr[]){
//     //     for(int i=1;i<arr.length;i++){
//     //         int curr=arr[i];
//     //         int prev=i-1;
//     //         while(prev>=0&&arr[prev]>curr){
//     //             arr[prev+1]=arr[prev];
//     //             prev--;
//     //         }
//     //         arr[prev+1]=curr;

//     //     }
//     // }
//     public static void countingSort(int arr[]){
//         int largest=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             largest=Math.max(largest,arr[i]);
//         }
// int count[]=new int[largest+1]; 
// for(int i=0;i<arr.length;i++){
//     count[arr[i]]++;
// }
// int j=0;
// for(int i=0;i<count.length;i++){
// while(count[i]>0){
//     arr[j]=i;
//     j++;
//     count[i]--;
// }
// }
//     }
//     public static void main(String args[]){
// int arr[]={4,5,1,3,2};
//   Arrays.sort(arr,0,5);
//  for(int i=0;i<=arr.length-1;i++){
//     System.out.print(arr[i]+" ");
//  }
// //  selectionSort(arr);
// // bubbleSort(arr);

//     }
// }
public class sorting{
    // public static void bubbleSort(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=0;j<arr.length-1-i;j++){
    //              if(arr[j]<arr[j+1]){
    //                  int temp=arr[j];
    //                  arr[j]=arr[j+1];
    //                  arr[j+1]=temp;
    // }
    //         }
    //     }

    // }
    // public static void selectionSort(int arr[]){
        
    //     for(int i=0;i<arr.length;i++){
    //          int minPos=i;
    //          for(int j=i+1;j<arr.length;j++){
    //             if(arr[minPos]>arr[j]){
    //                  minPos=j;
    //             }
    //          }
    //          int temp=arr[minPos];
    //          arr[minPos]=arr[i];
    //          arr[i]=temp;
    //     }

    // }
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while(prev>=0&&arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;


        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
int arr[]={3,6,2,1,8,7,4,5,3,1};
// bubbleSort(arr);
// selectionSort(arr);
insertionSort(arr);
printArray(arr);
    }
}