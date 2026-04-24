package DSA2;

public class statix {
 public static void main(String args[]){
    Student s1=new Student();
    s1.schoolname="HJY";
    Student s2=new Student();
    System.out.println(s2.schoolname);
    Horse h=new Horse();
    System.out.println(h.color);

 }
}
class Student{
    int returnpercentage(int math,int phy,int chem){
        return(math+phy+chem)/3;
    }
    String name;
    int roll;
    static String schoolname;
    void setName(){
        this.name=name;

    }
    String getName(){
        return this.name;
    }
}
//so the word static is written when the property needs to be common for many objects 
//in heap memory a small memory is allocated for s1 where the string name roll will have a small space
//all variables will get allocated in the heap meemory but
//the static variable willget created in the other memory in the sense separate ..even though all the objects are
//are haveing sam esatatic variable so only one static variable gets created
//our main function is a static function coz for our public classthere should be only a single main.
//
class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor is called");
    }
 
}
class Horse extends Animal{
    Horse(){
        super.color="brown";
        // super();
        System.out.println("Horse constructor is called");
    }
}
//even if u dont add super then also u will get same output 
//java by default considers it as super
