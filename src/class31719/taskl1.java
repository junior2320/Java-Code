package class31719;

public class taskl1 {

	public static void main(String[] args) {
		//1.Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).

           char[] array= {'A','B','C','D','E','F'};
        
              System.out.println(array[0]);
              
              
              char[]list1=new char[6];
              list1[0]='A';
              list1[1]='B';
              list1[2]='C';
              list1[3]='D';
              list1[4]='E';
              list1[5]='F';
              
              System.out.println(list1[3]);
              //////////////////////////////////////////////
              
              //2.Create an array of names and store all names of your group.
              //Then print your name from that array. (use 2 different ways of creating an array).
              
              String[] names= {"Danny", "Ozkancil","Kenny","Omer","Nelson"};
              
              System.out.println(names[3]);
              
              String[] name=new String[5];
              
              name[0]="Danny";
              name[1]="Ozkancil";
              name[2]="Kenny";
              name[3]="Omer";
              name[4]="Nelson";
              
              System.out.println(name[0]);
              
              
              ///////////////////////////////////////////////
              
              //3.Create an array of words: Java, Saturday, day, coding, is. 
              //Print the following sentence using element of array: “Saturday is Java coding Day”. 
                     
              String[] word = {"Java", "Saturday","day","coding","is"};
              
              System.out.println(word[1]+" "+word[4]+" "+word[0]+" "+word[3]+" "+word[2]);
              
              String[] words = new String[5];
              
              words[0]="Java";
              words[1]="Saturday";
              words[2]="day";
              words[3]="coding";
              words[4]="is";
              
              System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
              
                  }
              	}


