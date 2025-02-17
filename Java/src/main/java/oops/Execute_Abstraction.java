package oops;

public class Execute_Abstraction {

	public static void main(String[] args) {
		Abstraction obj_Circle = new circle();
		obj_Circle.draw();
		obj_Circle.discriptrion();
		
		Abstraction obj_square = new square();
		obj_square.draw();
		obj_square.discriptrion();
		System.out.println("Partial abstraction achieved");
		
		
			
	}

}
