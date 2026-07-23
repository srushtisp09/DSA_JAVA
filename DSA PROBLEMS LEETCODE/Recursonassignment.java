public class Recursonassignment {
    // public static void occurences(int arr[],int key,int idx){
    //     if(idx==arr.length){
    //         return ; 
    //     }
    //     if(arr[idx]==key){
    //         System.out.print(idx);
    //     }
    //     occurences(arr, key, idx+1);
    // }
     static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};

    public static void string(int n){
        if(n==0){
            return;
        }
        int lastdigit=n%10;
        string(n/10);
        System.out.print(digits[lastdigit]+" ");

    }
//  public static int length(String str){
//     if(str.length()==0){
//         return 0;
//     }
//     return length(str.substring(1))+1;

//  }        
   public static int count(String s){
    if(s.length()==0){
        return 0;
    }
    int countCurr=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(0)==s.charAt(i)){
            countCurr++;
        }

    }
    return countCurr+count(s.substring(1));
   }
    public static void main(String args[]) {
        // int arr[]={3, 2, 4, 5, 6, 2, 7, 2, 2};
        // int key=2;
        // int idx=0;
        // occurences(arr, key, idx);
        // string(1970);
        // String str="abcde";
        String str="abcda";
        System.out.println(count( str));
        // System.out.println(length( str));
    }
}
