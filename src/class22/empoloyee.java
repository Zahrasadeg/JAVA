package class22;

public class empoloyee {
    String name;
    int basesalary=30000;
    int baseholiday=10;
    void printsalary(){
        System.out.println(basesalary);
    }
    void printholiday(){
        System.out.println(baseholiday);
    }
}
class officeboy extends empoloyee{

}
class manager extends empoloyee{
    void printsalary(){
        System.out.println((basesalary*4)+200000);
    }
    void printholiday(){
        System.out.println(baseholiday+5);
    }
}