package oops;
//----------child class 1------------//

public class Phone_Pay extends Payments {
	int amount;
//	Payments payments = new Payments(payment_Mode);
	

	Phone_Pay(String payment_Mode, int amount) {
		super(payment_Mode);
		this.amount = amount;

	}
	
	void Details() {
		System.out.println(payment_Mode + " of " + amount + " is processing");
	}

}
