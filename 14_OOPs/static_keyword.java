// StaticKeyword
// -In Java, it is used to share the same variable or method of a given class.
// (like school name is same in all students' list)
// -Properties, functions, blocks and nested class can be declared static

//- static property , function is shared with all object of the class basically
// that's why class is named with static to have only one main class within the package/programme

///-static keyword property's memory location is located differenty from the neap and the object's static property points to the static keyword property 
//Also static enables us to avoid multiple creations of a property which is similar in all objects (ex: percentage formula),classes.
public class static_keyword{
    public static void main(String args[]){
            Student s1=new Student();
            s1.schoolname="JMV";  //this name will be shared across all objects of the class as it's static variable .

            Student s2=new Student();
            System.out.println(s2.schoolname);  //will get the schoolname from s1(static- shared)

            Student s3=new Student();
            s3.schoolname="Aps";
            System.out.println(s2.schoolname);  //--name changed universally in all objects 
    
        }
}

class Student{
    String name;
    int roll;

    static String schoolname;  //static - shared with all objects

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }


}