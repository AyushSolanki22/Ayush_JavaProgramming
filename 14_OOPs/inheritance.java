//Inheritance -- It is when properties and methods of base class(parent) are passed onto a derived class(child). Ex: Animal -- Fish
//All derived classes get all properties and methods from base 
public class inheritance {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.swim(); 
        shark.eat();
        shark.color="dark blue";
        System.out.print(shark.color);
    }    
}
//base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }
    void breathe() {
        System.out.println("breathe");
    }
}
//derived class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}
// class Fishaa extends Animal {
//     int fins;

//     void swim() {
//         System.out.println("swimsss in water");
//     }
// }


//Four types of inheritance: single level, multi level, heirarchial inheritance, hybrid inheritance
//there is also one type of imheritance too: multiple inheritance (though not directly possible/available in java, indirectly possible through interfaces)
//multiple inheritance is basically a derived class geting properties and functions from two seperate base classes.

//Single level --> Base class - Derived class 
//Multi level --> Base class -- derived class -- derived class 
//Hierarchical --> Base class -- derived 1, derived 2
//Hybrid --> Combination of Multi level , Hierarchical 
