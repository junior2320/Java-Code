package class26;

public class SuperKeyword {
	
	String name="John";
	
	public void sayName() {
		System.out.println("My name is "+name);
	}

}
class ChildOfSuperKeyword extends SuperKeyword{
	String name="Michael";
	
	public void sayName() {
		System.out.println("Parent name is "+super.name);
		System.out.println("My name is "+name);
	}
	public void callingMethods() {
		sayName();//this.sayName
		super.sayName();
	}
}