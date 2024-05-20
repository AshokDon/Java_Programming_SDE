import java.util.*;

//OOPS 1 -> Introcution & concepts -> Class , Object , Constructor and Keywords



public class Main{
    


    
    public static void main(String args[]){
        //let us create an object of Student class
        //object is an instance of a class
        //object is a real entity
        //object is a runtime entity
        //object is an entity that has state and behavior
        //object is a physical entity
        //object is a reference of a class
        Student s = new Student();
        //s is an object of Student class
        //new -> keyword used to create an object which allocates memory dynamically
        //Student() -> constructor of Student class which is called when an object is created by default
        //s is a reference of Student class
        //Student s -> works in compile time
        //new Student() -> works in runtime

        //let us allocate data to the object while creating it
        //we can do this by using constructor
        Student s1 = new Student(13,"Ashok",85.0f);
        Student s2 = new Student(s1);
        System.out.println(s2.roll);
        System.out.println(s2.name);
        System.out.println(s2.marks);
        


    }
    
}

class Student{
    int roll;
    String name;
    float marks;
    //roll , name , marks are data members of Student class
    //default values of int is 0 , String is null , float is 0.0f
    //default constructor of Student class
    Student(Student s){
        //this is a constructor of Student class
        this.roll = s.roll;
        this.name = s.name;
        this.marks = s.marks;
    }
    Student(){
        //this is a constructor of Student class
        this.roll = 0;
        this.name = "";
        this.marks = 0.0f;
    }
    //parameterized constructor of Student class
    Student(int roll,String name,float marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    // //keyword this is used to refer the current object
    void changeName(String name){
        this.name = name;
       // System.out.println("Name changed to "+name);
    }
    void greet(){
        System.out.println("hello my name is "+name);
    }
}
