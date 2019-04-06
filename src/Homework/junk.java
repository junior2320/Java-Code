package Homework;

import java.util.Scanner;

public class junk {

	public static void main(String[] args) {
		
		  String Name;
		  String carOrigin;
		  Scanner scan=new Scanner(System.in);
		  System.out.println( "Please enter your favorite car make");
		   Name=scan.nextLine();
		      
		      switch(Name){
		    case "BMW":
		       carOrigin= "german car";
		    break;
		    case "Toyota":
		    	carOrigin="japanese car";
		    break;
		    case "Maserati":
		    	carOrigin= "italian car";
		    break;
		    
		    default:
		    	carOrigin="unknown";
		     break;
		}
		    System.out.println("Your favorite car is "+carOrigin);
		}
				  }
		
	


