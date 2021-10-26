package OOPSBasics;

class Demo1
{  
  //base class default constructor  
   Demo1()  
  {  
   this(80, 90);  
   System.out.println("Base class default constructor called");  
  }  
  //base class parameterized constructor  
   Demo1(int x, int y)  
  {  
   System.out.println("Base class parameterized constructor called");  
  }  
}  
//derived class or child class  
class Prototype extends Demo1
{  
//derived class default constructor  
     Prototype()  
    {  
      this("Java", "Python");  
      System.out.println("Derived class default constructor called");  
    }  
//derived class parameterized constructor  
    Prototype(String str1, String str2)  
    {  
      super();  
      System.out.println("Derived class parameterized constructor called");  
    }  
}  
public class ConstructorChaining  
{  
//main method  
     public static void main(String args[])   
     {   
//initializes the instance of example class  
      Prototype my_example = new Prototype();  
     }   
}  