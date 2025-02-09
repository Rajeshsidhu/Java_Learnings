package methods;

import java.util.Scanner;

import loops_conditions.For_Loop;

/**
 * Hello world!
 *
 */
public class Types_of_Methods 
{
/*----------static method :-
 * By using static keyword we declare static methods
 * to call a static method dont need to create a object
 * Best example is "main" method */
	
    public static void main( String[]args )
    {
        System.out.println( "Public and main method is executed" );
        private_Method();
        protected_Method();
        addition(34, 234);
/*-------instance method :-
 */
        Instance_Method obj = new Instance_Method();
        
        System.out.println("Instance method is executed " + obj.sub(20, 10));
        
//-----------loops execution------------//
        For_Loop loops_obj = new For_Loop();
        loops_obj.for_Loop();
        System.out.println("For loop Method is executed");
        loops_obj.nested_for_Loop();
        System.out.println("Nested for loop method executed");
        
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























