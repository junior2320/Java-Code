package pack1;

public class Calculator {
	
	public static int sum(int a, int b, int c) {
		int sum=a+b+c;
		return sum;
		
	}
	public static int avg(int a, int b, int c) {
		int avg=(a+b+c)/3;
		return avg;
	}
	public static int max(int a, int b, int c) {
		int max=0;
		if(a>b && a>c) {
		   max=a;
			
		}else if(b>a && b>c) {
		   max=b;
		}else {
			max=c;
		}return max;
		
	}
	public static int min(int a, int b, int c) {
		int min=0;
		if(a<b && a<c) {
		   min=a;
			
		}else if(b<a && b<c) {
		   min=b;
		}else {
			min=c;
		}return min;
		
	}
	public static void main(String[] args) {
		System.out.println(Calculator.sum(10, 45, 9));
		System.out.println(Calculator.min(-9, -8, -22));
		System.out.println(Calculator.avg(10, 25, 35));

	}
}
