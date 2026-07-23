public class friends {
    public static int freindspairing(int n){
       if(n==1||n==2){
        return n;
       }
       int fnm1=freindspairing(n-1);
       int fnm2=freindspairing(n-2);
       int pairways=(n-1)*fnm2;
       return pairways;

 
    }
    public static void main(String args[]){
        System.out.println(freindspairing(3));
    }
}
