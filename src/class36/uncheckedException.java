package class36;

public class uncheckedException {

	public static void main(String[] args) {
		
		int[]array= {12,13,12};
		System.out.println(array[3]);//ArrayIndexOutOfBoundsException
		
		String a="Hello";
		System.out.println(a.charAt(5));//StringIndexOfBoundsException
		
		String str=null;
		System.out.println(str.length());//NullPointerException

	}

}
