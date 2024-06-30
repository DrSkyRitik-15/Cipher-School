/*class A{
    private int x=10;
    protected int  y=20;
    public int  z=30;
    int p=10;

    
}
/**
 * Lecture13
 
class B extends A{
    void prinnt(){
        //   System.out.println(x); // x has private access in A
          System.out.println(y);
          System.out.println(z);
          System.out.println(p);
    }
}
*/
class OO
{
    private int a=10;
    private int b=15;
    private int c=20;
    private int d=30;
    private int e=35;

    public int getA(){    //getter
        System.out.println("Value of A read ");
        return this.a;
    }
    public int getB(){  //getter
        System.out.println("Value of B read ");
        return this.b;
    }
    public int getC(){
        return this.c;
    }
    public void setA(int a)
    {
        this.a=a;
    }
    public void setB(int b)
    {
        this.b=b;
    }
    public void setC(int b)
    {   if(b>100){
        this.c=b;
        System.out.println("Value is set in C");
    }
    else{
        System.out.println("Value of C is not valid");
    }
    }
}
public class Lecture13 {

    public static void main(String[] args) {
        // B a=new B();
        // a.prinnt();
        OO o=new OO();
        System.out.println(o.getA());   
        System.out.println(o.getB());
        System.out.println(o.getC());
        o.setA(100);
        o.setB(200);
        System.out.println(o.getA());
        System.out.println(o.getB());

        
       
        }
}