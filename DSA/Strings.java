public class Strings {
    //to print all letters
    // public static void printLetters( String str){
    //     for(int i=0;i<str.length();i++){
    //         System.out.print(str.charAt(i));
    //     }
    // }
// public static boolean pallindrome(String str){
//     for(int i=0;i<str.length()/2;i++){
//         int n=str.length();
//         if(str.charAt(i)!=str.charAt(n-1-i)){
//             return false;
//         }

//     }
//     return true;
// }  

    public static void main(String args[]){
        // char arr[]={'a','b','c','d'};
        // String str="abcd";
        // String str1=new String("xyz");
//Strings are immutable IMMUTABLE  immutable means u cannot modify the strig once declared if u want to do so then u will 
// //have to create a new strnig 
// Scanner sc=new Scanner(System.in);
// String name=sc.next();
//next is used only for one line 
//if u want to input  many words then use nextLine
//String is a class in java which has a special function associated with that is length(
//length here is a function while length in arrays its a property 
//spaces also get counted in length

// String name;
// name=sc.nextLine();
// System.out.println(name);
// String fullName="Tony Stark";
// System.out.println(fullName.length());
// String firstName="Shradha";
// String lastName="Khapra";
// String fullname=firstName+" "+lastName;
// System.out.println(fullname.charAt(1));
//to print every leter use charAt() fullname.charAt(index)
// String  str="Srushti pattanshetti";
// printLetters(str);
// String str="noon";
// System.out.println(pallindrome(str));
// In Java, comparison at the object level means checking whether two variables refer to the exact same instance in memory, rather than comparing the internal values (fields) of those objects. 
//so to compare use .equals like s1.equalss2
 String str="Shraddhadidi";
 String str1="Apna college";
 String str2="Shraddhadidi";
System.out.println(str.equals(str1)+" "+str.equals(str2));
    }
}
