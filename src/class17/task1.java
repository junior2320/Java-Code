package class17;

public class task1 {

	public static void main(String[] args) {
   //Create a method that will take a number and prints 
		//whether the number is even or odd
		
		  task1 num=new task1 ();
		 num.oddOrEven(3);
		 

		}
		void oddOrEven(int num) {
			if(num%2==0) {
				System.out.println(num+" is Even");
			}else if(num%2==1) {
			
				System.out.println(num+" is Odd");
			}
		}


	}


