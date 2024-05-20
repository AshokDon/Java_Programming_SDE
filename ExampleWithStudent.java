import java.util.*;

//how class and object are useful in storing data
//creating a class Student
//this class will have 3 data members roll, name, marks


public class ExampleWithStudent{
    //creating a class Student
    class Student{
        int roll;
        String name;
        float marks;
    }
    public static void main(String args[]){
        //now let us solve the same problem using class and objects
        //storing data of 10 students
        //creating 10 objects of Student class
        Student s1 = new Student();//creating object of Student class
        s1.roll = 1;
        s1.name = "Ashok";
        s1.marks = 85.0f;
        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.marks);
        //you can do this for all 10 students
        //this is a good way to store data
        //you have to create only one class and you can create any number of objects


    }
    
}

