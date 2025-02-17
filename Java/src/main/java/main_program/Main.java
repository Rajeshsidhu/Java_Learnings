package main_program;

import oops.Jeep;
import oops.Motorcycle;

public class Main{
	
	public static void main(String[]args) {
//**************abstraction*****************//
//---------------Interface-----------------//		
		Jeep obj_Jeep = new Jeep();
		obj_Jeep.start();
		
		Motorcycle obj_Motorcycle = new Motorcycle();
		obj_Motorcycle.start();
		
		System.out.println("Interface was implemented");
		 
	}
//----------------------------------------------------------------------------------------------------------//
	

}
