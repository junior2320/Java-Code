package class17_2;

public class clock {

		public static void main(String[] args) {
			
			clock clock1=new clock();
			clock1.printNumber();
		
            //24 hours, 60 minutes
		}
		
		void printNumber() {
        for (int h=0; h<24; h++) {
            
            for (int m=0; m<60; m++) {
                
                if (m<10) {
                    System.out.println(h+":0"+m);
                }else {
                    System.out.println(h+":"+m);
                }
                
            }
        }
		}

	}


