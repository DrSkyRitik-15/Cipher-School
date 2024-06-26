// /Abstraction/ 
abstract class Car{  // shoould be     abstract class  when make method in class 
    int maxSpeed;
    abstract void accelerate(); //Only Decleared but not impliment - it is without body
    abstract void brake();
}
class BMW extends Car{
    void accelerate(){
        System.out.println("BMW is accelerating");
        }
        void brake(){
            System.out.println("BMW is braking");
            }
}
/* abstract class BMW extends Car{
    void accelerate(){
        System.out.println("BMW is accelerating");
        }
        
} 
            class BMW2 extends BMW{
    
        void brake(){
            System.out.println("BMW is braking");
            }
} */
public class Lecture11 {
    public static void main(String[] args) {
        /*BMW2 A=new BMW2
         * A.accelerate();
         * A.brake();
         */
        BMW b = new BMW();
        b.accelerate();
        b.brake();
    }
}
