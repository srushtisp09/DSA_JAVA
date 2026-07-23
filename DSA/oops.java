 public class oops {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="srushti";
        s1.roll=456;
        s1.password="abcd";
        Student s2=new Student(s1);
        s2.password="wer";
     }
}
class Student{
    String name;
    int roll;
    String password;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
    int marks[];
    Student(Student s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        
    }
    Student(){
          marks=new int[3];
        System.out.println("Constructor is called");
    }
    Student(String name){
          marks=new int[3];
        this.name=name;
    } 
    Student(int roll){
          marks=new int[3];
        this.roll=roll;
    }
     
}

