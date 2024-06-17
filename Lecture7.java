import java.util.Scanner;
// control flow and Switch case
public class Lecture7 {
    String name;
    String color;
    int year;
    int maxSpeed;

    void Apple() {
        System.out.println("Car having booster engine");

    }

    boolean Speed() {
        if (maxSpeed >= 150) {
            return true;
        } else {
            return false;

        }
    }

    public static void main(String[] args) {
        Lecture7 myCar = new Lecture7();
        Lecture7 SecCar = new Lecture7();

        System.out.println(myCar.name); // null
        System.out.println(myCar.color); // null
        System.out.println(myCar.year); // 0
        System.out.println(myCar.maxSpeed);// 0

        System.out.println("==================================");
        myCar.name = "BMW";
        myCar.color = "Red";
        myCar.year = 2022;
        myCar.maxSpeed = 250;

        System.out.println(myCar.name);
        System.out.println(myCar.color);
        System.out.println(myCar.year);
        System.out.println(myCar.maxSpeed);
        SecCar.name = "Audi";
        SecCar.color = "Brown";
        SecCar.year = 2028;
        SecCar.maxSpeed = 140;

        System.out.println(myCar.Speed());// true
        System.out.println(SecCar.Speed()); //false

        System.out.println("Switch case =====================");

        Scanner sc=new Scanner(System.in);

        char a='c';
        switch (a) {
            case 'c':
                System.out.println("Yes it is c");
                break;
                case 'b':
                System.out.println("Yes it is c");
                break;
        
            default:
                break;
        }

    }

}
