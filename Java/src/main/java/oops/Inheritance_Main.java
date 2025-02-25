package oops;

public class Inheritance_Main {

	public static void main(String[] args) {

		Payments obj_Pay = new Payments("Phonepay");
		obj_Pay.UPI();
		Phone_Pay obj_Upi = new Phone_Pay("UPI", 2500);
		obj_Upi.Details();
		Internet_Banking obj_NetBank = new Internet_Banking("Internet Banking" ,3500);
		obj_NetBank.Details();
		Card obj_Card = new Card("Card", 4500);
		obj_Card.Details();
	}

}
