package oops;
//------------child class 3----------------------//
public class Card extends Payments {
	int amount;

	Card(String payment_Mode, int amount) {
		super(payment_Mode);
		this.amount = amount;

	}

	void Details() {
		System.out.println(payment_Mode + " of " + amount + " is processing");
	}
}
