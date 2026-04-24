public class sortdutch {
     public static void dutchflag(int num[])

    {   //THere are three ways 1.bruteforce approach which has o(nlogn)
        //and then optimised appreoach which has better time complexity than bruteforce
        
        // optimised approach TC O(nlog n)ans O(1) Sc
        // int count1=0;
        // int count2=0;
        // int count3=0;
        // for(int i=0;i<=num.length-1;i++){
        //     if(num[i]==0){
        //         count1++;
        //     }
        //     else if(num[i]==1){
        //         count2++;
        //     }else{
        //         count3++;
        //     }
        // }
        // int index=0;
        // while(count1-->0){
        //     num[index++]=0;
        // }
        // while(count2-->0){
        //     num[index++]=1;
        // }
        // while(count3-->0){
        //     num[index++]=2;
        // }
        // for(int i=0;i<=num.length-1;i++){
        //     System.out.print(num[i]+ " ");
        // }
 int n=num.length;
int low=0;
int mid=0;
int high=n-1;
while(mid<=high){
    switch(num[mid]){
        case 0:
            int temp0=num[low];
            num[low]=num[mid];
            num[mid]=temp0;
            low++;
            mid++;
            break;
        case 1:
            mid++;
            break;
        case 2:
            int temp1=num[mid];
            num[mid]=num[high];
            num[high]=temp1;
            high--;
            break;    

    }
     }
}
  public static void main(String args[]){
int num[]={2,0,2,1,1,0};
dutchflag(num);
for(int i=0;i<num.length;i++){
System.out.print(num[i]+" ");
}
    } 
    }

    
   
 
