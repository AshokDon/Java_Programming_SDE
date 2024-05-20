import java.util.*;

public class Main{
  public static void main(String args[]){
    //wrapper classes 
    //A Wrapper class in Java is a class whose object wraps or contains primitive data types
    //primitive        Wrapper class 
    // int                Integer 
    // char               Character 
    // byte               Byte 
    // short.             Short
    // float              Float 
    // boolen             Boolen 
    // double             Double 
    //long                Long
    
    //AutoBoxing and UnBoxing
    //AutoBoxing -> 
    int a = 10;
    Integer b = a; // AutoBoxing
    System.out.println(b);
    
    Character c = 'A';
    char ch = c;
    System.out.println(c);//UnBoxing
    
    ArrayList<Integer>A = new ArrayList<Integer>(); // AutoBoxing 
    A.add(10);
    
    int val = A.get(0);//UnBoxing
    System.out.println(val);
    
    //what is use if we convert primitive to objects 
    //1.as we know class is somthing with properties and methods we can use them on Wrapper classes 
    
    
    
  }
}
