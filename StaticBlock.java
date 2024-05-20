//static 2 
import java.util.*;

public class StaticBlock{
  static int a = 4;
  static int b;
  //will only run once , when the first object is created i.e when the class is loaded for the first time
  static{
    System.out.println("i am in StaticBlock");
    b = a * 4;
  }
  public static void main(String args[]){
    StaticBlock obj = new StaticBlock();
    System.out.println(StaticBlock.a+" "+StaticBlock.b);
    StaticBlock.b+=3;
    System.out.println(StaticBlock.a+" "+StaticBlock.b);
    StaticBlock obj1 = new StaticBlock();
    System.out.println(StaticBlock.a+" "+StaticBlock.b);
    
  }
}
