public class GridWays {
//    public static int gridWays(int i,int j,int n,int m){
//     if(i==n-1 && j==m-1){
//         return 1;
//     }else if(i==n || j==m){
//         return 0;
//     }
//     int w1=gridWays(i+1,j,n,m);///down
//     int w2=gridWays(i,j+1,n,m);//right
//     return w1+w2;


//    } 
//    public static void main(String args[]){
//     int n=3;
//    int m=3;
//    System.out.println(gridWays(0,0,3,3));
// //Time complexity is O(2^n+m)
// // To make it into linear complexity 
//    }


// SOLUTION WITH O(N+m) TC 
// WE USE COMBINATION  OVER HERE
public static long factorial(int num){
    long result=1;
    for(int i=2;i<=num;i++){
        result*=i;
    }
    return result;
}
public static long gridWays(int n,int m){  
int total=n+m-2;
int choose=n-1;
return (factorial(total)/(factorial(choose)*factorial(total-choose)));

}
public static void main(String args[]){
    int n=3;
    int m=3;
    System.out.println(gridWays(n,m));
}
}
