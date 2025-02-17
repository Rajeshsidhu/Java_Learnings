package oops;

public class Jeep implements Vehicle{

	@Override
	public void start() {
		System.out.println("The Jeep Interface has been started ");
	}

public	class Motorcycle implements Vehicle {

		@Override
		public void start() {
			System.out.println("The Motorcycle interface has been started");
		}
	}
}
