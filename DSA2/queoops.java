package DSA2;

public class queoops {
   public static void main(String args[]){
    // Vehicle obj1=new Car();
    // obj1.print();
    // // Vehicle obj2=new Vehicle();
    // // obj2.print();
    // Vehicle obj1=new Car();
    // obj1.print1();
    //this  causes an error causee the vehicle stores only print and not print1 
    // evene tho the car stores both print and print1 but the vehivle is the //
    //the refernce variable so the vehicle class doesntot know anything about prin1 so error
Vehicle obj2=new Vehicle();
   obj2.print();
       } 
    
    
}
// class Vehicle{
//     void print(){
//         System.out.println("Base class(Vehicle");
//     }
// }
// class Car extends Vehicle{
//     void print(){
//         System.out.println("Derived class(Car)");
//     }
// } 
//the concept of function overridding is been used here
//question6
class Vehicle{
    void print(){
        System.out.println("Base class");
    }
}
class Car extends Vehicle{
    void print1(){
        System.out.print("Derived class ");
    }
}
//question8
// class Book{
//     int price;//price is zero initially 
//     static int count;
//     public Book (int price){
//         this.price=price;//the argument will be passed means it will be assigned

//         count++;
//     }
// }
// public class OOPs{
//     public static void main(String args[]){
//         System.out.print(Book.count);
//         Book b1=new Book(150);
//         Book b2=new Book(123);
//         System.out.print(Book.count);
//     }
// }