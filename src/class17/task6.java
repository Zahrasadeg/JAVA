package class17;

public class task6 {// Create a method that will accept a String as a parameter and
    // return a new String that consist only of vowels.
    // Method should be available inside the class only where
    // it was declared and executed by calling it is name.
    private String parameter(String a) {
        String newa=a.replaceAll("[^iouea]","");
        return newa;
}

    public static void main(String[] args) {
        task6 sa=new task6();
        System.out.println(sa.parameter("utaFB6YHGFVeuijnmbvcxzlkjhgfdoiuyt"));
    }}
