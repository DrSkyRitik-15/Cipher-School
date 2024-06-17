public class Lecture3 { // specifier
    public static void main(String[] args) { // main function

        int x = 5;
        int y = 7;
        System.out.println("X is =  " + x);
        System.out.println("Y is =  " + y);

        byte b = 10;
        System.out.println("B is " + b);

        // byte j=129;
        // System.out.println("J is "+j); // error because byte range is -128 to +128-1=127
       byte j = (byte) 129;
        System.out.println("J after type casting narrowing  is " + j); // -127 circle after 127 number goes negative
                                                                        // side
       byte v = (byte) 128;
        System.out.println("V after type casting narrowing  is " + v); // -128 circle after 127 number goes negative
                                                                        // side

        int k = b;
        System.out.println("K is = " + k);

    }

}