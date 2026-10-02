import java.util.Arrays;

public class customComparator{
  public static void main(String[] args) {
      Student s1=new Student("Gopi",200,8.3);
      Student s2=new Student("Shahid",49,7.2);
      Student s3=new Student("Vikas",98,8.2);
      Student s4=new Student("Isha",77,6.9);
      Student s5=new Student("Aditya",54,9.1);
      Student[] arr={s1,s2,s3,s4,s5};

      Arrays.sort(arr); 
      //  will lead to error incase of no custom comparator,,, as by default sorting is based on comparision of primitive datatypes

      for(Student s: arr){
        System.out.println(s.name+" "+s.rno+" "+s.cgpa);
      }
  }
}


class Student implements Comparable<Student> {   //Custom comparator
  String name;
  int rno;
  double cgpa;
  Student(String name, int rno, double cgpa){
    this.name=name; 
    this.rno=rno;
    this.cgpa=cgpa;
  } 
  public int compareTo(Student s){   //custom comparator
    // return this.rno-s.rno;
    // return this.name.compareTo(s.name);
    return Double.compare(this.cgpa, s.cgpa);
  }
}