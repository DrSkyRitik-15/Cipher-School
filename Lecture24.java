 import java.util.Scanner;

public class Lecture24 {
    

//*******************************************************************************

   
    public static void main(String a[]){ 
    // SubString
   /*  String str = "Hello World";
    String sub = str.substring(6, 11);
    System.out.println(sub);
    // SubString
    String str2 = "Hello World";
    String sub2 = str2.substring(6);
    System.out.println(sub2);
    // SubString
    String str3 = "Hello World";
    String sub3 = str3.substring(1, 5); // first index include , ending index exclude 
    System.out.println(sub3); */


    //find character at a given index
    /*String name = "Hello World";
    System.out.println("==============================================");
    System.out.println("Find index a character index");
    System.out.println(name.charAt(4));
    System.out.println(name.charAt(5));
    System.out.println(name.charAt(6));


    char arr[]=name.toCharArray();
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }

//blank String is not empty  but empty is blank String 
*/

//=================================================================================================
//Compaing String
// lexigraphic

String one="Hey!";
String two="Bye";
System.out.println(one.compareTo(two)); // comapre by charcter by character
System.out.println(one.compareTo(one)); // zero

// Triming white spaces
// String three="   Hello World   ";
String three="   Hello World   ritik    okkkkk    ";
System.out.println(three.trim());   



      
    }



    }



    

