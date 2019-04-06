package Homework;

public class class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
	    int y = 20;
	    
	    String a = "Hello";
	    String b = "Bye";
	    
	    System.out.println(x+y+a+b);//30HelloBye
	    System.out.println(x+a+y+b);//10Hello20Bye
	    System.out.println(x+a+b+y);//10HelloBye20
	    System.out.println(a+b+x+y);//HelloBye1020
	    System.out.println(a+b+(x+y));//HelloBye30;
	    
	    //PEMDAS = Parentheses, Exponents, Multiplication/Division, Addition/Subtraction
	    
	    int o=10;
	    int p=3;
	    
	    int div=o/p;
	    
	    System.out.println(div);//3 or 3.3
	    
	    //modulus operator
	    int q = 101;
	    int u = 10;
	    int mod = q%u;
	    System.out.println(mod);
	    
	    int e = -5 + 4*6;
	    System.out.println(e);//19
	    
	    int t =(22+9) % 7;
	    System.out.println(t);//3
	    
	    int k = 20+ -3*5/8;
	    System.out.println(k);//19
	    
	    int z = 5+ 15/3 * 2 - 8 % 3;
	    System.out.println(z);//13
	    
	    
	    
	    
	    
	    
	}

}
