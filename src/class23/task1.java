package class23;

public class task1 {//Create a class CreditCard and define variable balance and interest.
    // Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.
}
class cridetcard {
    double balance;
    double intrest;

    public cridetcard(double balance, double intrest) {
        this.balance = balance;
        this.intrest = intrest;
    }

    public void calculateintrest() {
        System.out.println("intrest " +(balance+intrest)/100);
    }
}
class visa extends cridetcard{
    public visa(double balance, double intrest) {
        super(balance, intrest);
    }

}
class AX extends cridetcard{


    AX(double balance, double intrest) {
        super(balance, intrest);
    }@Override
    public void calculateintrest() {
        System.out.println("intrest "+(balance*intrest/100)+30);
    }
}



