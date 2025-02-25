package oops;
//--------------child class 2-----------------------//
public class Internet_Banking extends Payments {
	
	int amount;
//	Payments payments = new Payments(payment_Mode);
	

	Internet_Banking(String payment_Mode, int amount) {
		super(payment_Mode);
		this.amount = amount;

	}
	
	void Details() {
		System.out.println(payment_Mode + " of " + amount + " is processing");
	}
	

}
