
public class Lecture15 {
     static  void passingKey(int x)
     {
         x=x+1;
     
     }

    static void print(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
                 System.out.print(arr[i]+" ");
             }
             System.out.println();
    }

    static void addOneInArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+1;
        }
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
        // int arr[] -> Decleation of expresion
        // arr=new int [size]; creating a Object 
        int arr2[]={1,5,6};
        print(arr2);
        //========================================================================================
// if i want to copy all elemnt 
/*System.out.println("---------------------------------------");
int copyArray[]=new int[2*arr2.length];
for (int i = 0; i < arr2.length; i++) {
    copyArray[i]=arr2[i];
    }
    copyArray[3]=5;
    
    print(copyArray); */
    //====================================================================================
    
    
    System.out.println("---------------------------------------");
    //passingKey   
        int x=10;
        passingKey(x); // pass by value that why not change the main X
        System.out.println(x);  // here having differnt stack memory

        int arr3[]={1,1,2,2,3};
        addOneInArray(arr3);// // here copy of referance as Value
        print(arr3);
    }
}