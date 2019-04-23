package class25;

public class FinalKeyword {
	public static final String name="Syntax";
	
	public static void main(String[]args) {
		
		/* Final keyword can be used in 3 places/ways
		 * 1.final Variables- weCANNOT change their value-->CONSTANT
		 * 2.methods-WE CANNOT OVERRIDE FINAL methods
		 * 3.final classes-we CANNOT create a child of a final class-->PREVENT 
		 */
		
		final String str="Hello";
		//str="John";
		//name="School";				
	}
	public final void hello() {
		System.out.println("Hello from Parent class");
	}
}
class ChildOfFinal extends FinalKeyword{
//	CANNOT OVERRIDE FINAL METHOD
//	public void hello() {
//		System.out.println("Hello from PArent class");
//	}
	
}
