 public class toh{
     public static void toh(int n, String src, String dest, String helper) {
    if (n == 1) {
        System.out.println("Move disk 1 from " + src + " to " + dest);
        return;
    }
    toh(n-1, src, helper, dest);   // move top n-1 disks: src → helper
    System.out.println("Move disk " + n + " from " + src + " to " + dest);
    toh(n-1, helper, dest, src);   // move n-1 disks: helper → dest
}
public static void main(String args[]){
    toh(3,"S","D","H");
}
 }
