package sunday322019;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
//		
//	Write a program that prints out if it is good weather to go for any activity or not
//		* If the temperature is between 40 degrees and 80 degrees inclusive & no rain--> we will go for hiking
//		* otherwise--> we will not go hiking
//		* If temperature is between 25 and 40 inclusive & snowing -->going snowboarding otherwise
//		* we are not going snowboarding
//		* it if temperature is more than 80 & sunny--> go to the beach
//		* otherwise --> not go to the beach

		int temp;
		boolean rainy,sunny,snowing;
		Scanner in;
		String activity;
		
		in=new Scanner(System.in);
		System.out.println("Please enter the temperature");
		temp=in.nextInt();
		
		if (temp>=40&& temp<=80) {
			System.out.println("Is it raining? (true/false)");
			rainy=in.hasNextBoolean();
			if (rainy) {
				activity="Watch moive";
			}else {
				activity="Go Hiking";
				}
		}else if(temp>=25 && temp<40) {
			System.out.println("Is it snowing?(true/false)");
			snowing=in.hasNextBoolean();
			if (snowing) {
				activity="Go snowboarding";
			}else {
				activity="Do coding";
			}
		}else if (temp>80&&temp<=100) {
			System.out.println("Is it sunny?(true/false)");
			sunny=in.hasNextBoolean();
			if(sunny) {
				activity="Go to the beach";
			}else {
			activity="Do coding";
		}
			
		}else if(temp >100){
			activity="It is too hot, turn on AC and stay home";
		}else {
			activity= "It is too cold, get some hot tea";
		}
	System.out.println("Suggested activity for today: "+ activity);
	}
}
