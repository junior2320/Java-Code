package class31019;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		for (int i=0; i<5; i++) {
			if(i==2) {
				continue;
			}
			System.out.println(i);
		}
		for(int a=0; a<=10; a++) {
			
			if(a==2 || a==3) {
				continue;
			}
				System.out.println(a);
			}
		
	//I want to print number from 1 to 20 but skip those that divisible by3*
		for(int b=1; b<=20; b++) {
			if(b%3==0) {
				continue;
			}
			System.out.println(b);
		}
	}
	
	}


