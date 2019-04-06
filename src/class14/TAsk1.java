package class14;

public class TAsk1 {

	public static void main(String[] args) {
		
	//Create a String that will hold a sentence. 
	//Write a program to get a new String without any spaces.
		
		String sentence= "What did i get my self into";
	    String newStr=sentence.replaceAll(" ", "");
	    System.out.println(newStr);
	

//	Create a String that should be combination of letters, 
//	numbers and special characters. Find out how many alpha 
//	characters are there in the String.
	
	String str="what1223&$Spring#@#123";
    String newstr= str.replaceAll("[^A-Za-z]", " ");
    System.out.println(newstr.length());
    
    //You have a String a=“Is it saturday! Is it raining! 
    		//Do we have a Java Class today?” How would you find out 
    				//how many sentences are in that String?
    
    String a="Is it saturday? Is it raining? Do we have a Java Class today?";
    String[] sr1=a.split("[?]");
    System.out.println(sr1.length);
    
	
}
}
