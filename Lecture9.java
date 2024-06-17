class Shape{
    double pi=3.14;
    double getSquare(double r)
    {
        return r*r;
    }
}
class Area extends Shape{
    void squre(double r)
    {
        System.out.println("The area is "+pi*getSquare(r));
    }
}
public class Lecture9 extends Area{
    String name;
    int rollNum;
   
    public static void main(String[] args) {
        Lecture9 S1 = new Lecture9();
        Lecture9 S2 = new Lecture9();

        S1.name="Ritik";
        S1.rollNum=1;
        S2.name="Rahul";
        S2.rollNum=2;

        System.out.println("S1 = name "+ S1.name);
        System.out.println("S1 = name "+ S1.rollNum);
        System.out.println("S1 = name "+ S2.name);
        System.out.println("S1 = name "+ S1.rollNum);

        Lecture9 AAA=new Lecture9();
        AAA.squre(2.30);


}
}
