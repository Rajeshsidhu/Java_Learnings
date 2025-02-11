package methods;

import java.util.Scanner;

import loops_conditions.Loops;
import oops.Encapsulation;

/**
 * Hello world!
 *
 */
public class Main_Method 
{
/*----------static method :-
 * By using static keyword we declare static methods
 * to call a static method dont need to create a object
 * Best example is "main" method */
	
    public static void main( String[]args )
    {
//oop's concepts
// Encapsulation
    	Encapsulation oops_obj = new Encapsulation("rajesh", 500000.0);
    	System.out.println("Account Holder Name: "+oops_obj.getAccountHolder());
    	System.out.println("Available Balance: "+oops_obj.getBalance());
    	oops_obj.setAccountHolder("Sidhu");
    	oops_obj.setBalance(90000.0);
    	
    	oops_obj.displayAccountDetails();
    	System.out.println("Encapsulation concept was achived");
    	
    	
    	
 //Types of methods Execution//   	
    	System.out.println( "Public and main method is executed" );
        private_Method();
        protected_Method();
        addition(34, 234);
//-------instance method--------//
 
        Instance_Method obj = new Instance_Method();
        
        System.out.println("Instance method is executed " + obj.sub(20, 10));
        
//-----------loops execution------------//
        Loops loops_obj = new Loops();
        loops_obj.for_Loop();
        System.out.println("For loop Method is executed");
        
        loops_obj.nested_for_Loop();
        System.out.println("Nested for loop method executed");
        
        loops_obj.for_Each_Loop();
        System.out.println("For Each loop was executed");
        
        loops_obj.while_Loop();
        System.out.println("While loop was executed");
        
        loops_obj.Do_While_Loop();
        System.out.println("Do-While loop was executed");
        
//----------------------------------//
        
    }
    private static void private_Method() {
    	System.out.println( "private method is Executed" );
    	
    }
    protected static void protected_Method() {
    	System.out.println("Protected method is executed");
    	    }
    public static int addition(int a, int b) {
    	
    	int c = a+b;
    	System.out.println(c + " return type method executed");
    	return c;
    }
    
//----------------- default method is only declared in interfaces---------------//    
//    default static void default_Method() {
//      System.out.println("Default method is executed");
//    }
//-----------------------------------------------------------------------------//
    

    
    
}























