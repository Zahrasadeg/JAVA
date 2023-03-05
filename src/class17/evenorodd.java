package class17;

public class evenorodd {// Create a method that will take a number
    // and prints whether the number is even or odd

    String Evenodd (int a){
        if(a%2==0){
            return "even";
        }else{
            return "odd";
        }
    }

    public static void main(String[] args) {
        evenorodd mp=new evenorodd();
        System.out.println(mp.Evenodd(17));
    }}