package sunday32419;

public class StringManipulations {

	public static void main(String[] args) {
		//Length function/or method 
		String str="Syntax";
		
		int lengthOfString=str.length();
		System.out.println("lengthOfString");
		
		String str1="Syntax Technologies";
		
		int lengthOf2String=str1.length();
		System.out.println("lengthOf2String");
		
		String str2="Welcome, student!";
		System.out.println(str2.length());
         //toUpperCase() -> convert all character to UpperCase
		// toLowerCase() -> convert all character to LowerCase
		
		String str3="Hello";
		
		String newString=str3.toUpperCase();
		System.out.println(newString);
		
		String lowerCaseString=newString.toLowerCase();
		System.out.println(lowerCaseString);
		
		//
		String str4="Hello";
		String str5="Hello";
		
		boolean equality=str4.contentEquals(str5);
		System.out.println(equality);
		
		String expectedBrowser="Chrome ";
		String actualBrowser="chrome ";
		
		boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);
		System.out.println(equals);
	}

}
