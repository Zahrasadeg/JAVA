package class17;

public class task5 {//Create a method that will take a String as a parameter
    // and returns reversed String. Method should be available to
    // all classes within your project and accessible by class name
    public String write(String a){
        StringBuilder ad=new StringBuilder(a);
        ad.reverse();
        return ad.toString();
    }

    public static void main(String[] args) {
        task5 ab=new task5();
        System.out.println(ab.write("hasti"));
    }


}
