package loops_conditions;

public class For_Loop {
	public  void for_Loop() {
//------------for loop----------------//		
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
	

}
