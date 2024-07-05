//taking Array Input
import java.util.*;

public class Lecture18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Ay=rry ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        // take the element in the input
        for(int i=0;i<n;i++){
            System.out.println("Plase Enter ");
            arr[i]=sc.nextInt();
    }
    // print the array
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
        }
        

}

}
