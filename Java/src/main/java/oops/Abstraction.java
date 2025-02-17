package oops;

abstract class Abstraction {
	//abstract method no body must implement by child class
	abstract void draw();
	//concrete method has body
	void discriptrion() {
		System.out.println("This is the shape");
		
	}

}

class circle extends Abstraction{
	void draw() {
		System.out.println("Drawing a circle");
	}
	
}
class square extends Abstraction{
	void draw() {
		System.out.println("Drawing a square");
	}
}
