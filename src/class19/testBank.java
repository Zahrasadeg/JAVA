package class19;

public class testBank {
    public static void main(String[] args) {
        bankAcount ba=new bankAcount();
        ba.acountnumber=23456767;
        ba.money=1000;
        ba.deposite();
        System.out.println(ba.acountnumber);
        System.out.println(ba.money);

        System.out.println("-------creating an object");
        checking check=new checking();
        check.acountnumber=34567;
        check.money=2343245;
        check.interest=0;

        check.deposite();

        check.transfer();
        saving sa=new saving();
        sa.acountnumber=23456;
        sa.takeprofit();







    }
}
