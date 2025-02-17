package oops;

public class Payment_Overriding {

	public void Payment_Processing(double amount) {
		System.out.println("processing generic payment of " + amount);
	}
	

	 public class Credit_card extends Payment_Overriding {
		@Override
		public void Payment_Processing(double amount) {
			System.out.println("processing payment of Credit card " + amount);
		}
	}

	 public class Upi extends Payment_Overriding {
		@Override
		public void Payment_Processing(double amount) {
			System.out.println("processing UPI payment of " + amount);
		}

	}

}
