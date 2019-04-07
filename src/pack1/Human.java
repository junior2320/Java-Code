package pack1;

public class Human {

	static String eyeColor ="green";
	int height=6;
	int weight=180;
	String gender="M";
	
	String programmingLanguage = "java";
	
	void speak() {
		
		String language ="English";
		System.out.println("Human can speak "+language);
	}
	  void print() {
	        System.out.println(eyeColor);
	  }
	  
	  

	   	    public static void main(String[] args) {

	        Human person = new Human();
	        
	        Human person2 = new Human();
	        person.eyeColor = "Blue";
	        System.out.println(eyeColor);
	        System.out.println(person.eyeColor);

//	        System.out.println(person.height);
//	        System.out.println(person.weight);
//	        System.out.println(person.gender);
	    }

	    void coding() {

	        System.out.println("Syntax students can code" + programmingLanguage);
	    }

	}
