package Saturday32319;

public class task3 {

	public static void main(String[] args) {
		//create an array of integers and find largest number
		
		int[] number= {19,27,36,44,59};
		
		int max=number[0];
		
        for(int i=0;i<number.length;i++) {
        	
            if(number[i]>max) {    //interview question
                max=number[i];
            }
        }
        System.out.println("The max number is "+max);

	}

}
