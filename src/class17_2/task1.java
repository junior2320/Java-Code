package class17_2;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		
//1. Write a program that reads a range of integers (start and end point), provided 
//by a user and then from that range prints the sum of the even and odd integers.
	
	Scanner input;
	int startPoint;
	int endPoint;
	int sumofEven =0;
	int sumofOdd = 0;
	
	input=new Scanner(System.in);
	System.out.println("Enter your start points:");
	startPoint =input.nextInt();
	System.out.println("Enter you end point:");
	endPoint=input.nextInt();
	
	if(startPoint<endPoint) {
		for(int a =startPoint; a<=endPoint; a++) {
			if(a%2==0) {
				sumofEven+=a;
			}
			else{
				sumofOdd+=a;
			}
		}
	System.out.println("Your sum of even number are: "+sumofEven);
	System.out.println("Your sum of odd number are: "+sumofOdd);
		}
	}
		
	}

