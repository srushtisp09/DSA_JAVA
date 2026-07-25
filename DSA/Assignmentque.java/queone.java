 
import java.util.*;
public class queone {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the real and imaginary part  of first complex ");
float a=sc.nextFloat();
float b=sc.nextFloat();
queone c1=new queone(a,b); 
System.out.println("Enter real and imaginary part of second complex");
float x=sc.nextFloat();
float y=sc.nextFloat();
queone c2=new queone(x,y);
 
queone sum=c1.add(c2);
queone diff=c1.subtract(c2);
queone prod=c1.multiply(c2);
System.out.println("Sum: ");
sum.display();
System.out.println("Difference : ");
diff.display();
System.out.println("Multiply");
 prod.display();

    } 
}
class queone{
    float real;
    float imag;
   queone(float r,float i){
        real=r;
        imag=i;
    }
   queone add(queone c){
        return new queone(this.real+c.real,this.imag+c.imag);
    }
   queone multiply(queone c){
        float r=this.real*c.real-this.imag*c.imag;
        float i=this.real*c.imag+this.imag*c.real;
        return new queone(r,i);
    }
    queone subtract(queone c){
        return new queone(this.real-c.real,this.imag-c.imag);
    }
    void display(){
        if(imag>=0){
            System.out.println(real+"+"+imag+"i");
        }else{
            System.out.println(real+"-"+(-imag)+"i");
        }
    }
}