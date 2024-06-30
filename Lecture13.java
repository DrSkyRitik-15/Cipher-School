class A{
    private int x=10;
    protected int  y=20;
    public int  z=30;
    int p=10;

    
}
/**
 * Lecture13
 */
public class Lecture13 {

    public static void main(String[] args) {
        A a=new A();
        // System.out.println(a.x); // x has private access in A
        System.out.println(a.y);
        System.out.println(a.z);
        System.out.println(a.p);
        }
}