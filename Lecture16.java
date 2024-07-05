// multi dimenssion Array

public class Lecture16 {
    public static void main(String[] args) {
        int row = 5;
        int col = 3;
        int[][] arr = new int[row][col];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        //Array intializer
        //123
        // 456
        //789
        int[][] arr2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
            };
            for (int i = 0; i < arr2.length; i++) {
                for (int j = 0; j < arr2[0].length; j++)
                System.out.print(arr2[i][j] + " ");
                System.out.println();
                }
                }
                
    }

