package class17;

public class task2 {

	
		
	void palindrome(String str) {
	    char[]array =str.toCharArray();
	    String reverse="";
	    for (int i=str.length()-1;i>=0;i--) {
	        reverse=reverse+array[i];
	    }
	    if (reverse.equalsIgnoreCase(str)) {    
	        System.out.println(str+" String is polindromec ");
	    }else {
	        System.out.println(str+ " String is not polindromic");
	    }
	    }
	    
	}
	


