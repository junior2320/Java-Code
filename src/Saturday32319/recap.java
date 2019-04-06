package Saturday32319;

public class recap {

	public static void main(String[] args) {
		
//let's create an arrays of names that will hold 5 elements and retrieve all vslues
//1. create 
		String[] names=new String[5];
		
		names [0]="Asel";
		names [1]="Awet";
		names [2]="Arif";
		names [3]="Weqas";
		names [4]="Dzmitri";
		//names [5]="Shiva"; will get an runtime exception when trying to access it
		
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
			
		//2.create an array using array literal
		String[] studentNames= {"Shaban","Bilal","Mehmet","Zaki","Samir","Frank"};
		
		System.out.println("----------For loop-----------");
		for(int i=0; i<=studentNames.length-1; i++) {
			System.out.println(studentNames[i]);
		}
		
	//retrieve values using: advanced for loop, for each loop, enhanced for loop
		System.out.println("-----------Advanced for loop-----------");
		
		for(String student:studentNames) {
			System.out.println(student);
		}
	}

}
