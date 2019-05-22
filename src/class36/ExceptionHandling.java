package class36;

public class ExceptionHandling {

	public static void main(String[] args) {
		
       System.out.println("Begining of the code");
       
       try {
        Thread.sleep(2000);//object of exception might be thrown (new interruptedException)
	}catch(InterruptedException e) {
		System.out.println("Iam a catch block code");
		e.getMessage();
	}
       System.out.println("The end of the program");
      // InterruptedException e = new InterruptedException();
       //Exception e =new InterruptedException()
	}
}
