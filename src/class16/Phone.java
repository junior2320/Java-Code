package class16;

public class Phone {

	String model,color;
	int screen,memory;
	
	
	public static void main(String[] args) {
//Create a Class “Phone”. Create 3 Objects of it: iPhone, Android, Nokia 
		//with specific attributes and behaviors.
 
		Phone p1=new Phone();
		p1.model="iphone";
		p1.color="Matte Black";
		p1.screen=7;
		p1.memory=258;
		
		p1.answerCall();
		p1.sentText();
		p1.Internet();
		
		Phone p2=new Phone();
		p2.model="Nokia";
		p2.color="red";
		p2.screen=7;
		p2.memory=128;
		
		p2.answerCall();
		p2.sentText();
		p2.Internet();
		
		Phone p3=new Phone();
		p1.model="iphone";
		p1.color="Matte Black";
		p1.screen=7;
		p1.memory=258;
		
		p1.answerCall();
		p1.sentText();
		p1.Internet();
	}
void answerCall() {
	System.out.println();
}
void sentText() {
	System.out.println();
}
void Internet() {
	System.out.println();
}
}
