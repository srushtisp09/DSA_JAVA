public class Stringcompression {
    public static String compress(String str){
    //     String newstr="";
    //     for(int i=0;i<str.length();i++){
    //         Integer count=1;
    //         while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
    //             count++;
    //             i++;
               
    //         }
    //           newstr+=str.charAt(i);
    //             if(count>1){
    //                 newstr+=count.toString();
    //             }

    //     }
    //     return newstr;
    // }
    //using string builder
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<str.length()-1;i++){
       int count=1;
        while(i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
            count++;
            i++;
        }
        sb.append(str.charAt(i));
        if(count>1){
            sb.append(count);

        }
         
    }
      return sb.toString();  
}
public static void main(String args[]){
        String str="aaaabbbcccddd";
        // System.out.println(compress(str));
        System.out.println( compress(str));
     }
}
