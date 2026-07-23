public class shortestpath {
    public static  float shortestpath(String path){
        int X1=0;
        int Y1=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            if(dir=='S'){
                Y1--;
            }else if(dir=='N'){
                Y1++;
            }
            else if(dir=='E'){
                X1++;
            }else{
                X1--;
            }
        }
        int X2=X1*X1;
        int Y2=Y1*Y1;
        return (float)Math.sqrt(X2+Y2);

    }
    public static void main(String args[]){
        String path="WNEENESENNN";
        System.out.println(shortestpath(path));
    }
}
