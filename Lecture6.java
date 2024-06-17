public class Lecture6 {
    int roll;
    String name;
    int age;

    public static void main(String[] args) {
        Lecture6 obj1 = new Lecture6();
        obj1.roll = 1;
        obj1.name = "Rahul";
        obj1.age = 20;
        System.out.println("Roll: " + obj1.roll + " \nName: " + obj1.name + " \nage: " + obj1.age);

        System.out.println("After making Second Object  S1 make equal to Object 1 ");
        System.out.println("========================================================");

        Lecture6 S1 = new Lecture6();
        S1 = obj1;
        System.out.println("Roll: " + S1.roll + " \nName: " + S1.name + " \nage: " + S1.age);

        
        S1 = null; // Exception in thread "main" java.lang.NullPointerException: Cannot read field
                   // "roll" because "<local2>" is null
        // at Lecture6.main(Lecture6.java:21)
        System.err.println("S1 making Null -------------");
        System.out.println("Roll: " + S1.roll + " \nName: " + S1.name + " \nage: " + S1.age);

    }
}
