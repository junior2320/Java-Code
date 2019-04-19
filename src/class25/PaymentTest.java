package class25;

public class PaymentTest {

	public static void main(String[]args) {
		Payment parent=new Payment();
		parent.makePayment();
		
		MasterCard mc=new MasterCard();
		mc.makePayment();
		
		Visa visa=new Visa();
		visa.makePayment();
		visa.annualFee();
		//archieving run time polymorphism
		//pay-reference variable,payment - type
		//new MasterCard(); - creating an object
		Payment pay=new MasterCard();
		pay.closePayment();
		pay.makePayment();
		
		Payment pay1=new Visa();
		pay1.closePayment();
		pay1.makePayment();
		//pay1.annualFee();method
	}
}
