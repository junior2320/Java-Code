package sunday322019;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		Scanner cal=new Scanner(System.in);
		System.out.println("Enter 2 number");
		
		int FirstNumber;
		int SecondNumber;
		int result;
		
		FirstNumber = cal.nextInt();
		SecondNumber = cal.nextInt();
		
		System.out.println("Enter operator(*,-,+,/)");
		char operator = cal.next().charAt(0);
		
		switch (operator) {
		case '*':
		   result = FirstNumber * SecondNumber;
		   break;
		case '-':
			result = FirstNumber - SecondNumber;
	       break;
		case '+':
			result = FirstNumber + SecondNumber;
	       break;
		case '/':
			result = FirstNumber / SecondNumber;
			break;
		default :
			System.out.println("Wrong");
			return;
		}
		System.out.println(FirstNumber+""+operator+""+SecondNumber+"="+result);
		

	}

}
