package class17_2;

public class NestedLoops {

	public static void main(String[] args) {
		
//      for (int i=0; i<=5; i++) {
//      System.out.print(i);
//  }

  /*I want to print pattern
   * 123456789 -->rows =5, columns=9
   * 123456789
   * 123456789
   * 123456789
   * 123456789
   */
  
  for (int i=1; i<=5; i++) {
      
      for (int y=1; y<=9; y++) {
          
          System.out.print(y);//12345
      }
      System.out.println();
  }
  
  /*I want to print pattern
   * 1111111 --> rows=7, columns=7
   * 2222222
   * 3333333
   * 4444444
   * 5555555
   * 6666666
   * 7777777
   */
  
  for (int i=1; i<=7; i++) {
      
      for (int y=1; y<=7; y++) {
          System.out.print(i);//1111111 //2222222
      }
      System.out.println();
  }
  /* I want to print pattern
   * *****
   * *****
   * *****
   * *****
   */
  for(int a=0; a<4; a++) {
	  for (int b=0; b<5; b++) {
		  System.out.print("*");
	  }
	  System.out.println();
}
  /* I want to print pattern
   * 555555
   * 444444
   * 333333
   * 222222
   * 111111
   */
  for (int i=5;i>0;i--) {
	  for(int y=5; y>0; y--) {
		  System.out.print(i);
	  }
	  System.out.println();
  }
	}
}	


