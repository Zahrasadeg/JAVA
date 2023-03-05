package class28;

import java.util.LinkedList;

public class linkedinlists {
    public static void main(String[] args) {
        LinkedList<String>names=new LinkedList<>();
        names.add("artem");
        names.add("alvira");
        names.add("tammana");
        names.add("temmuz");
        names.add("sam");
        System.out.println(names);
        for (String name : names) {
            System.out.println(name);
        }
    }
}
