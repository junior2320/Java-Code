package class3;

import java.util.Scanner;

public class City {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ask user to eneter city and temperature in fahrenheit
//your program should convert f-->C
//your program should say"The temperature in the city--is---"
		
		String cityName;
		int temp;
				
		
		 Scanner myScanner=new Scanner(System.in);
	        System.out.println("Please enter your city");
	        cityName = myScanner.nextLine();
	        
	        System.out.println("Please enter temperature in Fahrenheit");
	        temp = myScanner.nextInt();
	        //formula (F − 32) × 5/9;
	        
	        int convertedTemp=(temp-32)*5/9;
	        
	        System.out.println("the temperature in the city “+cityName+” is +convertedTemp+“C");

}
}