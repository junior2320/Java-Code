package review4;

public class task2 {

	public static void main(String[] args) {
		
//		 /**
//	        * Write a program that prints the following pattern
//	        *
//	        * ....1
//	        * ...22
//	        * ..333
//	        * .4444
//	        * 55555
//	        *
//	        */
		
		

    	for (int a=1; a<=5; a++) {
    		for (int b=5; b>0; b--) {
    			if(b<=a) {
    			   System.out.print(a);
    			}else {
    			   System.out.print(".");
    	}
    		}System.out.println();
		
//		for(int i =1; i<=5; i++) {
//			for (int k = 1; k<=(5-i); k++){
//				System.out.print(".");
//    		}
//			for(int l=1; l<=i; l++) {
//				System.out.print(i);
//			}
//			System.out.println();
    	}
	}
}