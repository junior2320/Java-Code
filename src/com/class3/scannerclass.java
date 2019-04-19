package com.class3;

import java.util.Scanner;

public class scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner input=new Scanner(System.in);
	
		System.out.println("Please enter your name");
		
		String name=input.nextLine();
		
		System.out.println("Good morning " +name);
		
		String ask=input.nextLine();
		
		System.out.println("How are you?");
		
		String fine=input.nextLine();
		
		System.out.println("Thats good hear");
		
		String day=input.nextLine();
		
		System.out.println("How is your day so far?");
		
		String age=input.nextLine();
	
		System.out.println("How old are you?");
		
		int number=input.nextInt();
		System.out.println("Wow your old");
		
	}

}
