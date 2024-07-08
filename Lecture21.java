

*******************************************************************************/
public class Main {  
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length ; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
       
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
        String name1="Ritik";
        String name2="Ritik";
        
        String name3=new String("Ritik");
        String name4=new String("Ritik");
        
        System.out.println(name1==name2);
        System.out.println(name3==name4);
        System.out.println(name3==name3);
        // String is immutable
        //
        //concetation
        /*//==============================================/*
        String ok="Ritik";
        ok=ok+"Kushwaha";
        System.out.println(ok);
        ===============================================
        */
        
        //======================
        String ll=new String("Ritik");
        String GG=new String(" Kushwaha");
        ll=ll.concat(GG);
        System.out.println(ll);
//==============================================
//equals function just like ==     
    }
}

