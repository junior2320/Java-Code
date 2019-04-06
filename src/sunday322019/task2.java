package sunday322019;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		
		String grade;
		Scanner scan;
		String explain;
		
		scan = new Scanner(System.in);
		System.out.println("Please enter grade");
		grade=scan.nextLine();
		
		switch(grade) {
		
		case "A":
			explain="Excellent";
			break;
		case "B":
			explain="Good";
			break;
		case "C":
			explain="Average";
			break;
		case "D":
			explain="Bad";
			break;
			default:
				explain="Will not pass";
		}		
		System.out.println("Your grade is "+grade+" means "+explain);
} 
}
	


