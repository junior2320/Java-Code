package class33;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicate {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<String> aList=new ArrayList<>();
        
       aList.add("John");
       aList.add("Jane");
       aList.add("James");
       aList.add("Jasmine");
       aList.add("Jane");
       aList.add("James");

       for(int i=0;i<aList.size();i++) {
           if( aList.contains(aList.get(i))) {
               aList.remove(i);
           }
       }
     System.out.println(aList);
    }
}