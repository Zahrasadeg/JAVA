package class17;

public class revers {
    //create a method that takes a class17.revers a string
    String reverseStr(String input) {
        String newstr = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            newstr += input.charAt(i);
        }return newstr;
    }
}



