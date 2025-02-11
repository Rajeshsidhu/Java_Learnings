package loops_conditions;

public class Loops {
	
	//------------for loop----------------//	
	public  void for_Loop() {
		for(int i=0; i<=5; i++) {
			System.out.println(i);
		}
		
	}
//---------------nested for loop--------------//	
	public void nested_for_Loop() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
				
			}
			System.out.println(" ");
		}
	}
//----------for:Each Loop-----------------------//	
	public void for_Each_Loop() {
		int arr[]= {12,34,56,78};
		for(int i:arr) {
			System.out.println(i);
			
		}
	}
//----------While Loop-----------------------//	
	public void while_Loop() {
		int i =0;
		while(i<=5) {
			System.out.println(i);
			i++;
			
		}
		
	}
//-----------Do-While Loop--------------//
	public void Do_While_Loop() {
		int i=0;
		do {
			System.out.println("Do While Loop");
			i++;
		}while(i<3);
	}
	
	

}
