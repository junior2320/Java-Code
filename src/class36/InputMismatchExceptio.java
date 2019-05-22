package class36;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptio {
//	How would handle InputMismatchException? 
//			Input Mismatch Exception when user enters mismatch 
//			value then programmer expected.

	public static void main(String[] args) {
		
		 Scanner myScanner = new Scanner(System.in);
	        System.out.println("Please enter a number ");
	    
	        
	        try{
	            int num = myScanner.nextInt();
	            System.out.println("your numher is " +num);
	        }
	        catch(InputMismatchException e) {
	            System.out.println("Your Number is Wrong");
	        }
	    }

	}