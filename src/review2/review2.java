package review2;

import java.util.Scanner;

public class review2 {

	public static void main(String[] args) {
		
		// Write a program to find out what to do for the following temperatures
        // Temperatures is greater than 100 print out Stay inside it's too hot
        // temperatures is greater than 50 and less than 99 print out Wear winter clothes
        // temperatures is greater than 30 and less than 49 print out Wear winter clothes
        // temperatures is greater than 10 and less than 29 print out Stay inside it's too cold
        // lastly if the temperature  is lower than that print out Call for help it's too cold outside
		
		
//		   int temp=67;
//		   if(temp>100) {
//			   System.out.println("Stay inside it's too hot");
//		   }else if(temp>50 && temp<99) {
//			   System.out.println("Wear summer clothes");
//		   }else if(temp>30 && temp<49) {
//			   System.out.println(" Wear winter clothes");
//		   }else if(temp>10 && temp<29) {
//			   System.out.println("Stay inside it's too cold");
//		   }else {
//			   System.out.println("Call for help it's too cold outside");
//		   }
		   
		
		//Write a program that allows a user to input age to find out if the user is either Too Young, Young Person, Middle Age Person, or  too Old
        // Age should NOT be greater than 18  print out  Too Young
        // Age should be between 18 and 35 inclusive  print out Young Person
        // Age should equal 36 or less than or equal to 99 inclusive print out  You are Middle Age Person
        // If the age is greater than 100  print print out  You are too Old
        // Create an int variable named age
        // Must use a Scanner
//		
//		  int age;
//		    
//		    Scanner scan=new Scanner(System.in);
//		    System.out.println("Enter your age");
//		    age=scan.nextInt();
//		    
//		     if(!(age>18)) {
//		    	System.out.println("To young");
//		    }else if(age>=18 && age<=35) {
//		    	System.out.println("Young person");
//		    }else if(age <=36 || age<=99) {
//		    	System.out.println("You are Middle Age Person");
//		    }else{
//		    	System.out.println("You are too Old");
//		    }
//		    		System.out.println("Enter day");
//		    		System.out.println();
//		    		
//		          int day=6;
//		          String today;
//		         
//		
//		  switch (day) {
//	        
//		  case 1:
//	            today="Monday";
//	            break;
//	      case 2:
//	            today="Tuesday";
//	            break;
//	      case 3:
//	            today="Wednesday";
//	            break;
//	      case 4:
//	            today="Thursday";
//	            break;
//	      case 5:
//	            today="Friday";
//	            break;
//	      case 6:
//	            today="Saturday";
//	            break;
//	      case 7:
//	            today="Sunday";
//	            break;
//	      default:
//	            today="Invalid";
//	        break;
//		
//	}
//		  System.out.println("Today is "+today);
		
		
	// Write a program to found out the user level of experience
    // Must use a switch statement with  a String variable named levelString and a int variable named level
        
    // Beginner level should be 1
    // Intermediate level should be 2
    // Expert level should be 3
		
		
	
//		String levelString;
//		int level=0;
//		
//		switch (level) {
//		case 1:
//			levelString="Beginner";
//			break;
//		case 2:
//			levelString="Intermediate";
//			break;
//		case 3:
//			levelString="Expert";
//			break;
//			default:
//			levelString="0";
//			break;
//		}
//				System.out.println("Your level is "+levelString);
//		}
//}
	
		Scanner scan;
		String a;
		String b;

		int num1;
		int num2;

		scan=new Scanner(System.in);
		System.out.println("Word1= ");
		a=scan.nextLine();
		System.out.println("Word2= ");
		b=scan.nextLine();

		scan=new Scanner(System.in);
		System.out.println("Int1= ");
		num1=scan.nextInt();
		System.out.println("Int2= ");
		num2=scan.nextInt();


		if(num1==num2 && a==b){
		System.out.println("OR");

		}else if(num1==num2 || a==b){
		System.out.println("AND");

		}else{
		System.out.println("NONE");
		}
		}
		}


		       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

