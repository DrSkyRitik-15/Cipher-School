//jaggedArrays

import java.util.Scanner;

public class Lecture17 {

    static void printArray(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[3];
        jaggedArray[1] = new int[2];
        jaggedArray[2] = new int[3];

        // print the jaggedarray
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        int arr2[][] = new int[3][];

        /*
         * arr2[0]={1,2,3};//we cannot use initializer list here because its doesn't
         * create an object
         * arr2[1]={1,2};
         * arr2[2]={1,2,3};
         */

        // Anamonus ARray
        arr2[0] = new int[] { 1, 2, 3 };
        arr2[1] = new int[] { 1, 2 };
        arr2[2] = new int[] { 1, 2, 3 };

        printArray(arr2);


        //Sacnner 
        Scanner sc=new Scanner(System.in);
        System.out.println("Pllease Enter your name... ");
        String name=sc.nextLine();
        String name2=sc.next();// It will take input till a space Occurs
        System.out.println("Name is ... "+name);
        System.out.println("Name is ... "+name2);

        // System.out.println("Enter your proffesion ");
        // Take mixed input 
        System.out.println("Enter the house number ... ");
        int number = sc.nextInt();

    }
}


