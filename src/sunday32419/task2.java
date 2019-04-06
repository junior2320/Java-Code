package sunday32419;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		
		//Create a String and print it in reverse order (Sunday → yadnuS).
		
		String rev="Sunday";
        for(int i=rev.length()-1;i>=0;i--) {
            System.out.print(rev.charAt(i));
            
        } 
        //Create a String and if the String is not empty perform the following: 
        //if the String has an odd number of characters and has 3 or more characters, 
        //print the character in the middle of the String
        
        String day =new String("Thursday!");
        
        if(!day.isEmpty()) {
        	if(day.length()%2!=0 && day.length()>=3) {
        		System.out.println(day.charAt(day.length()/2));
        	}
        	
        	/*
        	 * Write a program that reads two people's first names 
        	 * and if they expecting boy or girl?
        	 * Based on the input suggests a name for a baby:

        	 */
        		

        			Scanner scan; 
        			String motherName,fatherName, gender, babyName;
        			
        			scan=new Scanner(System.in);
        			System.out.println("Please enter mothers name");
        			motherName=scan.nextLine();
        			
        			System.out.println("Please enter fathers name");
        			fatherName=scan.nextLine();
        			
        			System.out.println("Please enter expected gender");
        			gender=scan.nextLine();
        			
        			
        			if(gender.equalsIgnoreCase("boy")) {
        				babyName=fatherName.substring(0, fatherName.length()/2)+
        						motherName.substring(motherName.length()/2);
        			}else if(gender.equalsIgnoreCase("girl")){
        			babyName=motherName.substring(0, motherName.length()/2)+
        					fatherName.substring(fatherName.length()/2);
        			}else {
        				babyName="No suggestion";
        				
        			}
        			System.out.println(babyName.toUpperCase());
        		}
        	}
	}




        
        
	  


	
	

