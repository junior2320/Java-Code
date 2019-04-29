package class30;

import java.util.ArrayList;
//	Create a generic ArrayList that will store 5 names into it.
//	Find out whether the given ArrayList is empty or not?
//	Check whether the specific name is present in an ArrayList or not?
//	Find the size of your arrayList and print all values from that
	
public class ArrayListTask {
public static void main(String[] args) {
        
        ArrayList <String> names=new ArrayList <String>();
        names.add("King");
        names.add("Kain");
        names.add("Able");
        names.add("Junior");
        names.add("Rosa");
        
        System.out.println(names.isEmpty());
        System.out.println(names.contains("Jose"));
        System.out.println(names.size());
        
        for (String a:names) {

        System.out.println(a);
        
        }
    }
}

