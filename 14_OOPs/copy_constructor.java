xpublic class copy_constructor {
    public static void main(String[] args) {
        //copy constructor -- by default in c++, but in java, we have to create it.
        //its work is to copy all properties of obj1 to obj2...... obj2= copy(obj1)
        Student s1=new Student();
        s1.name="Ayush";
        s1.roll=121;
        s1.password="Ayush2208";
        s1.marks[0]=91;
        s1.marks[1]=87;
        s1.marks[2]=79;

        //like if s1 forget pasword , so we create a new object for him.
        Student s2=new Student(s1);   //copy
        s2.password="xyz";
        System.out.println(s2.password);
        s1.marks[2]=100; //logically, as s2 is already copied, it won't change s2. 
        //But unexpectedly, s2 is also changed, it is because marks array assigned to s2 is a reference to marks array of s1
        //Concept/Understanding -->, shallow & deep copy.

        for (int i = 0; i <3; i++) {
            System.out.println(s2.marks[i]);
        }
    }    
}
class Student {
    String name;
    int roll;
    String password;
    int marks[]; 

    Student() {
        marks=new int[3];   //written in every constructor calling as it's important to specify size
        System.out.println("Constructor is called....");
    }
    //copy constructor - is created by having class' own another object as a parameter 
    
    //shallow copy constructor -- copy having references to the object copied., as copied object's array is passed as reference to the new another object (changes reflect).
    // Student(Student s1) {
        // marks=new int[3];
        // this.name=s1.name;
        // this.roll=s1.roll; //to give new password , we basically don't copy password (we can copy everything)
        // this.marks=s1.marks;   //copied marks array is thus a reference 
    // }
     
    //deep copy constructor - copy having independent values w.r.t the copied object. (changes don't reflect)
    Student (Student s1) {
        this.name=s1.name;
        this.roll=s1.roll;
        for (int i=0; i<marks.length; ++i) {
            this.marks[i]=s1.marks[i];
        }

    }
}
