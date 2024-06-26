// class loan{
//     int rate ;
//     loan(){
//         System.err.println("Hi , i am default Constructor of loan");
//     }
//     loan(int rate){
//         this.rate = rate;
//     }
//     void printRate(){
//         System.out.println("Rate is : "+rate); //or this.rate
//     }
// }
// class carloan extends loan{
//     int rate ;
//     carloan(){
//         System.out.println("Hi , i am child default constructor of carloan");
//         System.out.println(super.rate);  //using super to access instance varialble of parent class.
//     }
//     carloan(int rate){
//         super(7);  // To invoke the constructor  of parent class(must be 1st line of chile construtor)
//         this.rate = rate;
//         }
//         void printRate(){
//             System.out.println("Rate is : "+this.rate); //or this.rate
//             super.printRate();
//             System.out.println(super.rate);
//         }
//     }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//final

class A{
    final int x=5; // Final variable - Value Once assing cannot changed 
  // Or assing in consturutor
    final int Y;
    A(){      
        Y=10;
    }

    final void fun(){      
        System.out.println("Hi , i am A");
    }
}
class B{
   /*  void fun(){  // cannot overrride this function
        System.out.println("Hi , i am B");
        }*/
}
public class Lecture10 {
    public static void main(String[] args) {
        // carloan C1=new carloan();
        // carloan C2=new carloan(10);
        // C2.printRate();
    }
}
