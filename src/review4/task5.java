package review4;

public class task5 {

	public static void main(String[] args) {
		
//		* Write a program to sum the values of an array
//		1, 2, 3, 4, 5, 6, 7, 8, 9, 10
//		int sum=0;
//		int[] numbers={1,2,3,4,5,6,7,8,9,10};
//		for(int a=0; a<numbers.length; a++) {
//			sum=sum+numbers[a];
//		}
//		System.out.println("The sum of the values of an array = "+sum);
//	}

	int [] numbers = {1,2,3,4,5,6,7,8,9,10};
	int [] numbers1= new int[10];
	
	int sum = 0;
	
	for(int i=0;i<numbers.length; i++) {
	
		//sum=sum +number[i]
		
	sum+=numbers[i];
}
     System.out.println("The sum of all array elements = "+sum);
     }
     }
     
     
    
     