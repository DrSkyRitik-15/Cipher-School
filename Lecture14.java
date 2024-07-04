/**
 * Lecture14
 */

public class Lecture14 {

    static void print(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
                 System.out.print(arr[i]+" ");
             }
             System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        /////////////////////////////////////////////////
        print(arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;

        }
        print(arr);

        //2.  Array initilizer

        int arr2[]={1,5,6};
        print(arr2);

        
    }
}