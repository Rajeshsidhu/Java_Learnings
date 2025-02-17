package methods;

import java.util.Scanner;

import loops_conditions.Loops;
import oops.Car_Constructor;
import oops.Encapsulation;
import oops.Payment_Overriding;
import oops.Payment_Overriding.Credit_card;
import oops.Polymorphism;

/**
 * Hello world!
 *
 */
public class Methods
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
    	System.out.println("****************Encapsulation concept was achived***************");
    	
    	Car_Constructor obj_car = new Car_Constructor("unknown",0.00);
    	System.out.println("Brand: " +obj_car.getCar_Constructor_brand());
    	System.out.println("Price: " +obj_car.getCar_Constructor_price());
    	obj_car.setCar_Constructor_brand("Lambo");
    	obj_car.set_Car_Constructor_price(5000000.00);
    	obj_car.display_Details();
    	System.out.println("****************Constructer in Encapsulation concept was achived***************");
    	
//------------------------------------------------------------------------------------------------------------------------------//    	
//***************Polymorphism******************//
//-------------------Method Overloading---------------------------------//    	
    	Polymorphism obj_Polymorphism = new Polymorphism();
    	System.out.println("Two Arguments method executed " +obj_Polymorphism.add(5, 10));
    	System.out.println("Three Arguments method executed " +obj_Polymorphism.add(5, 10, 20));
    	System.out.println("**************Method Overloading in Polymorphism is achieved*************");
//-------------------Method OverRiding-------------------------------------//   
    	
    	Payment_Overriding obj_Overriding = new Payment_Overriding();  
    	obj_Overriding.Payment_Processing(250.00);
    	Payment_Overriding.Credit_card obj_credit = obj_Overriding.new Credit_card();
    	obj_credit.Payment_Processing(350.00);
    	Payment_Overriding.Upi obj_UPI = obj_Overriding.new Upi();
    	obj_UPI.Payment_Processing(450.00);
    	System.out.println("*****************Method Overriding in polymorphism is achieved***************");
//-----------------------------------------------------------------------------------------------------------------------------// 
    	
    	
    	
    	
 //***************Types of methods Execution**********************//   	
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























