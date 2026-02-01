//#Objects
//objects --> identities in the real world 
//for example : animal, watch, pen

//#Classes
//Classes --> group of these identies (objects) - one class is a group of objects basically with similar properties and functions (for eg: school class)
//Class is eventually a blueprint of objects (for example : blueprint of M800: class, cars being created : objects 
//classes has their attributes(properties) (ex: color) , and even functions(behaviours)(ex: changeColor()) for their objects to set properties and use functions according to need.

public class classes_objects {
    public static void main(String[] args) {
        //Pen ka actual mai as object banane ke liye public class mai constructor ke through create krrte hain (like we did for array, string )
        Pen p1=new Pen();//created a pen object called p1 using constructor  //by using new keyword, we create class object's space in memory(heap, not in stack) to store all properties of the class in as ohject's properties 
        //There are two types of memory : stack and neap --> objects are created in heap
       
        //Even if we don't creat(define) a constructor within class, java would automatically create it when constructor is called to create a object.
        //But, by default, java creates constructor only when there is no other one.
        //By default, it doesn't take any parameters to initialise variables in the class.(give them some value)
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(10);
        System.out.println(p1.tip);

    }
}
public class Pen {
    //properties+functions. - are defined within classes 

    //color,tip : properties,,,,,, setColor,setTip: functions 
    
    String color="red";
    int tip;

    void setColor(String newColor) {
        color=newColor;
    }
    void setTip(int newTip) {
        tip=newTip; 
    }
}

class Student{
    String name;
    int age ;
    float percentage;

    void calcPercentage(int phy, int chem, int math) {
        percentage=(phy+chem+math)/3
            }
}
