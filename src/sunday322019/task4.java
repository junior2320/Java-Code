package sunday322019;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		
		String language;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter which country you are from");
		String country=scan.nextLine();
		
		switch (country) {
		  case "USA":
		   language="English";
		break;
		  case "France":
		   language="French";
		break;
		  case "Germany":
			language="German";
		break;
		  case "Spain":
			language="Spanish";
		break;
			default:
				language="Unknown";
		
				System.out.println("The language you speak is "+language);
		}

	}

}
