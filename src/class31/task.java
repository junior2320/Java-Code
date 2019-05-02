package class31;


//	1.Create an arraylist of cars and retrieve all the values using 4 different ways.
//
//	2.Create an arrayList of words. Remove every word that ends with “e”.
//
//	3.Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
//
//	4.Create an arrayList of even numbers from 1 to 50. Using Integer remove any number that is divisible by 5 from that arrayList.
	
	
			import java.util.ArrayList;
			import java.util.Iterator;
                public class task {
			
			    public static void main(String[] args) {

			        ArrayList<String> cars = new ArrayList<String>();

			        cars.add("Toyota");

			        cars.add("M&B");

			        cars.add("BMW");

			        cars.add("Honda");
			        System.out.println("--- for loop ---");

			        for (int i = 0; i < cars.size(); i++) {

			            System.out.println(cars.get(i));
			        }
			        System.out.println("--- advance for loop ---");

			        for (String models : cars) {

			            System.out.println(models);
			        }
			        System.out.println("--- using iterator ---");
			        Iterator<String> models = cars.iterator();
			        while (models.hasNext()) {
			            System.out.println(models.next());
			        }
			        System.out.println("--- using while loop ---");
			        int i = 0;
			        while (i < cars.size()) {
			            System.out.println(cars.get(i));
			            i++;
			        }
			    }
			}


