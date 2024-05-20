import java.util.*;

//introduction class , Objects, constructor and keywords
public class Main{
  
  public static void main(String args[]){
    
    Student s = new Student();
    //System.out.println(s.roll);
    Student s1 = new Student(13,"Ashok",90.0f);
    //System.out.println(s1.name);
    Student s2 = new Student(s1);
    Student s3 = s1;
    s1.changeMarks(60.9f);
    //System.out.println(s3.marks);
    int a = 10;
    int b = 20;
    //swap(a,b);
    Mydata m1 = new Mydata();
    m1.x = 10;
    Mydata m2 = new Mydata();
    m2.x = 30;
    modify(m1,m2);
    System.out.println(m1.x+" "+m2.x);
    
    
    Integer n1 = 20;
    Integer n2 = 30;
    
    
    
    
    
  }
  static void modify(Mydata m, Mydata n){
    Mydata temp = new Mydata();
    temp.x = m.x;
    m.x = n.x;
    n.x = temp.x;
  }
  static void swap(Integer a, Integer b){
    Integer temp = a;
    a = b;
    b = temp;
  }
  
  
}
class Mydata{
  int x = 10;
  
}
class Student{
  int roll;
  String name;
  float marks;
  Student(Student s1){
    this.roll = s1.roll;
    this.name = s1.name;
    this.marks = s1.marks;
  }
  Student(){
    // this.roll = 0;
    // this.name ="";
    // this.marks = 0.0f;
    //call the other constructor from another constructor
    this(12,"Don",99.0f);
  }
  Student(int roll, String name, float marks){
    this.roll = roll;
    this.name = name;
    this.marks = marks;
  }
  void changeMarks(float marks){
    this.marks = marks;
  }
  
}
