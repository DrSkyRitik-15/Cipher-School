class parent {
    void fun() { // method Overridding
        System.out.println("Hi i am A");
    }
}

class child extends parent {
    @Override
    void fun() { // method Overridding
        System.out.println("Hi i am B");
    }


void fun(int a) {
    System.out.println("This is Overloading " + a);
}
}

public class Lecture9_2 {
    public static void main(String[] args) {
        child c = new child();
        c.fun();
        c.fun(10);
    }
}
