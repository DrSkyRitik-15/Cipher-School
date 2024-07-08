import java.util.Scanner;

public class Lecture23 {
    

//*******************************************************************************

   
    public static void main(String a[]){ 
        /*
        int[] arr1 = {9,14,3,2,43,11,58,22};  
        System.out.println("Before Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort(arr1);//sorting
        System.out.println("After apply Selection Sort");  
        for(int i:arr1){  
            System.out.print(i+" ");  
        }
        */
        
        
        // String 
        /*String name1="Ritik";
        String name2="Ritik";
        
        String name3=new String("Ritik");
        String name4=new String("Ritik");
        
        System.out.println(name1==name2);
        System.out.println(name3==name4);
        System.out.println(name3==name3);
        // String is immutable*/
        //
        //concetation
        /*//==============================================/*
        String ok="Ritik";
        ok=ok+"Kushwaha";
        System.out.println(ok);
        ===============================================
        */
        
        //======================
       /*  String ll=new String("Ritik");
        String GG=new String(" Kushwaha");
        ll=ll.concat(GG);
        System.out.println(ll);*/
//==============================================
//equals function just like ==     
//creating partial string object 
//============================================================
// char arr[]={'e','i','o','d','l','p'};
// String part=new String(arr,1,3);
// System.out.println("The answer"+part);

// ===============================================================
// Upper case
// String name="riittk";
// System.out.println(name.toUpperCase());
//=====================================================

//===============================================================================================================
//Spliting
/*System.out.println("============================================");
System.out.println("6. Splitting");
System.out.println("Pleae enter your full name ");
Scanner sc=new Scanner(System.in);
String name1=sc.nextLine();
String[] name2=name1.split(",");   // dot . is a meta char in regex , so will use in square bracket  "[.]"
for(int i=0;i<name2.length;i++){
    System.out.println(name2[i]+" ");
    }*/




   /* System.out.println("============================================");
    //===============================================================================================================
    Scanner sc=new Scanner(System.in);
String backSlaceString="Hello, I attend \"java\" Class";
String[] name2=backSlaceString.split("\"");   // dot . is a meta char in regex , so will use in square bracket  "[.]"
for(int i=0;i<name2.length;i++){
    System.out.println(name2[i]+" ");
    }
    */



    //Length of a String 
    /*System.out.println("============================================");
    System.out.println("7. Length of a String");
    System.out.println("Please enter your name");
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
    System.out.println("The length of your name is "+name.length());*/
    //============================================



    // inDex of char
    /*System.out.println("============================================");
    System.out.println("8. Index of char");
    System.out.println("Please enter your name");
    Scanner sc=new Scanner(System.in);
    String name=sc.nextLine();
    System.out.println("The index of your name is "+name.indexOf('a'));*/
    


    // -1 is not found sign
    // always come First Occurance
    String name="Rito dnjdc dkn o wncjwc o wdjpoo";
int indexOfO=0;
    while(true){
         indexOfO=name.indexOf('o',0);
         if(indexOfO==-1){
            break;
            }
            System.out.println(indexOfO);
    }



    }


}



