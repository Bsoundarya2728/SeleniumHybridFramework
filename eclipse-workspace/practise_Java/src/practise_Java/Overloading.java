package practise_Java;

class Base  
{  
    void method(int a)  
    {  
        System.out.println("Base class method called with integer a = "+a);  
    }  
       
    void method(double d)  
    {  
        System.out.println("Base class method called with double d ="+d);  
    }  
}  
   
class Derived extends Base  
{    
    void method(double d)  
    {  
        System.out.println("Derived class method called with double d ="+d);  
    }  
}  
   
public class Overloading  
{      
    public static void main(String[] args)  
    {  
        Base b=new Derived();  
        b.method(10);
    }  
}  
