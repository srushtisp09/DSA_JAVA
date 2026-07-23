 
public class absstract {
    public static void main(String[] args) {
        horse h = new horse();
        System.out.println(h.color); // prints "darkbrown"
        h.changeColor();
        System.out.println(h.color); // prints "brown"
    }
}
abstract class organisms {
    String color;
      organisms(){
        color="darkbrown";
     }
    void eat() {
        System.out.println("eats");
    }
    abstract void walk();
}

class horse extends organisms {
    void changeColor() {
        color = "brown";
    }
    void walk() {
        System.out.println("Works on four legs");
    }
}
//So the reason y we use  constructor is because when any property of all the 
//subclasses is to be set as a fixed property then we use constructor 
//also when the object is made then a memory is allocated then the first constructor that gets cla
//called is the constructor of super parent class its always the parent constructor that gets called 
// first .all the property of constructor in the parent class are inherited to the child class 
//then the child class inherits the properties wriitten in the constructor of the parent class if u w
//want to change it then we r supposed to make a functiiomn 
//to change it
//the order in which the constructor are claalled is always in the hierarchical order
//u can make multiple constructors in ur class then the constructors will be called in the order of parent wise .
//liek the constructor in the parent then the child will be executed
