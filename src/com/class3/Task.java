package com.class3;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int loan;
//		
//		Scanner input=new Scanner(System.in);
//		System.out.println("What is the amount needed");
//		loan=input.nextInt();
//		
//		if(loan<200000) {
//			System.out.println("You can borrow money");
//		}else {
//			System.out.println("Sorry cant let you borrow money");
//		}
//		
		int age;
		Scanner input=new Scanner(System.in);
		System.out.println("What is your age");
		age=input.nextInt();
		
		if(age>18) {
	    System.out.println("You can get your driving licence");
	    } else{
		System.out.println("You can get a learner permit");
	}
}
}
