package class31019;

public class sum {

	public static void main(String[] args) {
		int sum=0;
		
        for(int i=1; i<=5; i++) {
			sum=sum+i;
			System.out.println(sum);
		}
   
        int sum2=0;
        for(int a=0; a<=100; a+=2) {
	   sum2=sum2+a;
	   System.out.println(sum2);
	   
	   int sumAll=0;
	   for(int y=10; y<=50; y+=10) {
		   sumAll=sumAll+y;
		   System.out.println(sumAll);
	   }
   }
	}

}
