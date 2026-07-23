public class divideandconquer {
    public static void mergesort(int arr[],int  si,int ei){
 if(si>=ei){
    return;
 }
        int mid=si+(ei-si)/2; //finding middle element
mergesort(arr,si,mid);        //sort left part
mergesort(arr,mid+1,ei);        //sort right part
merge(arr, si, mid,ei);         //merge both halves
 




    }
    public static void merge(int arr[],int si,int mid,int ei){
        //left [0 3] and right[4 6] 6-0+1//like a method to create the arr
        int temp[]=new int[ ei+1];//temp arr to store sorted elements 
        int i=si;//iteratir for i; left part

        int j=mid+1;//iterator for j right part
        int k=0;//iterstor for temp arr
        while(i<=mid&&j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++ ;
            }else{
                temp[k]=arr[j];
                j++ ;
            }
            k++;
        }
        //left
        while(i<=mid ){
            temp[k++]=arr[i++];
        }
        //right paart
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
         arr[i]=temp[k];
        }
 
 }
    
    public static void printarr(int arr[]){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    } 
    public static void main(String args[]){
int arr[]={6,3,9,5,2,8,};
mergesort( arr, 0,arr.length-1);
printarr(arr);
    }
 }