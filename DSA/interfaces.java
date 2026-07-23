public class interfaces {
    public static void main(String[] args) {
        Queen q=new Queen();//instantiation
        q.moves();
    }

}
interface chessplayer{
    void moves();//by default public and abstract

}
class Queen implements chessplayer{
    public void moves(){
            System.out.println("up,down,left,right");
    }
}
class Rook implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}
//interface is a blue print of class 
//while class is a blueprint of object
//interface-->class-->object
//car (wheels,speed,seats)interface---> maruti800 (class)--->maruti 800(object)
//interfaces helps inherit multiple inheritence 
//interfaces are used in total abstraction
//so in abstraction we involve both abstract and non abstract functions so
// //its not 100%abstract ..in order to have 100%abstarction 
//we have interfaces
//in interfaces we are suppoosed to use only abtsrat functinos\
//for  abstratcion they are implemented// for interfaces these are  implemented///for class they can be extended
//interfaces  tell us the idea and those ideas can be used by various differnt calsses
//abstract tell the state behaviour among related classes
//concrete methods and non abstarct methods are both same
///------IMPORTANT------
/// Imagine Toys
// Abstract Class = Half-Built Toy

// Think of it like a toy car that already has wheels and a body, but no paint yet.

// The toy maker says: “Here’s a car with some parts ready. You must finish the rest (like painting or adding stickers).”

// That’s what an abstract class does: it gives you some ready-made parts (concrete methods) and says “you must build the missing parts (abstract methods).”
//Interface = Checklist

// Now imagine your mom says: “Any toy you make must have a button, must make a sound, and must have a color.”

// She doesn’t give you any toy parts, just a list of rules.

// That’s what an interface does: it says “you must have these abilities” but doesn’t give you any actual code.
//EX:
// Abstract class = half-built toy
abstract class Animal {
    void eat() { // already built
        System.out.println("Animal eats");
    }
    abstract void walk(); // you must finish this
}

// Interface = checklist
interface Pet {
    void play(); // must be added
}

// Dog = toy maker finishes both
class Dog extends Animal implements Pet {
    void walk() { // finishing the missing part
        System.out.println("Dog walks on 4 legs");
    }
    public void play() { // following the checklist
        System.out.println("Dog plays fetch");
    }
}
