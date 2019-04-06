package class14;

public class task2 {

	public static void main(String[] args) {
		
	//1. Write a program to swap 2 numbers without a temporary variable? 
		//	Swap  2 strings without a temporary variable?
		
		    int x = 10; 
	        int y = 5; 
	        x = x + y; 
	        y = x - y; 
	        x = x - y; 
	        System.out.println("After swaping:"	+ " x = " + x + ", y = "+ y ); 
		
		
		System.out.println("--------------next--------------");
	//2.Write a java program to find the second largest number in the array? 
		//Maximum and minimum number in the array?
	        
	        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	        int min = array[0];
	        int max = array[0];
	        int max2 = array[0];
	        for (int i = 0; i < array.length; i++) {// i=2,
	            if (array[i] > max) {
	                max2 = max;//2,3,4,5,6,7,8,9
	                max = array[i];//2,3,4,5,6,7,8,9,10

	            }
	            if (array[i] < min) {

	                min = array[i];
	            }

	        }
	        System.out.println(max);
	        System.out.println(max2);
	        System.out.println(min);
	        
	    System.out.println("----------next--------");
	//3. Find out how many alpha characters present in a string?
	        
	        
	        String str2 = "Helloworld";
	        String NoNum = str2.replaceAll("[a-z]", "");
	        System.out.println(NoNum.length());
	        
	        
          System.out.println("-----------next-----------");
	//	4.How to find out the part of the string from a string? 
			//What is substring? Find number of words in string?
	        
	        //1st part.How to find out the part of the string from a string?
	        
            String ss ="# STRING_VALUES #";
            String[] parts = ss.split("#");
            System.out.println(parts[1].trim());
    
     //2nd part //what is substring?
            String str = "# STRING_VALUES #";
            String result = str.substring(2,str.length()-2);
	        
     System.out.println("-------------next---------------");
	//5. Write a java program to reverse String? Reverse a string word by word?
		    
     //String input = "racecar"; 
     
     
     //char[] try1 = input.toCharArray(); 

     //for (int i = try1.length-1; i>=0; i--) 
        // System.out.print(try1[i]); 
     
     System.out.println("---Task 5 | Part 1---");

     String str1="This is in reverse:";
     System.out.println(str);
     char [] array1=str.toCharArray();
     for (int i=array.length-1;i>=0;i--) {
     System.out.print(array[i]);
 }
     System.out.println("");
     System.out.println("---Task 5 | Part 2---");

     //String str2="This is in reverse:";
     System.out.println(str);
     String [] array2=str.split(" ");
     for (int i=array1.length-1;i>=0;i--) {

     System.out.print(array1[i]);
     
}
 } 
}
	
	
	


