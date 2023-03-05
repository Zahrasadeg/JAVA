package class19;

public class bankAcount {
    long acountnumber;
    double money;

    void deposite(){
        System.out.println("Deposit method from bank account class");
    }

}



class checking extends bankAcount{
    double interest;
    void transfer(){
        System.out.println("transfer method from checking account");
    }
}
class saving extends bankAcount{
    double proift;
    void takeprofit(){
        System.out.println("profit method from saving class");
    }
}