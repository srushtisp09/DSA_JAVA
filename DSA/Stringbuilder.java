public class Stringbuilder {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder();
      for(char ch='a';ch<='z';ch++){
        sb.append(ch);
      }
      //o(26)
      //if u are using a string and hen appending the letters to that thenn
      //time complexity will be 0(m*n)
      
      System.out.println(sb);
    }
}
