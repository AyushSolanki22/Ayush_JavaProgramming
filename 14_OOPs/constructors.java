// Constructor is a special method which is invoked automatically at the time of object creation. It is used to initialise newly created object
// -Constructures have the same name as class or structure. Ex: Pen()
// -Constructors don't have a return type (not even void)
// -Constructors are only called once, at object creation.
// -Memory allocation happens when constructor is called 


public class constructors {
    public static void main(String[] args) {
        //constructor overloading -- when a programme do assign & work on passing given value itself to different constructors based on having difference in values automatically.--- polymorphism
        Student s1=new Student(); 
        Student s2=new Student("Ayush");
        Student s3=new Student(20);
        System.out.println(s2.name);
    }
}
class Student {
    String name;
    int roll; 
    String password;

    //By default, when no constructor is created/defined, java creates a default constructor. - which is non-parameterised
    //To create constructors along with having something done(printing something or passing values to variables in class ), it is necessary to define one with parameters.

    Student() {    // -- non-parameterized constructor
        System.out.println("constructor is called");
    }

    Student(String name) {  //--parameterized constructor
        this.name=name;
    }
    Student(int roll) {
        this.roll=roll;
    }
    
}
//3 types of constructors: parametrized , non-parametrized & copy constructor.
