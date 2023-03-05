package class17;

public class task3 {//Create a method that will say Hello
    // in different language based on the country
    // that will passed when method is executed
    String HELLO(String countryName){
        switch (countryName){
            case ("USA"):
                return "Hello";
            case ("kazakistan"):
                return "salem";
            case ("spain"):
                return "hola";
            default:
                return "not supported";

    }}

    public static void main(String[] args) {
        task3 greeting=new task3();
        System.out.println(greeting.HELLO("USA"));
    }




}
