package review4;

public class task6 {

	public static void main(String[] args) {
//		**
//        * Write a program to test if an array contains a specific value.
//        *
//        * Hint: use a boolean flag
//        */

		boolean found = false;
		
		for(int i=0; i<10; i++) {
			
			int[] numbers = {1, 2,3,4,5,6,7,8,9,10};
			if(numbers [i] == 6) {
				found = true;
				break;
			}
		}
		if(found==true) {
		System.out.println("The array contains the value 6");
	}else {
		System.out.println("The array do not contains the value 6");
	}
	}
}
