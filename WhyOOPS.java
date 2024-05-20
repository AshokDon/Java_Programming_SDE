import java.util.*;

public class Whyoops{
    public static void main(String args[]){
        //exmple if you want to store data of  10 students how will you do it?
        //with out class and objects
        int roll[] = new int[10];
        String name[] = new String[10];
        float marks[] = new float[10];
        //now you have to store data of 10 students as you created some containers
        //you can store data in them
        roll[0] = 1;
        name[0] = "Ashok";
        marks[0] = 85.0f;
        System.out.println(roll[0]);
        System.out.println(name[0]);
        System.out.println(marks[0]);
        //you can do this for all 10 students
        //but this is not a good way to store data
        //beacuse you have to create 3 arrays for 3 data members where lot of memory is wasted
        //and also you have to remember the index of each student data
        //so to overcome this we use classes and objects
        //so we can store data of 10 students in a single object
        //and we can access the data of each student using the object
        //so we can create a class Student

    }
    
}

