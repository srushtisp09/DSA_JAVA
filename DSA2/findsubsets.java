public class findsubsets {
    public static void findSubsets(String str,int i,String ans){
        if(i==str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
         
        findSubsets(str,i+1,ans+str.charAt(i));
         findSubsets(str, i+1, ans);
    }

   //Using String BUilder
   public static void findSubsets1(String str1,int i,StringBuilder ans){
    if(i==str1.length()){
        if(ans.length()==0){
            System.out.println("null");
        }else{
            System.out.println(ans);
        }
        return;
    }
    ans.append(str1.charAt(i));
    findSubsets1(str1,i+1,ans);
    ans.deleteCharAt(ans.length()-1);
    findSubsets1(str1,i+1,ans);
   }
    public static void main(String args[]){
        String str="abc";
        findSubsets(str, 0, "");
        String str1="ab";
        findSubsets1(str1,0,new StringBuilder());
    }
    
     
}
