package oops;

//Inheritence//
public class Payments {
	  String payment_Mode;

	Payments(String payment_Mode) {
		this.payment_Mode = payment_Mode;

	}
	
	void UPI() {
		System.out.println(payment_Mode + " UPI is Processing");
	

	}
	

	void internet_Banking() {
		System.out.println(payment_Mode + " internet banking is Processing");
	}

	void Card() {
		System.out.println(payment_Mode + " Card payment is Processing");
	}

}
