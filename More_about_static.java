import java.util.*;
//static --> if something is common for all the objects(either Attribute or Method) the we can use ststic key word
//
public class Main{
  //why we use main methos as static because we know that every thing start run from main so if you 
  //want call a main method but with out object we use static
  public static void main(String args[]){
    //with out creating any object to the class we can acess with the class reference
    
    System.out.println(Human.population);
    Human Ashok = new Human(29,"Ashok",10000,true);
    Human ram = new Human(23232,"Ram",934247247,true);
    
    System.out.println(Human.population);//
    System.out.println(ram.population);
    //greeting();//gives an error because we can't call with out instance as it is non static methos
    fun();//works with out error 
    
    //how could we do 
    Main obj = new Main();
    obj.greeting(); // you can not acess non static stuff with out referencing there instances in a static context 
    //hence here i am referencing it
    
    
  }
  //we know that something which is non static belongs to objects
  //so we need to call with with object reference
  //it is depend on object 
  void greeting(){
    System.out.println("Hello hi");
  }
  //it is not depend on objects
  static void fun(){
    System.out.println("going good");
  }
}

class Human{
  int age;
  String name;
  int salary;
  boolean maried;
  static int population;//population is common for every humanbeing 
  static void display(){
    System.out.println(population);
    System.out.println(this.age); //this throws an error because static can not acess non static
  }
  
  
  Human(int age, String name, int salary, boolean maried){
    this.age = age;
    this.name = name;
    this.salary = salary;
    this.maried = maried;
    Human.population+=1;
  }
}
