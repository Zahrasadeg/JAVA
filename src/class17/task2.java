package class17;

public class task2 {
    //Create a method that will print whether given String is palindrome or not.
    // we class17.revers and got the same result
    void write(String str) {

        StringBuilder st = new StringBuilder(str);
        st.reverse();
        String reversedstr = st.toString();
        if (str.equals(reversedstr)) {
            System.out.println(str + " is palindorm");
        } else {
            System.out.println(str + " is not palindorm");
        }
    }

    public static void main(String[] args) {
        task2 oo=new task2();
        oo.write("sosha");

    }
}
