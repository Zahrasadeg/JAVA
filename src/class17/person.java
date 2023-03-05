package class17;

public class person {
    private double bankblance=1230000;
    String address="street 123";
    String name="jhon snow";
    private void password(){
        System.out.println("546789");
    }
    void printssn(){
        System.out.println("123456778");
    }
    public void printtiktok(){
        System.out.println("asdf");
    }

    public static void main(String[] args) {
        person p=new person();
        System.out.println(p.bankblance);
        System.out.println(p.address);
        System.out.println(p.name);

    }
}
