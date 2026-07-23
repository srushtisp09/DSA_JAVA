public class inheritence {
    public static void main(String args[]){
    //     dog dobby=new dog();
    //     dobby.legs=4;
    //     System.out.println(dobby.legs);
    //  dobby.eat();
      Student s1=new Student();
        s1.schoolname="JMV";
        Student s2=new Student();
        System.out.println(s2.schoolname);
    }
}
// class Animal{
//     String color;
//     void eat(){
//         System.out.println("eats");
//     }
//     void breathe(){
//         System.out.println("breathe");
//     }
// }
// class Mammal extends Animal{
//      void walks(){
//         System.out.println("walks");
//      }

// }
// class dog extends Mammal{
//     String breed;
// }
class Student{
    String name;
    int roll;
  static String schoolname;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }

    }
 