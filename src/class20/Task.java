package class20;

public class Task {
    
	public static void main(String[] args) {
		
		/*
     * Create a method createEmail().
     * Based on provided user name, lastName and email type,
     * your method should return complete email Address:
     * 
     */
		Task obj=new Task();
		String email=obj.createEmail("John","Snow","gmail");
		System.out.println(email.toLowerCase());
		
		email=obj.createEmail("Bob", "Snow","outlook");
				System.out.println(email);

	}
	//return type methodName 
	String createEmail(String name, String lastName, String emailType) {
		
		String email=name+lastName+"@"+emailType+".com";
		return email.toLowerCase();
	}
	
	
	

}
