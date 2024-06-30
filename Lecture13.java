class A{
    private int x=10;
    protected int  y=20;
    public int  z=30;
    int p=10;

    
}
/**
 * Lecture13
 */
class B extends A{
    void prinnt(){
        //   System.out.println(x); // x has private access in A
          System.out.println(y);
          System.out.println(z);
          System.out.println(p);
    }
}
public class Lecture13 {

    public static void main(String[] args) {
        B a=new B();
        a.prinnt();
        
       
        }
}