package class17;

public class syntexemployee {
    String empid;
    double salary;
    static String CEO="Sumair";

    public static void main(String[] args) {
        syntexemployee se=new syntexemployee();
        se.empid="123";
        se.salary=4500;

        syntexemployee se1=new syntexemployee();
        se1.empid="9876";
        se1.salary=5000;
        System.out.println(se.empid);
        System.out.println(se.salary);
        System.out.println(se.CEO);


    }

}
