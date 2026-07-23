public class Recursion {
    // public static void  printdec(int n){
       //problem 1
    //     if(n==1){
    //         System.out.print(n);
    //         return;
    //     }
    //     System.out.print(n+" ");
    //     printdec(n-1);
    // }
    //problem 2
    // public static void printIncreasing(int n){
    //     if(n==1){
    //         System.out.print(n+" ");
    //         return;
    //     }
    //     printIncreasing(n-1);
    //     System.out.print(n+" ");
    // }
    //problem 3
//   public static int factorial(int n){
//     if(n==1){
    //         System.out.print(n+" ");
    //         return;
    //     }
    //     printIncreasing(n-1);
    //     System.out.print(n+" ");
//problem 4
// public static int sumofn(int n){
//     if(n==1){
//         return 1;
//     }
//     int  sumofnm1=sumofn(n-1);
//     int sumn=n+sumofn(n-1);
//     return sumn;
// }
//problem 5
// public static int fib(int n){
//     if(n==1||n==0){
//         return n;
//     }
//     int fnm1=fib(n-1);
//     int fnm2=fib(n-2);
//     int fn=fnm1+fnm2;
//     return fn;
// }
//problem 6
// public static boolean sortedArray(int arr[],int i){
//     if(i==arr.length-1){
//   
// }       return true;
//     }
// if(arr[i]>arr[i+1]){
//     return false;
// }
//  return sortedArray(arr, i+1);
//problem 7
// public static int firstOccurence(int arr[],int key,int i){
//     if(i==arr.length){
//         return -1;
//     }
//     if(arr[i]==key){
//         return i;
//     }
//    return firstOccurence(arr,key, i+1);

    

// }
//problem 8
//last occurence
// public static int lastOccurence(int arr[],int key,int i){
//     if(i==arr.length){
//         return -1;
//     }
//     int isFound=lastOccurence(arr,key,i+1);
//     if(isFound==-1&&arr[i]==key){
//         return i;
//     }
// return isFound;

// }
//problem 9
// public static int power(int x,int n){
//     if(n==0){
//         return  1;
//     }
//     // int  xnm1=power(x,n-1);
//     // int xn=x*xnm1;
//     // return xn;
// //using variables
// return x*power(x,n-1);

// }
public static int optimizepow(int x,int n){
    if(n==0){
        return 1;
    }
    int halfsq=optimizepow(x,n/2) ;
    int halfpowsq=halfsq*halfsq;
    if(n%2!=0){
        halfpowsq=x*halfpowsq;

    }
    return halfpowsq;
}
    public static void main(String args[]){
        // int arr[]={8,3,6,9,5,10,2,5,3};
        //  int arr[]={2,3,2,4,5,6,3,5};
        //  System.out.println( lastOccurence(arr, 5, 0));
        // printdec(n);
        // printIncreasing(n);
    //    System.out.println(factorial(5));
// System.out.println(sortedArray(arr,0));
//    System.out.println(fib(25));
    // System.out.println(sumofn(5));
    int x=2;
    int n=10;
    System.out.println(optimizepow(2,10));
}
}
//until the base case is reached, 
// the recursive calls keep happening and
//  the rest of the statements in
//  that function are paused.
