/*interface Shape {
    double pi = 3.14; // public static and final
    // pi=5; // error

    double getSquare(double r); // public and abstract
}

class Circle implements Shape {
     void fun() {
        System.out.println("Hey , I am impllement an interface named Shape");
    }

    public double getSquare(double r) {
        return pi * r * r;
    }
}

public class Lecture12 {

    public static void main(String[] args) {
        Circle s1 = new Circle();
        // Shape s2 = new Square();
        s1.fun();
        System.out.println("Area is "+s1.getSquare(5));

    }
}  */
// ///////////////////////////////////////
//Multiple inhertia
interface A {
    int x = 10;

    void fun();

}

interface B {
    int x = 20;

    void fun();
}

class C implements A, B { // multiple inhertance in javv
    public void fun() {
        System.out.println("Hey , I am impllement an interface named Shape");
        System.out.println(A.x);// AMibiguty resolved using fully Qualificaion Name
        System.out.println(B.x);// AMibiguty resolved using fully Qualificaion Name
    }
}
// Method to achive 
/*   
 * interface D extends A,B{
 * void fun();
 * }
 * class E implements D{
 * public void fun(){
 * System.out.println("Hey , I am impllement an interface named Shape");
 * System.out.println(A.x);// AMibiguty resolved using fully Qualificaion Name
 * System.out.println(B.x);// AMibiguty resolved using fully Qualificaion Name
 * }
 * }
 */

/**
 * Lecture12
 */
public class Lecture12 {
    public static void main(String[] args) {
        C c1 = new C();
        c1.fun();
        // System.out.println(c1.x);
    }

}