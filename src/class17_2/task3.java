package class17_2;

public class task3 {

	public static void main(String[] args) {
		/*print the following pattern:
		 * 1
		 * 12
		 * 123
		 * 1234
		 * 12345
		 */
		
		for(int i=1; i<=5; i++) {
			for(int k=1; k<=i; k++) {
		System.out.print(k);}
		System.out.println();
		}
		
	 for (int c=5; c>=1; c--) {
        
        for (int d=1; d<=c; d++) {
    
        System.out.print(d);
        }System.out.println();
	}
	}
}
