package practise_Java;

public class MultipleConstructor {
	
	MultipleConstructor(int a, int b)  
	    {  
	        System.out.println("a = "+a+" b = "+b+"a");  
	    }  
	MultipleConstructor(int a, float b)  
	    {  
	        System.out.println("a = "+a+" b = "+b);  
	    }  
	    public void main (String args[])  
	    {  
	        byte a = 10;   
	        byte b = 15;  
	        MultipleConstructor test = new MultipleConstructor(a,b);  
	    }  
 

}
